package Seleccion;

/**
 * 
 * @author Richard
 * 
 */
public class Entrenador extends SeleccionFutbol {

	private String idFederacion;

	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
        
        @Override
        public String Concentrarse(){
            return ("El entrenador se ha concentrando");
        }
        
        @Override
        public String Viajar(){
            return ("El entrenador esta viajando");
        }
        
	public String dirigirPartido() {
		return ("Dirige un partido");
	}

	public String dirigirEntrenamiento() {
		return ("Dirige un entrenamiento");
	}

}
