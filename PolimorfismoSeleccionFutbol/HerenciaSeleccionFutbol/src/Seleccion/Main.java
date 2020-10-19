//package Seleccion;
//
//import java.util.ArrayList;
//
//
///**
// * 
// * @author Richard
// *
// */
//public class Main {
//
//	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
//	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
//
//	public static void main(String[] args) {
//         	
//                Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
//		Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
//		Masajista raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);
//
//		integrantes.add(delBosque);
//		integrantes.add(iniesta);
//		integrantes.add(raulMartinez);
//
//		// CONCENTRACION
//                int i=0;
//                String nombre_clase;
//		System.out.println("Todos los integrantes comienzan una concentracion y viajan para jugar un partido. (Todos ejecutan el mismo método)");
//		for (SeleccionFutbol integrante : integrantes) { 
//                  /*para cada elemento en la colección integrantes, 
//                    asignamos el valor a una nueva variable de tipo SeleccionFutbol integrante, 
//                    y ejecutamos el cuerpo del bucle.
//                    //for (int i = 0; i < integrantes.size(); i++) {  
//                    //SeleccionFutbol integrante = integrantes.get(i); */           
//                    System.out.print("\n" + integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
//                    integrante.Concentrarse();
//                    System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
//                    integrante.Viajar();
//                    nombre_clase=integrante.getClass().getName();
//                    //System.out.print(nombre_clase);
//                    if (nombre_clase.compareTo("Seleccion.Entrenador")==0)
//                    {   
//                       //El casting es un procedimiento para transformar una variable primitiva de un tipo 
//                       // a otro, 
//                       //o transformar un objeto de una clase a otra clase siempre y cuando haya una relación 
//                       //de herencia entre ambas.
//                       Entrenador aux= (Entrenador) integrantes.get(i);
//                       System.out.print("Federacion -> " + aux.getIdFederacion()+ "\n");
//                       aux.dirigirEntrenamiento();
//                       aux.dirigirPartido();
//                    } else if (nombre_clase.compareTo("Seleccion.Futbolista")==0)
//                    {
//                       Futbolista aux= (Futbolista) integrantes.get(i);
//                       System.out.print("Dorsal -> " + aux.getDorsal()+ "\n");
//                       System.out.print("Demarcacion -> " + aux.getDemarcacion()+ "\n");
//                       aux.entrenar();
//                       aux.jugarPartido();
//                    } else
//                    {
//                        Masajista aux= (Masajista) integrantes.get(i);
//                        System.out.print("Titulo -> " + aux.getTitulacion()+ "\n");
//                        System.out.print("Años de Experiencia -> " + aux.getAniosExperiencia()+ "\n");
//                        aux.darMasaje();
//                    }
//                    
//                    i++;
//                 }
//		/*
//		// VIAJE
//		System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
//		for (SeleccionFutbol integrante : integrantes) {
//			System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
//			integrante.Viajar();
//		}
//		
//		// ENTRENAMIENTO
//		System.out.println("\nEntrenamiento: Solamente el entrenador y el futbolista tiene metodos para entrenar:");
//		System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");
//		delBosque.dirigirEntrenamiento();
//		System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");
//		iniesta.entrenar();
//		
//		// MASAJE
//		System.out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje:");
//		System.out.print(raulMartinez.getNombre()+" "+raulMartinez.getApellidos()+" -> ");
//		raulMartinez.darMasaje();
//		
//		// PARTIDO DE FUTBOL
//		System.out.println("\nPartido de Fútbol: Solamente el entrenador y el futbolista tiene metodos para el partido de fútbol:");
//		System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");
//		delBosque.dirigirPartido();
//		System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");
//		iniesta.jugarPartido();*/
//	}
//}
