package miLibreria;

import java.util.Scanner;

public class Entrada {
	
	Scanner Entrada = new Scanner (System.in);
	
	
	public int obtenerEntero(String msg){
		String teclado;
		int entrada=0;
		boolean loop;
		loop = true;
				
		while (loop) {
			try {
				System.out.println(msg);
				teclado=Entrada.nextLine();
				entrada = Integer.valueOf(teclado);
				loop=false;
				
			} catch (java.lang.NumberFormatException e) {
				System.out.println("El valor introducido no es un entero"); 
			}
		}
		return entrada;
	}
	public long obtenerLong(String msg){
		String teclado;
		long entrada=0;
		boolean loop;
		loop = true;
				
		while (loop) {
			try {
				System.out.println(msg);
				teclado=Entrada.nextLine();
				entrada = Long.valueOf(teclado);
				loop=false;
				
			} catch (java.lang.NumberFormatException e) {
				System.out.println("El valor introducido no es un long"); 
			}
		}
		return entrada;
	}
	
	public float obtenerFloat(String msg){
		String teclado;
		float entrada=0;
		boolean loop;
		loop = true;
				
		while (loop) {
			try {
				System.out.println(msg);
				teclado=Entrada.nextLine();
				entrada = Float.parseFloat(teclado);
				loop=false;
				
			} catch (java.lang.NumberFormatException e) {
				System.out.println("El valor introducido no es un float"); 
			}
		}
		return entrada;
	
		
	}
	public String obtenerString(String msg){
		String entrada="0";
		boolean loop;
		loop = true;
				
		while (loop) {
			try {
				System.out.println(msg);
				entrada=Entrada.nextLine();
				loop=false;
				
			} catch (java.lang.NumberFormatException e) {
				System.out.println("El valor introducido no es un string"); 
			}
		}
		return entrada;
	
		
	}
	public char obtenerChar(String msg) {
		String teclado;
		char entrada=0;
		boolean loop;
		loop = true;
				
		while (loop) {
			try {
				System.out.println(msg);
				teclado=Entrada.nextLine();
				entrada = teclado.charAt(0);
				loop=false;
				
			} catch (java.lang.NumberFormatException e) {
				System.out.println("El valor introducido no es un float"); 
			}
		}
		return entrada;
		
	}
	public boolean obtenerBoolean(String string) {
		// TODO Auto-generated method stub
		return false;
	}
}
