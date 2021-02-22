/**
 * 
 */
package net.tecgurus;

/**
 * @author Cesar
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int edadNueva = 32;
		
		// Constructor de la clase persona sin parametros.
		Persona personaUno = new Persona();
		System.out.println(personaUno.getNombre());
		System.out.println(personaUno.getEdad());

		// Constructor de la clase persona con parametros de una cadena de texto
		Persona personaDos = new Persona("César");
		System.out.println(personaDos.getNombre());
		System.out.println(personaDos.getEdad());

		// Constructor de la clase persona con parametros de una tipo de datos númericos
		Persona personaTres = new Persona(edadNueva);
		System.out.println(personaTres.getNombre());
		System.out.println(personaTres.getEdad());
	}
}