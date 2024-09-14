package ProyectoLista;

import java.util.Scanner;

public class ProyectoLista {

    static Scanner x = new Scanner(System.in);
    
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        

        while (true) {
            // Pedir datos del usuario
            System.out.print("Nombre de la persona o 'salir' para terminar: ");
            String nombre = x.nextLine();

            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.print("Digite edad de la persona: ");
            int edad = x.nextInt();
            x.nextLine();

            // Crear objeto Persona
            Persona persona = new Persona();
            persona.setNombre(nombre);
            persona.setEdad(edad);

            Nodo n = new Nodo();
            n.setDato(persona);

            lista.adicionarInicio(n);

            if (persona.Edad()) {
                System.out.println("La edad es par");
            } else {
                System.out.println("La edad es impar");
            }
        }

        // Mostrar la lista al final
        System.out.println("\n");
        lista.mostrar();

        x.close();
    }
}
    

