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
public class PilaCliente {
    //Declarando atributos
    private NodoCliente inicio;
    //Constructor
    PilaCliente(){
        inicio = null;
    }
    //Get
    public NodoCliente getInicio() {
        return inicio;
    }
    //Set
    public void setInicio(NodoCliente inicio) {
        this.inicio = inicio;
    }
    //Pila vacia
    public boolean estaVacia(){
        return inicio == null;
    }
    //Meter
    public void meter(NodoCliente n){
        if(estaVacia()){
           inicio = n;
        }
        else{
            n.setDirSig(inicio);
            inicio = n;
        }
    }
    //Sacar
    public NodoCliente sacar(){
        NodoCliente aux;
        if(this.estaVacia()){
            return null;
        }
        else{
            aux = inicio;
            inicio = inicio.getDirSig();
            aux.setDirSig(null);
            return aux;
        }
    }
    //Eliminar
    public boolean eliminar(int Id){
        boolean estado = false;
        PilaCliente aux = new PilaCliente();
        if(this.estaVacia()){
           return false; 
        }
        else{
           while(!this.estaVacia()){
               if(Id == this.getInicio().getDato().getId()){
                   this.sacar();
                   estado = true;
                   break;
               }
               else{
                   aux.meter(this.sacar());
               }
           }
           while(!aux.estaVacia()){
               this.meter(aux.sacar());
           }
           return estado;
        }
    }
    //Modificar
    public boolean modifiar(NodoCliente nc){
        boolean estado;
        PilaCliente aux = new PilaCliente();
        if(this.estaVacia()){
           return false; 
        }
        else{
           estado = false;
           while(!this.estaVacia()){
               if(nc.getDato().getId() == this.getInicio().getDato().getId()){
                   this.sacar();
                   this.meter(nc);
                   estado = true;
                   break;
               }
               else{
                   aux.meter(this.sacar());
               }
           }
           while(!aux.estaVacia()){
               this.meter(aux.sacar());
           }
           return estado;
        }
    }
    //Buscar
    public Cliente buscar(int Id){
        PilaCliente aux = new PilaCliente();
        Cliente c = null;
        if(this.estaVacia()){
           return null; 
        }
        else{
           while(!this.estaVacia()){
               if(Id == this.getInicio().getDato().getId()){
                  c = this.getInicio().getDato();
                  break;
               }
               else{
                   aux.meter(this.sacar());
               }
           }
           while(!aux.estaVacia()){
               this.meter(aux.sacar());
           }
           return c; 
        }
    }
    
    public void reorganizarPersonasPorSexoYEdad() {
    PilaCliente aux = new PilaCliente();
    while (!this.estaVacia()) {
        aux.meter(this.sacar());
    }
    while (true) {
        NodoCliente mayor = null;
        NodoCliente actual = null;
        while (!aux.estaVacia()) {
            actual = aux.sacar();
            if (actual.getDato().getSexo() == 'M') {
                if (mayor == null || actual.getDato().getEdad() > mayor.getDato().getEdad()) {
                    if (mayor != null) aux.meter(mayor);  
                    mayor = actual;
                } else {
                    aux.meter(actual);  
                }
            } else {
                this.meter(actual);  
            }
        }
        if (mayor == null) break;
        this.meter(mayor);
        while (!this.estaVacia()) {
            aux.meter(this.sacar());
        }
    }
    while (true) {
        NodoCliente mayor = null;
        NodoCliente actual = null;
        while (!aux.estaVacia()) {
            actual = aux.sacar();
            if (actual.getDato().getSexo() == 'F') {
                if (mayor == null || actual.getDato().getEdad() > mayor.getDato().getEdad()) {
                    if (mayor != null) aux.meter(mayor); 
                    mayor = actual;
                } else {
                    aux.meter(actual); 
                }
            } else {
                this.meter(actual); 
            }
        }
        if (mayor == null) break;
        this.meter(mayor);
        while (!this.estaVacia()) {
            aux.meter(this.sacar());
        }
    }
}

}
