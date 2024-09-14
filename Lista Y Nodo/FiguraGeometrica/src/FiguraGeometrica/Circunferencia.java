/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiguraGeometrica;

public class Circunferencia {
    //Contructores
    double diametro;
    
    public Circunferencia(){
        diametro = 0;
    }

    public Circunferencia(double diametro) {
        this.diametro = diametro;
    }

    //GET
    public double getDiametro() {
        return diametro;
    }
    
    //SET
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    public double Area() {
        double radio = diametro / 2;
        return Math.PI * Math.pow(radio, 2);
            
    }
    
    public double Perimetro() {
        return Math.PI * diametro;
    }
    
}
