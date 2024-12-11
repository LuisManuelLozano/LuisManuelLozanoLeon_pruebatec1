package org.example;
import org.example.logica.ControladoraLogica;
import org.example.logica.Empleado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        int prog = 1;
        ControladoraLogica control = new ControladoraLogica();
        Scanner scanner = new Scanner(in);
        while (prog != 0) {
            try {
                //Menú de acciones
                out.println("INTRODUZCA EL NÚMERO DE LA OPCIÓN QUE DESEA ELEGIR: ");
                out.println("1-Crear Empleado. ");
                out.println("2-Listar todos los empleados. ");
                out.println("3-Filtrar empleados por cargo. ");
                out.println("4-Eliminar un empleado. ");
                out.println("5-Editar un empleado. ");
                int menu = scanner.nextInt();
                scanner.nextLine();
                try {
                    if (menu < 1 || menu > 5) {
                        throw new OpcionInvalidaException("Opción inválida. Elija un nº entre 1 y 5");
                    }
                    //Selección de acciones
                    switch (menu) {
                        case 1:
                            // Crear un empleado.
                            boolean bnombre = false;
                            String nombreC ="";
                            while (!bnombre) {
                                System.out.println("Introduzca el nombre: ");
                                nombreC = scanner.nextLine();
                                if (!nombreC.isEmpty()) {
                                    bnombre = true;
                                } else {
                                    out.println("el campo nombre está vacío");
                                }
                            }
                            boolean bapellido = false;
                            String apellidoC ="";
                            while (!bapellido) {
                                System.out.println("Introduzca el apellido: ");
                                apellidoC = scanner.nextLine();
                                if(!apellidoC.isEmpty()){
                                    bapellido = true;
                                }else{
                                    out.println("el campo apellido está vacío");
                                }
                            }
                            boolean bcargo = false;
                            String cargoC ="";
                            while (!bcargo) {
                                System.out.println("Introduzca el cargo: ");
                                cargoC = scanner.nextLine();
                                if (!cargoC.isEmpty()) {
                                    bcargo = true;
                                } else {
                                    out.println("el campo cargo está vacío");
                                }
                            }
                            double salarioC =0;
                            boolean salarioValido = false;
                            while (!salarioValido) {
                                System.out.println("Introduzca el salario: ");
                                try {
                                    salarioC = scanner.nextDouble();
                                    scanner.nextLine();
                                    if (salarioC != 0.0) {
                                        salarioValido = true;
                                    }else{
                                        out.println("Debes introducir alguna cantidad en el salario");
                                    }
                                } catch (InputMismatchException e) {
                                    out.println("Entrada no válida, debe introducir valor numérico. Salimos del programa.");
                                    scanner.nextLine();
                                }
                            }
                            boolean bfecha =false;
                            while (!bfecha) {
                                System.out.println("Introduzca la fecha de inicio en la empresa:  (formato: yyyy/mm/dd) ");
                                String fechaComoTexto = scanner.nextLine();
                                SimpleDateFormat sdfC = new SimpleDateFormat("yyyy/MM/dd");
                                sdfC.setLenient(false);
                                Date fechaC;
                                try {
                                    fechaC = sdfC.parse(fechaComoTexto);
                                    Empleado empleado = new Empleado(1L,nombreC, apellidoC, cargoC, salarioC, fechaC);
                                    control.crearEmpleado(empleado);
                                    out.println("empleado creado exitosamente (Intro para continuar)");
                                    scanner.nextLine();
                                    out.printf("el empleado creado es: " + empleado.toString() + "(Intro para continuar.)");
                                    scanner.nextLine();
                                    bfecha = true;
                                } catch (ParseException e) {
                                    out.printf("formato de fecha inválido");
                                    scanner.nextLine();
                                }
                            }
                            break;
                        case 2:
                            //Listar todos los empleados
                            ArrayList<Empleado> listaEmpleados = control.traerEmpleados();
                            out.println("------------------------LISTADO DE TODOS LOS EMPLEADOS -----------------------------");
                            for (Empleado emp : listaEmpleados) {
                                out.println("El empleado es: " + emp.toString());
                            }
                            out.println("------------------------------------------------------------------------------------");
                            break;
                        case 3:
                            // Filtrar empleados por cargo
                            boolean banderaFc = false;
                            while(!banderaFc) {
                                out.println("Introduzca el cargo por el quiere filtrar el listado de empleados:");
                                String cargo = scanner.nextLine();
                                if (cargo.isEmpty()){
                                    out.println("el cargo está vacío, debe introducir uno");
                                }else{
                                out.println("--------------LISTADO DE LOS EMPLEADOS POR EL CARGO SELECCIONADO -------------------");
                                ArrayList<Empleado> listaEmpleadosCargo = control.traerEmpleados();
                                for (Empleado emp : listaEmpleadosCargo) {
                                    if (emp.getCargo().equalsIgnoreCase(cargo)) {
                                        out.println("El empleado es: " + emp.toString());
                                        banderaFc = true;
                                    }
                                }
                                }
                                out.println("------------------------------------------------------------------------------------");
                            }
                            break;
                        case 4:
                            //Eliminar un empleado
                            boolean banderaE =false;
                            while(!banderaE) {
                                out.println("Introduzca el id del empleado que quiere eliminar de la listado de empleados: ");
                                Long idElim = scanner.nextLong();
                                scanner.nextLine();
                                Empleado empleadoElim = control.traerEmpleado(idElim);
                                if (empleadoElim != null) {
                                    out.println("¿desea eliminar los datos de este empleado? (S/N): " + empleadoElim.toString());
                                    String sinoElim = scanner.nextLine();
                                    if (sinoElim.equalsIgnoreCase("S")) {
                                        out.println("el empleado eliminado es: " + empleadoElim.toString());
                                        control.eliminarEmpleado(idElim);
                                        banderaE = true;
                                    } else {
                                        out.println("Los datos de este empleado no han sido eliminados" + empleadoElim.toString());
                                    }
                                } else {
                                    out.println("Empleado no encontrado");
                                }
                            }
                            break;
                        case 5:
                            //Editar a un alumno
                            int bandera = 1;
                            out.println("introduzca el id del empleado que desea editar: ");
                            Long idedit = scanner.nextLong();
                            scanner.nextLine();
                            Empleado empleado = control.traerEmpleado(idedit);
                            if (empleado != null) {
                                while (bandera != 0) {
                                    out.println("¿desea editar los datos de este empleado? (S/N): " + empleado.toString());
                                    String sinoedit = scanner.nextLine();
                                    if (sinoedit.equalsIgnoreCase("S")) {
                                        out.println("qué campo desea editar? Teclee el número que corresponda al cargo que desea editar: ");
                                        out.println("1 - Nombre, 2 - Apellidos, 3 - Cargo, 4 - Salario, 5 - Fecha de Inicio");
                                        int campo = scanner.nextInt();
                                        scanner.nextLine();

                                        switch (campo) {
                                            case 1:
                                                boolean banderaNed = false;
                                                while (!banderaNed) {
                                                    out.println("introduzca el nuevo nombre del empleado: ");
                                                    String nomb = scanner.nextLine();
                                                    if (nomb.isEmpty()) {
                                                        out.println("El nombre está vacío, debe introducir otro");
                                                    } else {
                                                        empleado.setNombre(nomb);
                                                        control.editarEmpleado(empleado);
                                                        banderaNed = true;
                                                    }
                                                }
                                                break;
                                            case 2:
                                                boolean banderaAed = false;
                                                while (!banderaAed){
                                                out.println("introduzca el nuevo apellido del empleado: ");
                                                String apell = scanner.nextLine();
                                                if (apell.isEmpty()){
                                                    out.println("El apellido está vacío. Debe introducir otro");
                                                }else {
                                                    empleado.setApellido(apell);
                                                    control.editarEmpleado(empleado);
                                                    banderaAed = true;
                                                }
                                                }
                                                break;

                                            case 3:
                                                boolean banderaCed = false;
                                                out.println("introduzca el nuevo cargo del empleado: ");
                                                String nuevoCargo = scanner.nextLine();
                                                while (!banderaCed){
                                                    if (nuevoCargo.isEmpty()){
                                                        out.println("El cargo está vacío. Debe introducir otro.");
                                                    }else {
                                                        empleado.setCargo(nuevoCargo);
                                                        control.editarEmpleado(empleado);
                                                        banderaCed = true;
                                                    }
                                                }
                                                break;

                                            case 4:
                                                double salario =0.0;
                                                boolean salarioVal =false;
                                                while (!salarioVal) {
                                                    out.println("introduzca el nuevo salario del empleado: ");
                                                    try {
                                                        salario = scanner.nextDouble();
                                                        scanner.nextLine();
                                                        empleado.setSalario(salario);
                                                        control.editarEmpleado(empleado);
                                                        salarioVal = true;
                                                    } catch (InputMismatchException e) {
                                                        out.printf("el salario introducido debe ser numérico");
                                                    }
                                                }
                                                break;

                                            case 5:
                                                Boolean banderaF = false;
                                                while(!banderaF) {
                                                    out.println("introduzca la nueva fecha de inicio del empleado: (formato: yyyy/mm/dd) ");
                                                    String fechaT = scanner.nextLine();
                                                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                                                    sdf.setLenient(false);
                                                    Date fecha;
                                                    try {
                                                        fecha = sdf.parse(fechaT);
                                                        empleado.setFechaIni(fecha);
                                                        control.editarEmpleado(empleado);
                                                        out.printf("fecha actualizada.");
                                                        banderaF = true;
                                                    } catch (ParseException e) {
                                                        out.printf("formato inválido, use el formato correcto");
                                                    }
                                                }
                                                break;
                                            default:
                                                out.println("edición no realizada");
                                        }
                                        out.println("el empleado actualizado ha quedado así: " + empleado.toString());
                                        out.println("si ha concluido la edición de este operario pulse 0, si desea seguir editándolo pulse cualquier número ");
                                        bandera = scanner.nextInt();
                                        scanner.nextLine();
                                    } else {
                                        out.println("Los datos de este empleado no han sido modificados" + empleado.toString());
                                        bandera = 0;
                                    }
                                }

                            } else {
                                out.println("Empleado no encontrado");
                            }
                            break;
                        case 0:
                            prog = 0;
                            out.println("saliendo del programa...");
                            break;
                        default:
                            out.println("Esta opción no es válida.");
                            break;
                    }
                } catch (OpcionInvalidaException e) {
                    out.println(e.getMessage());
                }
                out.printf("Si deseas terminar el programa pulsa 0, si no, pulsa cualquier otro número:");
                prog = scanner.nextInt();
                scanner.nextLine();
            }catch (InputMismatchException e){
                out.println("Entrada no válida. Salimos del programa.");
                break;
            }
            }
            out.println("Pues esto es todo, aprúebame, hombre. Que no había programado en mi vida! XD.");
        }
    }


