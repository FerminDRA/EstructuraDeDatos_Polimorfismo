package Seleccion;

/**
 * 
 * @author Richard
 *
 */
public class Masajista extends SeleccionFutbol {

	private String titulacion;

	private int aniosExperiencia;

	public Masajista() {
	}

	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
        
        @Override
        public String Concentrarse(){
            return ("El masajista se ha concentrando");
        }
        
        @Override
        public String Viajar(){
            return ("El masajista esta viajando");
        }

	public String darMasaje() {
		return ("Da un masaje");
	}

}
