package biblio;
import java.io.*;
public class NodoUsuarioLibro implements Serializable{
	private String nombre;
	private NodoUsuarioLibro siguiente;
	
	public NodoUsuarioLibro(String nombre){
		this.nombre = nombre;
		this.siguiente = null;
	}
	
	public NodoUsuarioLibro(){
		nombre = null;
		siguiente = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public NodoUsuarioLibro getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoUsuarioLibro siguiente) {
		this.siguiente = siguiente;
	}
	
	public String toString(){
		return "Nombre: " + this.nombre;
	}
}