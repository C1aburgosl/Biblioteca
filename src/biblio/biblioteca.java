package biblio;

import miLibreria.Entrada;
public class biblioteca {
	public static void main(String[] args) {
		Entrada entrada = new Entrada();
		ListaLibro listaLibro = new ListaLibro();
		ListaUsuario listaUsuario = new ListaUsuario();
		int opcion;
		boolean bucle = true;
		String titulo;
		String autor;
		String nombreUsuario;
		int ejemplares;
		
	
		do{	
			
			menu();
			opcion = entrada.obtenerEntero("Elige una opción");
	
			switch(opcion){
			case 1:
				titulo = entrada.obtenerString("Escribe el título del libro");
				autor = entrada.obtenerString("Escribe el nombre del autor");
				ejemplares = entrada.obtenerEntero("Escribe el numero de ejemplares del que dispones");
				
				listaLibro.insertarFinal(new NodoLibro(new Libro(autor,titulo,ejemplares)));
				entrada.obtenerString("Libro insertado correctamente \nPulsa [Intro] para continuar");
				break;
				
			case 2:
				System.out.println(listaLibro.mostrarTitulos());
				
				if(listaLibro.eliminarPosicion(entrada.obtenerEntero("Introduce el numero del libro que desees eliminar")))
					System.out.println("Se ha eliminado el libro correctamente");
				else
					System.out.println("No se ha podido eliminar el libro");
				
				entrada.obtenerString("Pulsa [Intro] para continuar");
				break;
			
			case 3:
				if(listaUsuario.eliminarPosicion(entrada.obtenerEntero(listaUsuario.mostrarNombres() + "Dime el numero del usuario a borrar")))
					System.out.println("El usuario se ha eliminado correctamente");
				else
					System.out.println("No se ha podido eliminar el usuario, prueba otra vez");
				
				entrada.obtenerString("Pulsa [Intro] para continuar");
				break;
			case 4:
				listaUsuario.insertarFinal(new NodoUsuario(new Usuario(entrada.obtenerString("Dime el nombre de usuario"))));
				entrada.obtenerString("Usuario insertado correctamente \nPulsa [Intro] para continuar");
				break;
			
			case 5:
				System.out.println(listaUsuario.toString());
				break;
			case 6:
				System.out.println(listaLibro.toString());
				break;
			case 7:
			case 8:
			case 9:
			case 10:
				
			case 0:
				bucle = false;
				break;
			}
				
		}while(bucle);
	}
	
	public static void menu(){
		System.out.println("1- Introducir nuevo libro");
		System.out.println("2- Eliminar libro");
		System.out.println("3- Eliminar usuario");
		System.out.println("4- Registro usuario");
		System.out.println("5- Listar Usuarios");
		System.out.println("6- Listar Libros");
		System.out.println("7- Prestar libro");
		System.out.println("8- Devolver libro");
		System.out.println("9- Modificar libro");
		System.out.println("10- Modificar usuario");
		System.out.println("------------------------------------------------------");
		System.out.println("0- Salir");
	}	
	
	
	
	

}