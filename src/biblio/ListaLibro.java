package biblio;
import java.io.*;

public class ListaLibro implements Serializable{
	private NodoLibro inicio;
	private int tama�o;
	
	public ListaLibro(){
		inicio = null;
		tama�o = 0;
	}
	
	public NodoLibro getInicio(){
		return inicio;
	}
	
	public int getTama�o(){
		return tama�o;
	}
	
	public void setInicio(NodoLibro inicio){
		this.inicio = inicio;
	}
	
	public void setTama�o(int tama�o){
		this.tama�o = tama�o;
	}
	
	public String toString(){
		String salida = "";
		NodoLibro auxiliar = inicio;
		
		while(auxiliar!=null){
			salida = salida + auxiliar.toString() + " ";
			auxiliar = auxiliar.getSiguiente();
		}
		salida = salida + "\nHay " + tama�o + " libros";
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
		tama�o++;
	}
	
	public void insertarFinal(NodoLibro nodo){
		if(inicio == null) insertarInicio(nodo);
		else{
			NodoLibro aux = inicio;
			while(aux.getSiguiente()!=null){
				aux = aux.getSiguiente();
			
			}
			aux.setSiguiente(nodo);
			tama�o++;
		}
	}
	
	
	public boolean insertarPosicion(int posicion,NodoLibro nodo){
		if(posicion<0 || posicion>tama�o) return false;
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
				tama�o++;
				return true;
			}
			
		}
	}
	
	public boolean eliminarPrimero(){
		if(inicio==null) return false;
		else{
			NodoLibro aux = inicio;
			inicio = aux.getSiguiente();
			tama�o--;
			return true;
		}
	}
	
	public boolean eliminarUltimo(){
		int i = 0;
		if(inicio==null) return false;
		else{
			NodoLibro aux = inicio;
			while(i<tama�o-2){
				aux=aux.getSiguiente();
				i++;
			}
			aux.setSiguiente(null);
			tama�o--;
			return true;
		}
	}
	
	public boolean eliminarPosicion(int posicion){
		if(posicion<0 || posicion>tama�o) return false;
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
				tama�o--;
				return true;
			}
			
		}
	}

}
