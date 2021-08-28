package p1;

import utilidades.ArrayUtilities;
import utilidades.Teclado;

public class ReadNumbersAndCalculateAverage_3 {
	
	
	public static final int NumberOfSamples = 5;

	

	public static void main(String[] args) {
		int samples[] = askForSamples(NumberOfSamples);
		System.out.println(ArrayUtilities.arrayToString(samples));
		System.out.println("Average = " + calculateAverage(samples));
		System.out.println();
		System.out.println("Bye ... Program ReadNumbersAndCalculateAverage_3 is over. ");
		
	}
	
	/**
	 * Ask for samples and store them in an array
	 * @param nSamples number of samples to read
	 * @return array of nSamples
	 */
	public static int [] askForSamples(int nSamples) {
		int samples[] = new int[nSamples];
		for (int i = 0; i < samples.length; i++) {
			System.out.print("Sample[" + i + "] ---> ");
			samples[i] = Teclado.readInt();	
		}
		return samples;
	}
	
	/**
	 * Calculate the mean value (average) of the values stored in an array
	 * @param samples input values
	 * @return the mean value (average) of the values stored in an array
	 */
	public static double calculateAverage(int samples[]) {
		int total = 0;
		for (int i = 0; i < samples.length; i++) {
			total = total + samples[i];
		}
		return (double)total/samples.length;
	}

}
