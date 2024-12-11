package org.example.logica;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
//Generamos el Mapeo de nuestra clase.
@Entity //definimos la clase como entidad que será una tabla en la BD.
public class Empleado implements Serializable {
    //nombre, apellido, cargo, salario y fecha de inicio
    @Id //lo establecemos como clave primaria
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //La clave será secuencial.
    Long id;
    @Basic //tipos de datos básicos
    private String nombre;
    private String apellido;
    private String cargo;
    private double salario;
    @Temporal(TemporalType.DATE) //Definimos el atributo como tipo Date (año-mes-día)
    private Date fechaIni;
//creamos constructor vacío
    public Empleado() {
    }
//creamos constructor con parámetros.
    public Empleado(Long id, String nombre, String apellido, String cargo, double salario, Date fechaIni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaIni = fechaIni;
    }

    //creamos getters
    public Long getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCargo() {
        return cargo;
    }
    public double getSalario() {
        return salario;
    }
    public Date getFechaIni() {
        return fechaIni;
    }
    //creamos setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    @Override
    public String toString() {
        return "Empleado{ " + "id= " + id + " Nombre= "+ nombre + ", Apellido=" + apellido + ", Cargo=" + cargo + ", Salario=" + salario + ", FechaInicio=" +fechaIni+" }";
    }
}
