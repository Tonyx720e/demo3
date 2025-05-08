/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo3.entidades;

/**
 *
 * @author Tony
 */
public class Empleado {
    
    private long id;
    private String nombre;
    private String apellido;
    private int Edad;

    public Empleado() {
    }

    public Empleado(long id, String nombre, String apellido, int Edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Edad = Edad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
}
