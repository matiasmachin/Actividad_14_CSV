/**
 * 
 */
package Actividad_14;

/**
 * @author Matias Machin
 *
 */
public class Direccion {
	
	public String calle;
	public int codigop;
	public int nro;
	public String provincia;
	
	//Constructores
	
	public Direccion() {
		this.calle="";
		this.codigop=0;
		this.nro=0;
		this.provincia="";
		
	}

	public Direccion(String calle, int codigop, int nro, String provincia) {
		this.calle=calle;
		this.codigop=codigop;
		this.nro=nro;
		this.provincia=provincia;
	}


	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Calle: ");
		sb.append(calle +"\n");
		sb.append("Codigo Postal: ");
		sb.append(codigop +"\n");
		sb.append("N�mero: ");
		sb.append(nro +"\n");
		sb.append("Provincia: ");
		sb.append(provincia +"\n");
		return sb.toString();
		}
	//Metodos getter y setter
	
	
	/**
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * @return the nro
	 */
	public int getNro() {
		return nro;
	}

	

	

	/**
	 * @return the codigop
	 */
	public int getcodigop() {
		return codigop;
	}

	

	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}

	

	
	

	
	
}

