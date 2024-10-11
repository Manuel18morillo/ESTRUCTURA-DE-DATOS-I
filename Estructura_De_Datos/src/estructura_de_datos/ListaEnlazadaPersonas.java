
package estructura_de_datos;

import BaseDatos.Persona;
public class ListaEnlazadaPersonas {
    //Declarancion de atributos
    private NodoPersona inicio,fin;
    //Constructores
    public ListaEnlazadaPersonas(){
        inicio = fin = null;
    }
    public ListaEnlazadaPersonas(NodoPersona inicio, NodoPersona fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    //Get
    public NodoPersona getInicio() {
        return inicio;
    }
    public NodoPersona getFin() {
        return fin;
    }
    //Set
    public void setInicio(NodoPersona inicio) {
        this.inicio = inicio;
    }
    public void setFin(NodoPersona fin) {
        this.fin = fin;
    }
    //Acciones
    public boolean estaVacia(){
        return inicio == null;
    }
    public void adicionarFinal(NodoPersona np){
        if(estaVacia()){
            np.getDato().setId(1);
            inicio = fin = np;
        }
        else{
            np.getDato().setId(fin.getDato().getId()+1);
            fin.setDirSig(np);
            fin = np;
        }
    }
    public void adicionarInicio(NodoPersona np){
        if(estaVacia()){
            np.getDato().setId(1);
            inicio = fin = np;
        }
        else{
            np.getDato().setId(inicio.getDato().getId()+1);
            np.setDirSig(inicio);
            inicio = np;
        }
    }
    //Eliminacion
    public boolean eliminar(int id){
        //verificar que a lista esta vacia
        if(estaVacia()){
            return false;
        }
        else{
            NodoPersona aux = inicio,ant = null;
            while(true){
                //verificar que se recorrio toda la lista
                if(aux == null){
                    return false;
                }
                else{
                  if(aux.getDato().getId() == id){
                    if(aux == inicio){
                        inicio = aux.getDirSig();
                        aux.setDirSig(null);
                        return true;
                    }
                    else{
                        ant.setDirSig(aux.getDirSig());
                        aux.setDirSig(null);
                        if(aux == fin){
                            fin = ant;
                        }
                        return true;
                    }
                  }
                  else{
                     ant = aux;
                     aux = aux.getDirSig();    
                }    
             }
            }
        }
    }
    //Buscar
    public NodoPersona Buscar(int Id){
        if(this.estaVacia()){
            return null;
        }
        else{
            NodoPersona aux = inicio;
            while(true){
               if(aux == null){
                  return null; 
               }
               else{
                   if(aux.getDato().getId() == Id){
                       return aux;
                   }
                   else{
                       aux = aux.getDirSig();
                   }
               }
            }
        }
    }
    //Modificar
    public boolean modificar(int Id, Persona p){
        if(this.estaVacia()){
            return false;
        }
        else{
            NodoPersona nb = this.Buscar(Id);
            if(nb == null){
                return false;
            }
            else{
                nb.modificar(p);
                return true;
            }
        }
    }
    
    public Persona mujerMenorEdad() {
        if (estaVacia()) {
            return null;
        }
        NodoPersona aux = inicio;
        Persona menor = null;
        while (aux != null) {
            if (aux.getDato().getSexo() == 'F') {
                if (menor == null || aux.getDato().getEdad() < menor.getEdad()) {
                    menor = aux.getDato();
                }
            }
            aux = aux.getDirSig();
        }
        return menor;
    }
    
    public void hombresEdadPorDebajoPromedioMujeres() {
        if (estaVacia()) {
            return;
        }
        NodoPersona aux = inicio;
        int sumaEdadMujeres = 0;
        int countMujeres = 0;
        while (aux != null) {
            if (aux.getDato().getSexo() == 'F') {
                sumaEdadMujeres += aux.getDato().getEdad();
                countMujeres++;
            }
            aux = aux.getDirSig();
        }
        double promedioEdadMujeres = countMujeres > 0 ? (double) sumaEdadMujeres / countMujeres : 0;
        aux = inicio;
        while (aux != null) {
            if (aux.getDato().getSexo() == 'M' && aux.getDato().getEdad() < promedioEdadMujeres) {
                System.out.println(aux.getDato().mostrar());
            }
            aux = aux.getDirSig();
        }
    }
    
    public void eliminarHombresMinoriaEdad() {
    if (estaVacia()) {
        System.out.println("No hay personas en la lista.");
        return;
    }
    NodoPersona aux = inicio, ant = null;
    while (aux != null) {
        if (aux.getDato().getSexo() == 'M' && aux.getDato().getEdad() < 18) {
            System.out.println("Eliminado: " + aux.getDato().mostrar());
            if (aux == inicio) {
                inicio = aux.getDirSig();
                aux = inicio;
            } else {
                ant.setDirSig(aux.getDirSig());
                aux = ant.getDirSig();
                if (aux == fin) {
                    fin = ant;
                }
            }
        } else {
            ant = aux;
            aux = aux.getDirSig();
        }
    }
}
    
    public void mostrarTodasPersonas(){
        NodoPersona aux;
        aux = inicio;
        while(aux != null){
            System.out.println("______________");
            System.out.println(aux.getDato().getId());
            System.out.println(aux.getDato().getNombres());
            System.out.println(aux.getDato().getApellidos());
            System.out.println(aux.getDato().getEdad());
            System.out.println(aux.getDato().getSexo());
            aux = aux.getDirSig();
        }
    } 
}
