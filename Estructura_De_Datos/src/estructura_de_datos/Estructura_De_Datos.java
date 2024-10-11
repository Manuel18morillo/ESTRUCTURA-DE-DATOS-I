
package estructura_de_datos;

import BaseDatos.Persona;
import java.util.Scanner;

public class Estructura_De_Datos {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        ListaEnlazadaPersonas l = new ListaEnlazadaPersonas();
        int op = -1;
        while (op != 9){
            //cls();
            System.out.print("Menu Principal de la Lista Persona\n 1. Adicionar\n 2. Buscar\n 3. Eliminar\n 4. Modificar\n 5. Mostrar Mujer Menor Edad\n 6. Mostrar Hombres Debajo Del Promedio\n 7. Mostrar  Hombres Eliminados Por Minoria de Edad\n 8. Mostrar\n 9. Salir\n Digite la opcion:");
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
                   mostrarMujerMenorEdad(l);
                   break;
                case 6:
                   mostrarHombresEdadPorDebajoPromedioMujeres(l);
                   break;
                case 7:
                   eliminarHombresMinoriaEdad(l);
                   break;
                case 8:
                   mostrarPersonas(l);
                   break;
            }
        }
    }
    //leyendo los datos del cliente
    public static void leerPersona(Persona p){
        System.out.println("Digite nombres de la persona:");
        p.setNombres(entrada.next());
        System.out.println("Digite Apellidos de la Persona:");
        p.setApellidos(entrada.next());
        System.out.println("Digite edad de la Persona:");
        p.setEdad(entrada.nextInt());
        System.out.println("Digite sexo del cliente (M-masculino, F-femenino:");
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
    
    public static void mostrarMujerMenorEdad(ListaEnlazadaPersonas l) {
    Persona menor = l.mujerMenorEdad();
    if (menor != null) {
        System.out.println("La mujer de menor edad es: " + menor.mostrar());
    } else {
        System.out.println("No hay mujeres en la lista.");
    }
}

    public static void mostrarHombresEdadPorDebajoPromedioMujeres(ListaEnlazadaPersonas l) {
    System.out.println("Los hombres cuya edad esta por debajo del promedio de las edades de las mujeres son:");
    l.hombresEdadPorDebajoPromedioMujeres();
}

    public static void eliminarHombresMinoriaEdad(ListaEnlazadaPersonas l) {
    l.eliminarHombresMinoriaEdad();
    System.out.println("Todos los hombres que tienen minoria de edad han sido eliminados.");
    } 
}
