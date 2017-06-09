package biblio;
import java.io.Serializable;
public class ListaLibroUsuario implements Serializable{
	private NodoLibroUsuario inicio;
	private int tama�o;
	
	public ListaLibroUsuario(){
		inicio = null;
		tama�o = 0;
	}
	
	public NodoLibroUsuario getInicio(){
		return inicio;
	}
	
	public int getTama�o(){
		return tama�o;
	}
	
	public void setInicio(NodoLibroUsuario inicio){
		this.inicio = inicio;
	}
	
	public void setTama�o(int tama�o){
		this.tama�o = tama�o;
	}
	
	public String toString(){
		String salida = "La lista contiene: ";
		NodoLibroUsuario auxiliar = inicio;
		
		while(auxiliar!=null){
			salida = salida + auxiliar.toString() + " ";
			auxiliar = auxiliar.getSiguiente();
		}
		salida = salida + "\nLa lista tiene " + tama�o + " elementos";
		return salida;
	}
	
	public void insertarInicio(NodoLibroUsuario nodo){
		nodo.setSiguiente(inicio);
		inicio = nodo;
		tama�o++;
	}
	
	public void insertarFinal(NodoLibroUsuario nodo){
		if(inicio == null) insertarInicio(nodo);
		else{
			NodoLibroUsuario aux = inicio;
			while(aux.getSiguiente()!=null){
				aux = aux.getSiguiente();
			
			}
			aux.setSiguiente(nodo);
			tama�o++;
		}
	}
	
	
	public boolean insertarPosicion(int posicion,NodoLibroUsuario nodo){
		if(posicion<0 || posicion>tama�o) return false;
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
				tama�o++;
				return true;
			}
			
		}
	}
	
	public boolean eliminarPrimero(){
		if(inicio==null) return false;
		else{
			NodoLibroUsuario aux = inicio;
			inicio = aux.getSiguiente();
			tama�o--;
			return true;
		}
	}
	
	public boolean eliminarUltimo(){
		int i = 0;
		if(inicio==null) return false;
		else{
			NodoLibroUsuario aux = inicio;
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
				tama�o--;
				return true;
			}
			
		}
	}

}