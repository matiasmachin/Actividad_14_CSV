package Actividad_14;



import java.util.*;

import javax.print.attribute.Size2DSyntax;

import java.io.*;
import java.io.ObjectInputStream.GetField;
import java.security.PublicKey;





public class Lista {
	public static final String SEPARATOR=";";
	   public static final String QUOTE="\"";


	
	static Scanner sc = new Scanner(System.in);

	static ArrayList<Persona> lista = new ArrayList();

	public static void main(String[] args) {
		boolean bandera=false;
		
	
		
		while(bandera==false) {
			System.out.println("\n\n Ejercicio 13 Colecciones y Diccionarios\n\n");
			System.out.println(" Menu Principal: \n\n\n");
			System.out.println("1.- Cargar Datos.");
			System.out.println("2.- Mostrar Todos Los Datos.");
			System.out.println("3.- Insertar un Nuevo Registro.");
			System.out.println("4.- Eliminar un Registro.");
			System.out.println("5.- Mostrar el Numero de Registros.");
			System.out.println("6.- Buscar Persona por D.N.I.");
			System.out.println("7.- Buscar Persona por Nombre.");
			System.out.println("8.- Ordenar los Registros.");
			System.out.println("9.- Guadar Registros en Archivo CSV.");
			System.out.println("10.- Salir del Menu.");
			Scanner opcion=new Scanner(System.in);
			int opcc=opcion.nextInt();
			switch (opcc) {
			case 1:
				 System.out.println("\n Carga de Datos\n");
				 cargar();
				 break;
			case 2:
				System.out.println("\n Mostrar Todos los Datos\n");
				listar();
				pausa();
				break;
			case 3:
				System.out.println("\n Insertar un Nuevo Registro");
				insertar();
				break;
			case 4:
				System.out.println("\n Eliminar un Registro");
				eliminar();
				break;
			case 5:
				System.out.println("\n Mostrar el Numero de Registros");
				contar();
				break;
			case 6:
				System.out.println("\n Buscar Persona por D.N.I.");
				buscardni();
				break;	
			case 7:
				System.out.println("\n Buscar Persona por Nombre");
			    buscarnombre();
			  	break;	
			case 8:
				System.out.println("\n Ordenar Registros");
			    ordenar();
				break;	
			case 9:
				System.out.println("\n Guardar Registros en Archivo CSV");
			   //guardarcsv();
				crearArchivo();
		       break;	
			case 10:
				System.out.println("\n Salir del sistema");
				System.out.println("\n Adios.....");
				bandera=true;
				break;
			default:
				System.out.println("\n Esta opcion no esta disponible");
				
			}
		}
		
	}

	public static void cargar() {
		
		// atributo 
		Persona aux;
		int i=1;
		String nom;
		String ape;
		String dni2;
		int edad2;
		String calle2;
		int nro2;
		int cp2;
		String prov;
		
		
	    BufferedReader br = null;
	      
	      try {
	         
	         br  =new BufferedReader(new FileReader("tabla1.csv"));
	         String line = br.readLine();
	         while (null!=line) {
	            String [] datos = line.split(SEPARATOR);
	            nom=datos[0];
	            ape=datos[1];
	            dni2=datos[2];
	            edad2=Integer.parseInt(datos[3]);
	            calle2=datos[4];
	            nro2=Integer.parseInt(datos[5]);
	            cp2=Integer.parseInt(datos[6]);
	            prov=datos[7];
	            aux = new Persona(nom,ape,dni2,edad2,calle2,nro2,cp2,prov);
	            lista.add(aux);
	            System.out.println(Arrays.toString(datos));
	                     
	            line = br.readLine();
	         
	         }
	         
	      } catch (Exception e) {
	         
	      } finally {
	         if (null!=br) {
	            try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	         }
	      }
	   
		
		
	}


	private static String[] removeTrailingQuotes(String[] datos) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void listar() {
	int i=1;
	Iterator it = lista.iterator();
	while (it.hasNext()) {
		Object objeto=it.next();
		Persona producto=(Persona)objeto;
		System.out.println("El Registro Nro :" + i + "  Es el siguiente: " );
		System.out.println(producto);
		i++;
		}
	System.out.println("FIN DE LA LISTA"+"\n\n\n");
	
	}
	
	
public static void insertar() {
		
		// atributo 
		Persona aux;
		
		// Registros de prueba
		
		aux = new Persona("Matias","Machin Casanas","79060996Z",45,"Calle El Canal",3,38911,"Santa cruz de tenerife");
		lista.add(aux);                             // anadir registro a la lista
									
	}

public static void contar() {
	
	// atributo 
	Persona aux;
	
	// Registros de prueba
	
	System.out.println("Nro de Registros: "+ lista.size());
	                    // anadir registro a la lista
								
}

public static void eliminar() {
	
	int op=0;
	boolean bandera=false;
	
	Scanner teclado=new Scanner(System.in);
	Scanner tec=new Scanner(System.in);
			
	System.out.println("Indique el Nro del Registro que desea eliminar: ");
	op=teclado.nextInt();
		
	    if (op>=0 && op<=lista.size()) {
	       
		System.out.println("Nro de Registros: "+ lista.get(op-1));
		System.out.println(" Menu:");
		System.out.println("1.- Borrar registro:");
		System.out.println("2.- Salir:");
		int opc1=tec.nextInt();
		switch (opc1) {
		case 1:
			lista.remove(op-1);
			System.out.println( "El registro Nro: " + op + " ha sido eliminado");
			listar();
			contar();
			break;
		case 2:
			System.out.println( "El registro Nro: " + op + " NO ha sido eliminado");
			listar();
			break;
		          }
		
			
	    }	
		else 
		{
			System.out.println( "El registro Nro: " + op + " NO EXISTE");
		}

			
	}
	
public static void buscardni() {
	
	
	System.out.println("Introduce el D.N.I: a buscar: ");
	String dni = sc.nextLine();
	Persona search = lista.stream()
			.filter(lista -> lista.getDni().equalsIgnoreCase(dni))
            .limit(1)
            .findFirst().orElse(null);

    System.out.println(search);
    pausa();

}

public static void buscarnombre() {
	
	
	System.out.println("Introduce el Nombre: a buscar: ");
	String nombre1 = sc.nextLine();
	System.out.println("Lista de Registro con el nombre de: "+ nombre1);
	int j=0;
	int m=0;
	int tama=(lista.size());
	while( j!=tama) {
	if (lista.get(j).getNombre().equalsIgnoreCase(nombre1)) {
				System.out.println(lista.get(j));
	          
	}
	j++;
	}
	}

public static void ordenar() {
	Collections.sort(lista, new Comparator<Persona>() {
		@Override
		public int  compare(Persona p1, Persona p2) {
			return new String (p1.getNombre()).compareTo(new String (p2.getNombre()));
		}
	});
}




	public static void crearArchivo() {
		final String NEXT_LINE = "\n";
		final String delim=",";
		try {
			FileWriter fw = new FileWriter("archivonuevo.csv");
            for (int a=0; a!=lista.size();a++) {
			fw.append(lista.get(a).getNombre()) .append(delim);
			fw.append(lista.get(a).getApellido()) .append(delim);
			fw.append(lista.get(a).getDni()) .append(delim);
			int e=(lista.get(a).getEdad());
			String ed=Integer.toString(e);
			fw.append(ed) .append(delim);
			fw.append(lista.get(a).getCalle()) .append(delim);
			int f=(lista.get(a).getNro());
			String ef=Integer.toString(f);
			fw.append(ef) .append(delim);
			int g=(lista.get(a).getcodigop());
			String eg=Integer.toString(g);
			fw.append(eg) .append(delim);
			fw.append(lista.get(a).getProvincia()) .append(delim);
			fw.append(NEXT_LINE);
            }
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// Error al crear el archivo, por ejemplo, el archivo 
			// está actualmente abierto.
			e.printStackTrace();
		}
	}
	




public static void pausa() {
	
	String seguir;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Press Enter key to continue...");
    try
    {
        seguir = teclado.nextLine();
    }
    catch(Exception e)
    {}
	    
}




}
