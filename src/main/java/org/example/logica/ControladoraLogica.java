package org.example.logica;

import org.example.persistencia.ControladoraPersistencia;

import java.text.ParseException;
import java.util.ArrayList;

//Aquí desarrollaremos todos los métodos que van a llamar a la persistencia
    public class ControladoraLogica {
    //creamos una instancia que llamará a la controladora de persistencia.
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //Metodo para crear un empleado
    public void crearEmpleado(Empleado empleado) throws ParseException {
        controlPersis.crearEmpleado(empleado);
    }
    //Metodo para traer un solo empleado por id
    public Empleado traerEmpleado(Long id){
        return controlPersis.traerEmpleado(id);
    }
    //Metodo para traer un listado de todos los empleados.
    public ArrayList <Empleado> traerEmpleados(){
        return controlPersis.traerEmpleados();
    }
    //Metodo para eliminar un empleado
    public void eliminarEmpleado (Long id){

        controlPersis.eliminarEmpleado(id);
    }
    //Metodo para crear un empleado
    public void editarEmpleado (Empleado empleado){
        controlPersis.editarEmpleado(empleado);
    }
    //Metodo para buscar un empleado por nombre y apellido
 public Empleado buscarEmpleadoPorNombreYApellido(String nombre, String apellido) {
        return controlPersis.buscarEmpleadoPorNombreYApellido(nombre, apellido);
    }


}

