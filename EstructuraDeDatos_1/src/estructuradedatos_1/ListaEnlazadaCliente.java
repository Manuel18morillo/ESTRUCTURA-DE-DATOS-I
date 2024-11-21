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
public class ListaEnlazadaCliente {
    //Declarar los atributos
    private NodoCliente inicio,fin;
    //Constructor
    ListaEnlazadaCliente(){
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
    //Lista vacia
    public boolean estaVacia(){
        return inicio == null;
    }
    //Adicionar
    public void adicionarFinal(NodoCliente n){
        if(estaVacia()){
            n.getDato().setId(1);
            inicio = fin = n;
        }
        else{
            n.getDato().setId(fin.getDato().getId()+1);
            fin.setDirSig(n);
            fin = n;
        }
    }
    public void adicionarInicio(NodoCliente n){
        if(estaVacia()){
            n.getDato().setId(1);
            inicio = fin = n;
        }
        else{
            n.getDato().setId(inicio.getDato().getId()+1);
            n.setDirSig(inicio);
            inicio = n;
        }
    }
    //Buscar
    public NodoCliente buscar(int id){
        NodoCliente aux = inicio;
        return buscar(aux,id);
    }
    private NodoCliente buscar(NodoCliente aux,int id){
        Cliente c;
        if(estaVacia()){
            return null;
        }
        else{
            if(aux != null){
                c = aux.getDato();
                if(id == c.getId()){
                    return aux;
                }
                else{
                    //aux = aux.getDirSig();
                    return buscar(aux.getDirSig(),id);
                }
            }
            return null;
        }
    }
    //Eliminar
    public boolean eliminar(int id){
        NodoCliente ant = null,aux = inicio;
        return eliminar(id,ant,aux);
    }
    private boolean eliminar(int id,NodoCliente ant,NodoCliente aux){
        
        if(estaVacia()){
            return false;
        }
        else{
            if(aux == null){
                return false;
            }
            else{
               if(id == aux.getDato().getId()){
                  //Dato al inicio de la ista
                  if(aux == inicio){
                     inicio = aux.getDirSig();
                     aux.setDirSig(null);
                     return true;
                  }
                  else{
                     //Dato despues del inicio
                     ant.setDirSig(aux.getDirSig());
                     aux.setDirSig(null);
                     //Dato al final de la lista
                     if(aux == fin){
                        fin = ant; 
                     }
                     return true;
                  }
               }
               else{
                 //ant = aux;
                 //aux = aux.getDirSig();
                 return eliminar(id,aux,aux.getDirSig());
               }
            }
        }
    }
    //Mostrar datos de la Lista
    public void mostrarClientes(){
        NodoCliente aux = inicio;
        mostrarClientes(aux);
    }
    public void mostrarClientes(NodoCliente aux){
        if(estaVacia()){
            System.out.println("Lista vacia");
        }
        else{
            if(aux != null){
                mostrarCliente(aux.getDato());
                //aux = aux.getDirSig();
                mostrarClientes(aux.getDirSig());
            }
        }
    }
    public void mostrarCliente(Cliente c){
        System.out.println(c.getId()+" "+c.getNombres()+" "+c.getApellidos()+" "+c.getDireccion()+" "+c.getEmail()+" "+c.getEdad());
    }
    //Modoficar
    public boolean modificar(Cliente c){
        if(estaVacia()){
            return false;
        }
        else{
            NodoCliente nc = buscar(c.getId());
            if( nc == null){
                return false;
            }
            else{
                nc.setDato(c);
                return true;
            }
        }
    }
}
