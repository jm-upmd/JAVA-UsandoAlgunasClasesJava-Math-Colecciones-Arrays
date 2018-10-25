package calculo_dni;

import java.util.HashMap;
import java.util.Scanner;

public class CalculaLetraDNI_HashMap {

	public static void main(String[] args) {
		// Crea un array de char a partir del String con el método toCharArray de la clase String
		final char[] ARRAY_NIF = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();
		
		// Crea un HasMap con clave tipo integer y valor tipo Character de la misma longitud inicial
		// que el array ARRAY_NIF
		HashMap<Integer, Character> STRING_ASOCIACION_NIF = new HashMap<>(ARRAY_NIF.length);
		
		// Guarda en el HashMap los elementos del array.
		// Esta guardando pares de OBJETOS Integer,Character
		// Está haciendo la conversión de los tipos primitivos a los objetos de forma implicita
		for(int i=0; i<ARRAY_NIF.length; i++) {
			STRING_ASOCIACION_NIF.put(i, ARRAY_NIF[i]);
			//STRING_ASOCIACION_NIF.put(new Integer(i), new Character(ARRAY_NIF[i]));

		}
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el DNI sin letra: ");
		int dni = lector.nextInt();
		System.out.println("El DNI con letra es: " + dni + STRING_ASOCIACION_NIF.get(dni % 23));
		lector.close();
		
	}

}
