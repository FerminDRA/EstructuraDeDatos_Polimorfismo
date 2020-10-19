package LogicoNegocios;

public class Romboide extends Figura{
    private double lado;

    public Romboide() {
        super();
    }

    public Romboide(double base, double altura,double lado) {
        super(base, altura);
        this.lado=lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    
    @Override
    public double area(){
        double areaRom;
        
        areaRom=base*altura;
        return areaRom;
    }
    
    @Override
    public double perimetro(){
        double periRom;
        
        periRom=(base*2)+(lado*2);
        return periRom;
    }
    
}
