/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos_1;

import BaseDatos.Cliente;
import static estructuradedatos_1.EstructuraDeDatos.dato;
import static estructuradedatos_1.EstructuraDeDatos.entrada;

/**
 *
 * @author Oscar Perez
 */
public class MenuPrincipalPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dato;
        PilaCliente pc = new PilaCliente();
        int c = 0;
        while(true){
            NodoCliente n = new NodoCliente();
            System.out.println("Ingresar datos del cliente a la Pila");
            leerCliente(n.getDato());
            n.getDato().setId(++c);
            pc.meter(n);
            System.out.print("Digite un cero para terminar: ");
            dato = entrada.nextInt();
            if(dato == 0){
               break; 
            }
        }
    }
    public static void leerCliente(Cliente c){
        System.out.print("Digite nombres del cliente:");
        c.setNombres(entrada.next());
        System.out.print("Digite Apellidos del cliente:");
        c.setApellidos(entrada.next());
        System.out.print("Digite edad del cliente:");
        c.setEdad(entrada.nextInt());
        System.out.print("Digite sexo del cliente (M-masculino, F-femenino:");
        c.setSexo(entrada.next().charAt(0));
        System.out.print("Digite Direccion del cliente:");
        c.setDireccion(entrada.next());
        System.out.print("Digite e-mail del cliente:");
        c.setEmail(entrada.next());
    }
    //Mostrar datos de la Lista
    public static void mostrarClientes(PilaCliente pc){
        PilaCliente aux = new PilaCliente();
        if(pc.estaVacia()){
            System.out.println("Lista vacia");
        }
        else{
           while(!pc.estaVacia()){
             mostrarCliente(pc.sacar().getDato());
           }
           while(!aux.estaVacia()){
               pc.meter(aux.sacar());
           } 
        }
    }
    //Mostrar un cliente
    public static void mostrarCliente(Cliente c){
        System.out.println(c.getId()+" "+c.getNombres()+" "+c.getApellidos()+" "+c.getSexo()+" "+c.getEdad()+" "+c.getDireccion());
    }
}
