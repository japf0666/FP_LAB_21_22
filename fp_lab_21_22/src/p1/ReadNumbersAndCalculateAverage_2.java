package p1;

import utilidades.Teclado;

public class ReadNumbersAndCalculateAverage_2 {

	public static final int NumberOfSamples = 5;

	public static void main(String[] args) {
		
		int counter = 0;
		int samples[] = new int[NumberOfSamples];
		int total = 0;
		
		// Reading samples
		
		System.out.println("Getting samples ...");
		for (counter = 0; counter < NumberOfSamples; counter++) {
			System.out.print("Sample[" + counter + "] ---> ");
			samples[counter] = Teclado.readInt();	
			
			// Just to see what's going on ...
			System.out.println("End of iteration " + counter);
			System.out.println(arrayToString(samples));
			System.out.println("---------------------");
			
		}
		
		// Calculate average
		System.out.println("All samples ready ...");
		for (counter = 0; counter < NumberOfSamples; counter++) {
			total = total + samples[counter];
		}
		
		// Showing Average
		System.out.println("Average = " + ((double)total/NumberOfSamples));
		System.out.println();
		System.out.println("Bye ... Program ReadNumbersAndCalculateAverage_2 is over. ");
	}
	
	
	public static String arrayToString(int [] a) {
		
		String s = "[";
		for (int i = 0; i < a.length; i++) {
			s = s + a[i] + "  ";
		}
		s = s + "]";
		return s;
	}

}
