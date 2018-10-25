package clase_Arrays;

import java.util.Arrays;

public class CopiarArray {

	public static void main(String[] args) {
		int[] array = {23, 43, 55, 12, 65, 88, 92};
		
		// Copia de array entero
		 
		int[] copiaDeArray = Arrays.copyOf(array,array.length);
		
		// Copia un rango del array original
		
		int[] cachoArray = Arrays.copyOfRange(array, 2, 5);
		
		muestraArray("Original", array);
		muestraArray("Copia", copiaDeArray);
		muestraArray("Copia desde el tercer al quinto elemento", cachoArray);

	}
	
	static void muestraArray(String coment, int[] array) {
		System.out.println("\n" + coment);
		for(int i: array) System.out.print(i + " ");
	}

}
