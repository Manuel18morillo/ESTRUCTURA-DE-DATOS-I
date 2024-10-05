/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_de_datos;

import BaseDatos.Persona;

/**
 *
 * @author Oscar Perez
 */
public class NodoPersona {
    //Declaracion de atributos
    private Persona dato;
    private NodoPersona dirSig;
    //Costructores
    public NodoPersona(){
        dato = null;
        dirSig = null;
    }
    public NodoPersona(Persona dato, NodoPersona dirSig) {
        this.dato = dato;
        this.dirSig = dirSig;
    }
    //Get
    public Persona getDato() {
        return dato;
    }
    public NodoPersona getDirSig() {
        return dirSig;
    }
    //Set
    public void setDato(Persona dato) {
        this.dato = dato;
    }
    public void setDirSig(NodoPersona dirSig) {
        this.dirSig = dirSig;
    }
    //Acciones 
    public void modificar(Persona p){
        this.getDato().setNombres(p.getNombres());
        this.getDato().setApellidos(p.getApellidos());
        this.getDato().setEdad(p.getEdad());
        this.getDato().setSexo(p.getSexo());
        
    }
    
    
}
