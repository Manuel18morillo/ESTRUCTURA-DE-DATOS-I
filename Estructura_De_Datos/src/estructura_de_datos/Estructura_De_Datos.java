/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_de_datos;

import BaseDatos.Persona;
import java.util.Scanner;

/**
 *
 * @author Oscar Perez
 */
public class Estructura_De_Datos {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        ListaEnlazadaPersonas l = new ListaEnlazadaPersonas();
        int op = -1;
        while (op != 6){
            //cls();
            System.out.print("Menu Principal de la Lista Persona\n 1. Adicionar\n 2. Buscar\n 3. Eliminar\n 4. Modificar\n 5. Mostrar\n 6. Salir\n Digite la opcion:");
            op = entrada.nextInt();
            switch (op){
                case 1:
                   adicionarPersona(l);
                   break;
                case 2:
                   buscarPersona(l);
                   break;
                case 3:
                   eliminarPersona(l);
                   break;
                case 4:
                   modificarPersona(l);
                   break;
                case 5:
                   mostrarPersonas(l);
                   break;
            }
        }
    }
    //leyendo los datos del cliente
    public static void leerPersona(Persona p){
        System.out.print("Digite nombres de la persona:");
        p.setNombres(entrada.nextLine());
        System.out.print("Digite Apellidos de la Persona:");
        p.setApellidos(entrada.nextLine());
        System.out.print("Digite edad de la Persona:");
        p.setEdad(entrada.nextInt());
        System.out.print("Digite sexo del cliente (M-masculino, F-femenino:");
        p.setSexo(entrada.next().charAt(0));
    }
    //Adicionar datos en la Lista
    public static void adicionarPersona(ListaEnlazadaPersonas l){
        int dato;
        //Enrada de datos
        while(true){
            System.out.print("Digite un dato entero 0 en caso de querer terminar: ");
            dato = entrada.nextInt();
            if(dato == 0){
               break; 
            }
            else{
               NodoPersona n = new NodoPersona();
               System.out.println("Ingresar datos del cliente");
               leerPersona(n.getDato());
               l.adicionarFinal(n);
            }
         }
    }
    //Buscar persona
    public static void buscarPersona(ListaEnlazadaPersonas l){
        System.out.println("Digite id: ");
        NodoPersona nb = l.Buscar(entrada.nextInt());
        if(nb == null){
            System.out.println("No se encontro");
        }
        else{
            nb.getDato().mostrar();
        }
    }
    //Eliminar persona
    public static void eliminarPersona(ListaEnlazadaPersonas l){
        System.out.println("Digite el id:");
        if(l.eliminar(entrada.nextInt())){
            System.out.println("Eliminacion exitosa");
        }
        else{
            System.out.println("No se encontro el id");
        }
    }
    //Modificar persona
    public static void modificarPersona(ListaEnlazadaPersonas l){
        System.out.println("Digite el id:");
        NodoPersona nb = l.Buscar(entrada.nextInt());
        if(nb == null){
            System.out.println("Persona no encontrada");
        }
        else{
            Persona p = new Persona();
            leerPersona(p);
            nb.modificar(p);
        }

    }
    //mostrar personas
    public static void mostrarPersonas(ListaEnlazadaPersonas l){
        l.mostrarTodasPersonas();
    }
}
