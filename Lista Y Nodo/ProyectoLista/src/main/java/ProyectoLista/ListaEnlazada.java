package ProyectoLista;

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
    public void adicionarFinal(Nodo n){
        if(this.inicio == null){
            this.inicio = this.fin = n;
            
        }
        else{
            this.fin.setDirSig(n);
            fin = n;
        }
        
    }
    
    public void adicionarInicio(Nodo n){
        if(this.inicio == null){
            this.inicio = this.fin = n;
            
        }
        else{
            n.setDirSig(inicio);
            inicio = n;
            
        }   
    }
    
    public void mostrar() {
    if (this.inicio == null) {
        System.out.println("Lista vacía");
    } else {
        Nodo aux = inicio;
        System.out.println("Lista de personas: ");
        while (aux != null) {
            System.out.println("Nombre: " + aux.getDato().getNombre() + ", Edad: " + aux.getDato().getEdad());
            aux = aux.getDirSig(); 
          
           }
        }
    }
}
