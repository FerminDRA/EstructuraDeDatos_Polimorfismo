package LogicoNegocios;


public class Rectangulo extends Figura {

    public Rectangulo() {
        super();
    }

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }
    
    @Override
    public double area(){
        double areaRec;
        
        areaRec=base*altura;
        
        return areaRec;
    }
    
    @Override
    public double perimetro(){
        double periRec;
        
        periRec=(base*2)+(altura*2);
        
        return periRec;
    }
    
}
