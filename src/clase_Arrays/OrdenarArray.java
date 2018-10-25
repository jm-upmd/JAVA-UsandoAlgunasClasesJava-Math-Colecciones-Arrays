package clase_Arrays;

import java.util.Arrays;

public class OrdenarArray {
	
	public static void main(String[] args) {
		Integer[] miArray = new Integer[100];
		
		// Rellenamos entre 0 y 100 aleatoriamente
		
		for(int i= 0; i< 100; i++) {
			miArray[i]= (int) (Math.random() * (100 + 1));
		}
		
		for(int i= 0; i< 100; i++) {
			System.out.print(miArray[i]+ " " );
		}
		
		Arrays.sort(miArray);
		System.out.println("\nArray ordenado:");
		for(int i= 0; i< 100; i++) {
			System.out.print(miArray[i]+ " " );
		}
		
	}

}
