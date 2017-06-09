package biblio;
import java.io.Serializable;
public class ListaLibroUsuario implements Serializable{
	private NodoLibroUsuario inicio;
	private int tamaño;
	
	public ListaLibroUsuario(){
		inicio = null;
		tamaño = 0;
	}
	
	public NodoLibroUsuario getInicio(){
		return inicio;
	}
	
	public int getTamaño(){
		return tamaño;
	}
	
	public void setInicio(NodoLibroUsuario inicio){
		this.inicio = inicio;
	}
	
	public void setTamaño(int tamaño){
		this.tamaño = tamaño;
	}
	
	public String toString(){
		String salida = "La lista contiene: ";
		NodoLibroUsuario auxiliar = inicio;
		
		while(auxiliar!=null){
			salida = salida + auxiliar.toString() + " ";
			auxiliar = auxiliar.getSiguiente();
		}
		salida = salida + "\nLa lista tiene " + tamaño + " elementos";
		return salida;
	}
	
	public void insertarInicio(NodoLibroUsuario nodo){
		nodo.setSiguiente(inicio);
		inicio = nodo;
		tamaño++;
	}
	
	public void insertarFinal(NodoLibroUsuario nodo){
		if(inicio == null) insertarInicio(nodo);
		else{
			NodoLibroUsuario aux = inicio;
			while(aux.getSiguiente()!=null){
				aux = aux.getSiguiente();
			
			}
			aux.setSiguiente(nodo);
			tamaño++;
		}
	}
	
	
	public boolean insertarPosicion(int posicion,NodoLibroUsuario nodo){
		if(posicion<0 || posicion>tamaño) return false;
		else{
			NodoLibroUsuario aux = inicio;
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
			NodoLibroUsuario aux = inicio;
			inicio = aux.getSiguiente();
			tamaño--;
			return true;
		}
	}
	
	public boolean eliminarUltimo(){
		int i = 0;
		if(inicio==null) return false;
		else{
			NodoLibroUsuario aux = inicio;
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
			NodoLibroUsuario aux = inicio;
			NodoLibroUsuario aux2 = inicio;
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