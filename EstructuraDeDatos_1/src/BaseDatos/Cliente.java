/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.util.Scanner;

/**
 *
 * @author Oscar Perez
 */
public class Cliente {
    //Atributos
    private int id,edad;
    private String nombres,apellidos,email,direccion;
    private char sexo;
    //Constructor
    public Cliente(){
        nombres = apellidos = email = direccion = null;
        id = edad = 0;
        sexo = 0;
    }
    //Get
    public int getId() {
        return id;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getEmail() {
        return email;
    }
    public String getDireccion() {
        return direccion;
    }
    public char getSexo() {
        return sexo;
    }
    //Set
    public void setId(int id) {
        this.id = id;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    //Acciones
    public boolean esMayorEdad(){
        return edad >= 18;
    }
    
}
