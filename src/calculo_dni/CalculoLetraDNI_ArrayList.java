package calculo_dni;

import java.util.ArrayList;

import java.util.Scanner;

public class CalculoLetraDNI_ArrayList {

	public static void main(String[] args) {
		
		// Crea un array de char a partir del String con el método toCharArray de la clase String
		final char[] ARRAY_NIF = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();

		// Creo un ArrayList para almacenar tantos objetos Character con chars tiene ARRAY_INF
		// ArraList NO puede almacenar tipos simples, SOLO GUARDA OBJETOS
		ArrayList<Character> STRING_ASOCIACION_NIF = new ArrayList<Character>(ARRAY_NIF.length);
		
		
		// Para cadda char en el array  ARRAY_NIF añade un objeto Character 
		//en el ArrayList STRING_ASOCIACION_NIF.
		// El metodo add convertirá internamente el tipo primitivo en su Objeto envolvente.
		for(int i = 0; i < ARRAY_NIF.length; i++) {
			STRING_ASOCIACION_NIF.add(ARRAY_NIF[i]);
			//STRING_ASOCIACION_NIF.add(new Character(ARRAY_NIF[i]));
		}
	
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el DNI sin letra: ");
		int dni = lector.nextInt();
		System.out.println("El DNI con letra es: " + dni + STRING_ASOCIACION_NIF.get(dni % 23));
		lector.close();
	}
}
