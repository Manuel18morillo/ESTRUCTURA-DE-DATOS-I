/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos_1;

import BaseDatos.Cliente;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Oscar Perez
 */
public class EstructuraDeDatos {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    static int dato;
    public static void main(String[] args) {
        // TODO code application logic here
        ListaEnlazadaCliente l = new ListaEnlazadaCliente();
        int op = -1;
        while (op != 6){
            //cls();
            System.out.print("Menu Principal de la Lista Cliente\n 1. Adicionar\n 2. Buscar\n 3. Eliminar\n 4. Modificar\n 5. Mostrar\n 6. Salir\n Digite la opcion:");
            op = entrada.nextInt();
            switch (op){
                case 1:
                   adicionarClienteLista(l);
                   break;
                case 2:
                   buscarClienteLista(l);
                   break;
                case 3:
                   eliminarClienteLista(l);
                   break;
                case 4:
                   modificarClienteLista(l);
                   break;
                case 5:
                   mostrarClienteLista(l);
                   break;
            }
        }
    }
    //Limpiar pantalla
    public static void cls(){
        try{
            Robot limpiar = new Robot();
            limpiar.keyPress(KeyEvent.VK_CONTROL);
            limpiar.keyPress(KeyEvent.VK_L);
            limpiar.keyRelease(KeyEvent.VK_CONTROL);
            limpiar.keyRelease(KeyEvent.VK_L);
            
        }  catch (Exception e) {
            System.out.println("Error al limpiar la pantalla"+e.getMessage());
        }
    }
    //leyendo los datos del cliente
    public static void leerCliente(Cliente c,boolean estado){
        System.out.print("Digite nombres del cliente:");
        c.setNombres(entrada.nextLine());
        System.out.print("Digite Apellidos del cliente:");
        c.setApellidos(entrada.nextLine());
        System.out.print("Digite edad del cliente:");
        c.setEdad(entrada.nextInt());
        System.out.print("Digite sexo del cliente (M-masculino, F-femenino:");
        c.setSexo(entrada.next().charAt(0));
        System.out.print("Digite Direccion del cliente:");
        c.setDireccion(entrada.nextLine());
        System.out.print("Digite e-mail del cliente:");
        c.setEmail(entrada.nextLine());
    }
    //Adicionar datos en la Lista
    public static void adicionarClienteLista(ListaEnlazadaCliente l){
        //Enrada de datos
        while(true){
            System.out.print("Digite un dato entero 0 en caso de querer terminar: ");
            dato = entrada.nextInt();
            if(dato == 0){
               break; 
            }
            else{
               NodoCliente n = new NodoCliente();
               System.out.println("Ingresar datos del cliente");
               leerCliente(n.getDato(),true);
               l.adicionarFinal(n);
            }
         }
    }
    //Buscar dato en la Lista
    public static void buscarClienteLista(ListaEnlazadaCliente l){
        int Id;
        NodoCliente nc;
        //Buscar un dato
        System.out.print("Digite el Id del cliente: ");
        Id = entrada.nextInt();
        nc = l.buscar(Id);
        if(nc != null){
            System.out.println("Datos del cliente encontrado");
            l.mostrarCliente(nc.getDato());
        }
        else{
            System.out.println("No se encontro el cliente en la lista");
        } 
    }
    //Eliminar dato en la Lista
    public static void eliminarClienteLista(ListaEnlazadaCliente l){
        int Id;
        System.out.print("Digite el Id del cliente a eliminar:");
        Id = entrada.nextInt();
        if(l.eliminar(Id)){
            System.out.println("El Cliente fue eliminado");
        }
        else{
            System.out.print("No se elimino el cliente");
        }
    }
    //Modificar dato en la Lista
    public static void modificarClienteLista(ListaEnlazadaCliente l){
        int Id;
        NodoCliente nc;
        System.out.println("Digite el Id del Cliente:");
        Id = entrada.nextInt();
        nc = l.buscar(Id);
        if(nc != null){
            leerCliente(nc.getDato(),false);
            System.out.print("Modificacion exitosa");
        }
        else{
            System.out.println("Dato no encontrado, no se puede modificar");
        }
    }
    //Mostra datos de la Lista
    public static void mostrarClienteLista(ListaEnlazadaCliente l){
        //Mostrar datos de la Lista
        System.out.println("Los datos de la Lista son:");
        l.mostrarClientes();
    }
}
