
package estructura_de_datos;

import BaseDatos.Persona;

public class NodoPersona {
    //Declaracion de atributos
    private Persona dato;
    private NodoPersona dirSig;
    //Costructores
    public NodoPersona(){
        dato = new Persona();
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
