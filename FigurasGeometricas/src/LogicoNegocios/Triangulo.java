package LogicoNegocios;

public class Triangulo extends Figura {
    private double lado1;
    private double lado2;

    public Triangulo() {
        super();
    }

    public Triangulo(double base, double altura,double lado1,double lado2) {
        super(base, altura);
        this.lado1=lado1;
        this.lado2=lado2;
    }
    
    @Override
    public double area(){
        double areaTri;
        
        areaTri=(base*altura)/2;
        return areaTri;
    }
    
    @Override
    public double perimetro(){
        double periTri;
        
        periTri=base+lado1+lado2;
        return periTri;
    }
    
    
}
