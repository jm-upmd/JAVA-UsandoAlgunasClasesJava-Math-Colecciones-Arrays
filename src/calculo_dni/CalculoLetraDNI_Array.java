package calculo_dni;

import java.util.Scanner;

public class CalculoLetraDNI_Array {

	public static void main(String[] args) {
		final char[] STRING_ASOCIACION_NIF = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q',
				'V','H','L','C','K','E'};
		
		// Forma más comoda de crear el array usando metodo toCharArray de la clase String
		//final char[] STRING_ASOCIACION_NIF = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();
	
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el DNI sin letra: ");
		int dni = lector.nextInt();
		System.out.println("El DNI con letra es: " + dni + STRING_ASOCIACION_NIF[dni % 23]);
		lector.close();
	}

}
