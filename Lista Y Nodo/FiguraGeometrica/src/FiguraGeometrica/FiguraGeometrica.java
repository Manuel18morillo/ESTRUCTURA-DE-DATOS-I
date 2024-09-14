package FiguraGeometrica;

import java.util.Scanner;

public class FiguraGeometrica {

    static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        boolean continuar = true;

        do {
            System.out.print("Menu Principal\n 1. Triangulo\n 2. Rectangulo\n 3. Cuadrado\n 4. Rombo\n 5. Circunferencia\n 6. Salir\nDigite la opcion: ");
            opcion = x.nextInt();

            switch (opcion) {
                case 1:
                    Triangulo();
                    break;
                case 2:
                    Rectangulo();
                    break;
                case 3:
                    Cuadrado();
                    break;
                case 4:
                    Rombo();
                    break;
                case 5:
                    Circunferencia();
                    break;
                case 6:
                    continuar = false; 
                    System.out.println("Finalizado");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }

            if (continuar) {
                System.out.print("Desea realizar otra operacion? (s/n): ");
                char respuesta = x.next().toLowerCase().charAt(0);
                if (respuesta == 'n') {
                    continuar = false;
                    System.out.println("Finalizado");
                }
            }
        } while (continuar);

    }

    public static void Triangulo() {
        Triangulo t = new Triangulo();
        System.out.println("Digite Lado uno del triangulo: ");
        t.setL1(x.nextDouble());
        System.out.println("Digite Lado dos del triangulo: ");
        t.setL2(x.nextDouble());
        System.out.println("Digite Lado tres del triangulo: ");
        t.setL3(x.nextDouble());

        if (t.esTriangulo()) {
            System.out.println("El area del triangulo es: " + t.area());
            System.out.println("El perimetro del triangulo es: " + t.Perimetro());
        } else {
            System.out.println("No es un triangulo valido.");
        }
        System.out.println("Tipo de Triangulo: " + t.TipoTriangulo());
    }

    public static void Rectangulo() {
        Rectangulo r = new Rectangulo();

        System.out.println("Digite la base: ");
        r.setBase(x.nextDouble());
        System.out.println("Digite Altura: ");
        r.setAltura(x.nextDouble());

        System.out.println("Area del rectangulo: " + r.area());
        System.out.println("Perimetro del rectangulo: " + r.perimetro());
    }

    public static void Cuadrado() {
        Cuadrado c = new Cuadrado();
        System.out.println("Digite un lado del cuadrado: ");
        c.setLado(x.nextDouble());

        System.out.println("Perimetro del cuadrado: " + c.Perimetro());
        System.out.println("Area del cuadrado: " + c.Area());
    }

    public static void Rombo() {
        Rombo Ro = new Rombo();
         boolean diagonalesCorrectas = false;
        do {
            // Ingresar las diagonales
            System.out.println("Digite la diagonal mayor: ");
            Ro.setDiagonalmayor(x.nextDouble());

            System.out.println("Digite la diagonal menor: ");
            Ro.setDiagonalmenor(x.nextDouble());

            // Validación de diagonales
            if (Ro.diagonalesValidas()) {
                diagonalesCorrectas = true;
            } else {
                System.out.println("Datos Incorrectos. Intente nuevamente.");
            }
        } while (!diagonalesCorrectas);
        
        System.out.println("Digite Lado: ");
        Ro.setLado(x.nextDouble());

        System.out.println("Area del rombo: " + Ro.Area());
        System.out.println("Perimetro del rombo: " + Ro.Perimetro());
    }

    public static void Circunferencia() {
        Circunferencia ci = new Circunferencia();
        System.out.println("Digite Diametro: ");
        ci.setDiametro(x.nextDouble());

        System.out.println("Perimetro de la circunferencia: " + ci.Perimetro());
        System.out.println("Area de la circunferencia: " + ci.Area());
    }
}

