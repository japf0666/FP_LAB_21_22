package p1;

import utilidades.ArrayUtilities;

public class CalculateVariance {

	public static void main(String[] args) {

		int [] samples = ArrayUtilities.getRandom(20);
		System.out.println(ArrayUtilities.arrayToString(samples));
		
		System.out.println(ArrayUtilities.getMean(samples));
		System.out.println(ArrayUtilities.getSigma(samples));
	}
}
