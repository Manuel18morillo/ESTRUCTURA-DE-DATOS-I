/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoLista;
public class Persona {
    //Atrivutos
    private String nombre;
    private int edad;
    private int sexo;
    
    //contructores
    public Persona() {
        this.nombre = null;
        this.edad = 0;
        this.sexo = 0;
    }
    
    //Get
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getSexo() {
        return sexo;
    }
    
    //set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
    //Operaciones
    public boolean mujerMayoredad(){
        return this.sexo == 0 && this.edad >=18;
    
    }
}
