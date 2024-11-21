/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos_1;

import BaseDatos.Cliente;

/**
 *
 * @author Oscar Perez
 */
public class NodoCliente {
    //Decclaracion de atributos
    private Cliente dato;
    private NodoCliente dirSig;
    //Constructor
    NodoCliente(){
        dato = new Cliente();
        dirSig = null;
    }
    //Get
    public Cliente getDato() {
        return dato;
    }
    public NodoCliente getDirSig() {
        return dirSig;
    }
    //Set
    public void setDato(Cliente dato) {
        this.dato = dato;
    }
    public void setDirSig(NodoCliente dirSig) {
        this.dirSig = dirSig;
    }
}
