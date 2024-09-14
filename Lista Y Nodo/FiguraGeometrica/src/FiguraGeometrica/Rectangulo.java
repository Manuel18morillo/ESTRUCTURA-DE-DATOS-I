package FiguraGeometrica;

public class Rectangulo {
    private double altura, base;
    //Contructores
    public Rectangulo(){
        base = altura = 0;
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    //GET
    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
    
    //SET

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    //ACCIONES
    public double area(){
        return base * altura ;
    }
    public double perimetro(){
        return 2*base + 2*altura;
    }
    
}
