package org.example.logica;

import org.example.persistencia.ControladoraPersistencia;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

//Aquí desarrollaremos todos los métodos que van a llamar a la persistencia
    public class ControladoraLogica {
    //creamos una instancia que llamará a la controladora de persistencia.
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    Scanner scanner = new Scanner(System.in);

    //creamos un metodo que llamará al metodo create de la Controladora de Persistencia
    public void crearEmpleado(Empleado empleado) throws ParseException {
        controlPersis.crearEmpleado(empleado);
    }
    public Empleado traerEmpleado(Long id){
        return controlPersis.traerEmpleado(id);
    }

    public ArrayList <Empleado> traerEmpleados(){
        return controlPersis.traerEmpleados();
    }
    public void eliminarEmpleado (Long id){
        controlPersis.eliminarEmpleado(id);
    }
    public void editarEmpleado (Empleado empleado){
        controlPersis.editarEmpleado(empleado);
    }


}

