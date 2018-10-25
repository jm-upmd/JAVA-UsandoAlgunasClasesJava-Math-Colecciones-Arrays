package calculo_dni;

import java.util.Scanner;

public class CalculoLetraDNI_String {

	public static void main(String[] args) {
		final String STRING_ASOCIACION_NIF = "TRWAGMYFPDXBNJZSQVHLCKE";
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el DNI sin letra: ");
		int dni = lector.nextInt();
		System.out.println("El DNI con letra es: " + dni + STRING_ASOCIACION_NIF.charAt(dni % 23));
		lector.close();

	}

}
