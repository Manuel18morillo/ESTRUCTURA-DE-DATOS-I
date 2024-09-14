package FiguraGeometrica;

public class Cuadrado {
    private double lado;
    
    //Contructores
    public Cuadrado(){
    lado = 0;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    //GET
    public double getLado() {
        return lado;
    }
    
    //SET
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //Calculos
    public double Perimetro(){
        return
            lado * 4;
    }
    
    public double Area(){
        return
            lado * lado;
              
    }
  
}
