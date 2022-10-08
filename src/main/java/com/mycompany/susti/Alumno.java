/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.susti;


public class Alumno extends Persona {
    
String curso;
String promedio;

    public Alumno() {
    }

 public Alumno(String nombre, String codigo, String curso, String promedio) {
    super(nombre,codigo);
    this.curso = curso;
    this.promedio = promedio;
    }

    public Alumno(String curso, String promedio) {
        this.curso = curso;
        this.promedio = promedio;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "curso=" + curso + ", promedio=" + promedio + '}';
    }
 
}
