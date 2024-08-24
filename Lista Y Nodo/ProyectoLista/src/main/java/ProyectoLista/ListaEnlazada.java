/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoLista;

/**
 *
 * @author ESTUDIANTES
 */
public class ListaEnlazada {
    //Atributos
    private Nodo inicio,fin;
   
    //Contructores
    public ListaEnlazada()  {
    this.inicio = this.fin = null;
    }
    
    //Get
    public Nodo getInicio() {
        return inicio;
    }

    public Nodo getFin() {
        return fin;
    }
    
    //Set

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }
    
    //Operaciones
    
    
}
