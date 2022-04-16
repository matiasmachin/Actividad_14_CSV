/**
 * 
 */
package Actividad_14;

/**
 * @author Matias Machin
 *
 */
public class Persona extends Direccion{

	public String nombre;
	public String apellido;
	public String dni;
	public int edad;
	//public Direccion direccion;

	// Constructor con parametros

	/*
	 * public Persona1(String nombre, String apellido, String dni, int edad) {
	 * this("","","",0);
	 * 
	 * }
	 */
	public Persona() {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.calle=calle;
		this.nro=nro;
		this.codigop=codigop;
		this.provincia=provincia;

	}

	public Persona(String nombre, String apellido, String dni, int edad,String calle,int nro, int codigop, String provincia) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.edad=edad;
		this.calle=calle;
		this.nro=nro;
		this.codigop=codigop;
		this.provincia=provincia;
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

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

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
	 * @return the direccion
	 *//*
		 * public Direccion getDireccion() { return direccion; }
		 */

	/**
	 * @param direccion the direccion to set
	 *//*
		 * public void setDireccion(Direccion direccion) { this.direccion = direccion; }
		 */

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		/*
		 * sb.append("Nombre: "); sb.append(nombre + "\n"); sb.append("Apellido: ");
		 * sb.append(apellido + "\n"); sb.append("D.N.I: "); sb.append(dni + "\n");
		 * sb.append("Edad: "); sb.append(edad + "\n"); sb.append("Calle: ");
		 * sb.append(calle + "\n"); sb.append("Nro: "); sb.append(nro + "\n");
		 * sb.append("Codigo Postal: "); sb.append(codigop + "\n");
		 * sb.append("Provincia: "); sb.append(provincia + "\n");
		 */
		sb.append("Nombre: "+ nombre + "  Apellido: " + apellido + " D.N.I: "+ dni + "  Edad: "+ edad +"\n");
		sb.append("Calle: " + calle + " Nro: "+ nro + "  Codigo Postal: " + codigop + "  Provincia: " + provincia + "\n");
		
		 
		return sb.toString();
	}

}
