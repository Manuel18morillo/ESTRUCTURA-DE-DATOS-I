/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FiguraGeometrica;

import java.util.Scanner;
public class FiguraGeometrica {

    public static void main(String[] args) {
    
        Scanner x = new Scanner(System.in);
        Triangulo t = new Triangulo();
        
        System.out.println("Digite Lado uno del triangulo: ");
        t.setL1(x.nextDouble());
        System.out.println("Digite Lado dos del triangulo: ");
        t.setL2(x.nextDouble());
        System.out.println("Digite Lado tres del triangulo: ");
        t.setL3(x.nextDouble());
        
        
        
        
    }
    
}
