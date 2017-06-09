package biblio;

public class Usuario {
	private String nombre;
	private ListaLibroUsuario lista;

public Usuario(String nombre){
	this.nombre = nombre;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public ListaLibroUsuario getLista() {
	return lista;
}

public void setLista(ListaLibroUsuario lista) {
	this.lista = lista;
}

public void insertarLibro(Libro l){
	
}

public void verLibros(){
	
}

}
