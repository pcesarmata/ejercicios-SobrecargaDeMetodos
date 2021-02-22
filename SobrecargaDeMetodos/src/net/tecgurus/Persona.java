/**
 * 
 */
package net.tecgurus;

/**
 * @author Cesar
 *
 */
public class Persona {
	private int edad;
	private String nombre;

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona() {
		edad = 0;
		nombre = "anonimo";
	}

	public Persona(String nuevoNombre) {
		edad = 30;
		nombre = nuevoNombre;
	}
	
	public Persona(int nuevaEdad) {
		edad = nuevaEdad;
		nombre = "César Mata";
	}
	
}