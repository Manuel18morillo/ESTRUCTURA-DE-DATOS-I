/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

/**
 *
 * @author Oscar Perez
 */
public class Persona {
    //Declaracion de atributos
    private int id,edad;
    private String nombres,apellidos;
    private char sexo;
    //constructores
    public Persona(){
        id = edad = 0;
        nombres = apellidos = null;
        sexo = 0;
    }
    public Persona(int id, int edad, String nombres, String apellidos, char sexo) {
        this.id = id;
        this.edad = edad;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
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
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    //Acciones
    public boolean esMayorEdad(){
        return edad >= 18;
    }
    public String mostrar(){
        return "Nombre:"+nombres+" Apellidos:"+apellidos+" Edad:"+edad+" Sexo:"+sexo;
    }
}
