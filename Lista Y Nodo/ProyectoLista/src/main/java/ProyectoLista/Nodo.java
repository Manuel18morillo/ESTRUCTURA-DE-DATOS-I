/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoLista;

/**
 *

}
 * @author ESTUDIANTES
 */
public class Nodo {
    //Atributos
    private Persona dato;
    private Nodo dirSig;
    //Contructor
    public Nodo(){
    this.dato = null;
    this.dirSig = null;
    }
    
    //Get
    public Persona getDato() {
        return dato;
    }

    public Nodo getDirSig() {
        return dirSig;
    }
    
    //Set
    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public void setDirSig(Nodo dirSig) {
        this.dirSig = dirSig;
    }
}
    
    