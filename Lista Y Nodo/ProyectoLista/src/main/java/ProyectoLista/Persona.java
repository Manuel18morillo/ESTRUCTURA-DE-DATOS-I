/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoLista;

public class Persona {
    private String nombre;
    private int edad;
    
    //contructores
    public Persona() {
        this.nombre = null;
        this.edad = 0;
  
    }
    
    //Get
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    //set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Operaciones
    public boolean Edad(){
        return this.edad % 2 == 0;
    }
    
}
