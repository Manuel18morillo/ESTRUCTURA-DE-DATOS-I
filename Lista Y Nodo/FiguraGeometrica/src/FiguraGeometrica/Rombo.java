package FiguraGeometrica;


public class Rombo {
    //Contructores
   private double lado,diagonalmayor,diagonalmenor;
   
    public Rombo(){
        lado = 0;
        diagonalmayor = 0;
        diagonalmenor = 0;
    }

    public Rombo(double lado, double diagonalmayor, double diagonalmenor) {
        this.lado = lado;
        this.diagonalmayor = diagonalmayor;
        this.diagonalmenor = diagonalmenor;
    }
    
    //GET
    public double getLado() {
        return lado;
    }

    public double getDiagonalmayor() {
        return diagonalmayor;
    }

    public double getDiagonalmenor() {
        return diagonalmenor;
    }
    
    //SET
    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setDiagonalmayor(double diagonalmayor) {
        this.diagonalmayor = diagonalmayor;
    }

    public void setDiagonalmenor(double diagonalmenor) {
        this.diagonalmenor = diagonalmenor;
    }
    
    public double Perimetro (){
        return 4 * lado;
    }
    
    public double Area(){
        return (diagonalmayor * diagonalmenor) / 2;
    }
    
    public boolean diagonalesValidas() {
        return diagonalmayor > diagonalmenor;
    }
   
}
