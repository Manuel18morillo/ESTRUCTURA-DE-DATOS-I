/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos_1;

import BaseDatos.Cliente;

public class ColaCliente {
    //Declarar los atributos
    private NodoCliente inicio,fin;
    //Constructor
    ColaCliente(){
        inicio = fin = null;
    }
    //Get
    public NodoCliente getInicio() {
        return inicio;
    }
    public NodoCliente getFin() {
        return fin;
    }
    //Set
    public void setInicio(NodoCliente inicio) {
        this.inicio = inicio;
    }
    public void setFin(NodoCliente fin) {
        this.fin = fin;
    }
    //Cola vacia
    public boolean estaVacia(){
        return inicio == null;
    }
    //Meter al principio: cuando de antemano se sacaron nodos de la cola y se guardaron en la pila auxiliar
    public void meterInicio(NodoCliente n){
        if(this.estaVacia()){
            inicio = n;fin = n;
        }
        else{
            n.setDirSig(inicio);
            inicio = n;
        }
    }
    //Meter al final: normalmente se mete al final de la cola
    public void meterFinal(NodoCliente n){
        if(this.estaVacia()){
            inicio = n;fin = n;
        }
        else{
            fin.setDirSig(n);
            fin = n;
        }
    }
    //Sacar al inicio: normalmente se saca al inicio de la cola
    public NodoCliente sacarInicio(){
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
    //Eliminar un nodo de la cola: los nodos que se sacan de la cola se guardan en una pila auxiliar
    public NodoCliente eliminarId(int Id){
        NodoCliente estado = null;
        PilaCliente aux = new PilaCliente();
        if(this.estaVacia()){
            return null;
        }
        else{
            while(!this.estaVacia()){
               if(Id == this.getInicio().getDato().getId()){
                   estado = this.sacarInicio();
                   break;
               }
               else{
                   //Los nodos que saco de la cola los guardo en una pila auxiliar, para que cuando regresen a la cola conserven el orden 
                   aux.meter(this.sacarInicio());
               }
           }
           while(!aux.estaVacia()){
               //Un caso especial cuando voy a ingresar nuevamnte los nodos que saque de la cola
               this.meterInicio(aux.sacar());
           }
           return estado;
        }
    }
    //Buscar un nodo en la cola
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
                   aux.meter(this.sacarInicio());
               }
           }
           while(!aux.estaVacia()){
               this.meterInicio(aux.sacar());
           }
           return c; 
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
                   this.sacarInicio();
                   this.meterInicio(nc);
                   estado = true;
                   break;
               }
               else{
                   aux.meter(this.sacarInicio());
               }
           }
           while(!aux.estaVacia()){
               this.meterInicio(aux.sacar());
           }
           return estado;
        }
    }
    
    public boolean trasladoYOrganizacionDeMujeresMayorAmenor(ColaCliente aux) {
    if (this.estaVacia()) return false; 
    boolean hayMujeres = false;
    ColaCliente temporal = new ColaCliente();
    while (!this.estaVacia()) {
        NodoCliente mayor = null;
        while (!this.estaVacia()) {
            NodoCliente actual = this.sacarInicio();
            if (actual.getDato().getSexo() == 'F') { 
                hayMujeres = true;
                if (mayor == null || actual.getDato().getEdad() > mayor.getDato().getEdad()) {
                    if (mayor != null) {
                        temporal.meterFinal(mayor); 
                    }
                    mayor = actual; 
                } else {
                    temporal.meterFinal(actual);
                }
            } else {
                temporal.meterFinal(actual); 
            }
        }
        if (mayor != null) {
            aux.meterFinal(mayor); 
        }
        while (!temporal.estaVacia()) {
            this.meterFinal(temporal.sacarInicio());
        }
    }
    return hayMujeres; 
    }
}


