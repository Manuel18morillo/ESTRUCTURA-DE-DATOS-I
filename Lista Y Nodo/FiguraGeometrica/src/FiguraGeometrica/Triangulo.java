/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiguraGeometrica;


public class Triangulo {
    //Declaracion de atributos
    private double L1,L2,L3;

    public Triangulo(double L1, double L2, double L3) {
        //Contructores
        this.L1 = L1;
        this.L2 = L2;
        this.L3 = L3;
    }

    public Triangulo() {
        this.L1 = 0;
        this.L2 = 0;
        this.L3 = 0;
    }  
    
    //GET
    public double getL1() {
        return L1;
    }

    public double getL2() {
        return L2;
    }

    public double getL3() {
        return L3;
    }
    
    //SET
    public void setL1(double L1) {
        this.L1 = L1;
    }

    public void setL2(double L2) {
        this.L2 = L2;
    }

    public void setL3(double L3) {
        this.L3 = L3;
    }
    
    //Operativos
    public double area(){
        double s,a;
        s = (L1+L2+L3)/2;
        a= Math.sqrt(s*(s-L1)*(s-L2)*(s-L3));
        return a;
    }   
    
    public double Perimetro(){
        return L1+L2+L3;
            
    }
    
    public String TipoTriangulo(){
        if(this.L1 == this.L2 && this.L1 == this.L3){
            return "Equilatero";
        }
        
        else{
            if(this.L1 != this.L2 && this.L1 != this.L3 && this.L2 != this.L3){
                return "Escaleno";
            }
            else {
                return "Isosceles";
            }
            
        }
    }
    
}
