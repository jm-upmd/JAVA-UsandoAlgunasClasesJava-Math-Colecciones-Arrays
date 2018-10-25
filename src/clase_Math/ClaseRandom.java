package clase_Math;


// Llenar un array con 100 enteros comprendidos entre 40 y 80, generados de forma aleatoria 
// Mostrar los impares elevado a 3

public class ClaseRandom {
	
	
	public static void main(String[] args) {
		int[] listaEnteros = new int[100];
		final int DESDE = 40;
		final int HASTA = 80;
		int numeroAleatorio;
		for(int i = 0; i < listaEnteros.length; i++) {
			
			// Math.random() devuelve un número double entre 0 y 0.1 (0.1 no incluido)
			numeroAleatorio = (int) (Math.random() * (HASTA - DESDE + 1)) + DESDE;
			listaEnteros[i]= numeroAleatorio; 
		}
		
		for(int i: listaEnteros) {
			if(i % 2 != 0) {
				System.out.printf("%d\t%d\n", i, (int)Math.pow(i, 3));
			}
			
		}
	}

}
