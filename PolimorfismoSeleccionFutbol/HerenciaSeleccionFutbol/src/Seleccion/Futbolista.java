package Seleccion;

/**
 * 
 * @author Richard
 * 
 */
public class Futbolista extends SeleccionFutbol {

	private int dorsal;

	private String demarcacion;

	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
        
        @Override
        public String Concentrarse(){
            return ("El jugador se ha concentrando");
        }
        
        @Override
        public String Viajar(){
            return ("El masajista esta viajando");
        }

	public String jugarPartido() {
		return ("Juega un partido");
	}

	
        public String entrenar() {
		return ("Entrena");
	}

}
