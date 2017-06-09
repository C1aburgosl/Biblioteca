package biblio;
import java.io.*;

public class ListaLibro implements Serializable{
	private NodoLibro inicio;
	private int tamaño;
	
	public ListaLibro(){
		inicio = null;
		tamaño = 0;
	}
	
	public NodoLibro getInicio(){
		return inicio;
	}
	
	public int getTamaño(){
		return tamaño;
	}
	
	public void setInicio(NodoLibro inicio){
		this.inicio = inicio;
	}
	
	public void setTamaño(int tamaño){
		this.tamaño = tamaño;
	}
	
	public String toString(){
		String salida = "";
		NodoLibro auxiliar = inicio;
		
		while(auxiliar!=null){
			salida = salida + auxiliar.toString() + " ";
			auxiliar = auxiliar.getSiguiente();
		}
		salida = salida + "\nHay " + tamaño + " libros";
		return salida;
	}
	
	public String mostrarTitulos(){
		String salida = "";
		NodoLibro auxiliar = inicio;
		int contador = 0;
		
		while(auxiliar!=null){
			salida = salida + contador+ "- " + auxiliar.getLibro().getTitulo() + "\n";
			auxiliar = auxiliar.getSiguiente();
			contador++;
		}
		return salida;
	}
	
	public void insertarInicio(NodoLibro nodo){
		nodo.setSiguiente(inicio);
		inicio = nodo;
		tamaño++;
	}
	
	public void insertarFinal(NodoLibro nodo){
		if(inicio == null) insertarInicio(nodo);
		else{
			NodoLibro aux = inicio;
			while(aux.getSiguiente()!=null){
				aux = aux.getSiguiente();
			
			}
			aux.setSiguiente(nodo);
			tamaño++;
		}
	}
	
	
	public boolean insertarPosicion(int posicion,NodoLibro nodo){
		if(posicion<0 || posicion>tamaño) return false;
		else{
			NodoLibro aux = inicio;
			if(posicion==0){
				insertarInicio(nodo);
				return true;
			}else{
				for(int i=0;i<posicion-1;i++){
					aux = aux.getSiguiente();
			
				}
				nodo.setSiguiente(aux.getSiguiente());
				aux.setSiguiente(nodo);
				tamaño++;
				return true;
			}
			
		}
	}
	
	public boolean eliminarPrimero(){
		if(inicio==null) return false;
		else{
			NodoLibro aux = inicio;
			inicio = aux.getSiguiente();
			tamaño--;
			return true;
		}
	}
	
	public boolean eliminarUltimo(){
		int i = 0;
		if(inicio==null) return false;
		else{
			NodoLibro aux = inicio;
			while(i<tamaño-2){
				aux=aux.getSiguiente();
				i++;
			}
			aux.setSiguiente(null);
			tamaño--;
			return true;
		}
	}
	
	public boolean eliminarPosicion(int posicion){
		if(posicion<0 || posicion>tamaño) return false;
		else{
			NodoLibro aux = inicio;
			NodoLibro aux2 = inicio;
			if(posicion==0){
				eliminarPrimero();
				return true;
			}else{
				for(int i=0;i<posicion-1;i++){
					aux = aux.getSiguiente();
			
				}
				for(int i=0;i<posicion+1;i++){
					aux2 = aux2.getSiguiente();
			
				}
				aux.setSiguiente(aux2);
				tamaño--;
				return true;
			}
			
		}
	}

}
