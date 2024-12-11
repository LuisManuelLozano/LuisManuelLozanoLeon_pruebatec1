package org.example.persistencia;

import org.example.logica.Empleado;
import org.example.persistencia.exceptions.NonexistentEntityException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    EmpleadoJpaController empleadoJPA = new EmpleadoJpaController();


    /*METODOS para Empleado*/
    public void crearEmpleado(Empleado empleado) {

        empleadoJPA.create(empleado);
    }

    public void eliminarEmpleado(Long id) {
        try {
            empleadoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Empleado> traerEmpleados() {
        //recibimos una lista de .findEmpleadoEntities y lo pasamos a un ArrayList llamado lista.
        List<Empleado> lista = empleadoJPA.findEmpleadoEntities();
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>(lista);
        return listaEmpleados;
    }


    public void editarEmpleado(Empleado empleado) {
        try {
            empleadoJPA.edit(empleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Empleado traerEmpleado(Long id) {
        return empleadoJPA.findEmpleado(id);
    }

    public Empleado buscarEmpleadoPorNombreYApellido(String nombre, String apellido) {
        List<Empleado> listaEmpleados = traerEmpleados();
        for (Empleado emp : listaEmpleados) {
            if (emp.getNombre().equalsIgnoreCase(nombre) && emp.getApellido().equalsIgnoreCase(apellido)) {
                return emp;
            }
        }
        return null;
    }

}


