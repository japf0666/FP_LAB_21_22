package utilidades;

import java.util.Random;

public class ArrayUtilities {
	
	/**
	 * Return an string representation of an array of integers
	 * @param a input array
	 * @return string representation of the input array
	 */
	public static String arrayToString(int [] a) {
		
		String s = "[";
		for (int i = 0; i < a.length - 1; i++) {
			s = s + a[i] + "  ";
		}
		s = s + a[a.length-1];
		s = s + "]";
		return s;
	}
	
	/**
	 * Returns an array of samples belonging to a normal distribution with
	 * a given mean and variance.
	 * @param nsamples Number of samples
	 * @param mean Mean of the Normal distribution used to get the samples
	 * @param sigma  Variance of the Normal distribution used to get the samples.
	 * @return Array of samples
	 */
	public static double [] getNormalRandom(int nsamples, double mean, double sigma) {
		
		if (nsamples < 0) {
			return null;
		}
		
		double samples [] = new double[nsamples];
		
		Random r = new Random();
		
		for (int i = 0; i < samples.length; i++) {
			samples [i] = mean + r.nextGaussian() * sigma;
		}
		
		return samples;
	}
	
	/**
	 * Returns samples of a Normal Distribution
	 * @param nsamples
	 * @return samples of a Normal Distribution
	 */
	public static int [] getRandom(int nsamples) {
		
		if (nsamples < 0) {
			return null;
		}
		
		int samples [] = new int[nsamples];
		
		Random r = new Random();
		double mean = 100 * Math.random();
		double sigma = (mean * Math.random())/5 + 1;
		
		for (int i = 0; i < samples.length; i++) {
			samples [i] = (int) Math.round(mean + r.nextGaussian() * sigma);
		}
		
		System.out.println("ArrayUtilities.getRandom [" + mean + ", " + sigma + "]");
		
		return samples;
	}
	
	/**
	 * Calculate the mean value (average) of the values stored in an array
	 * @param samples input values
	 * @return the mean value (average) of the values stored in an array
	 */
	public static double getMean (int samples[]) {
		int total = 0;
		for (int i = 0; i < samples.length; i++) {
			total = total + samples[i];
		}
		return (double)total/samples.length;
	}
	
	/**
	 * Calculate the variance of the values stored in an array
	 * @param samples input values
	 * @return the variance of the values stored in an array
	 */	
	public static double getVariance(int [] samples) {
		
		double mean = getMean (samples);
		double SS = 0;
		
		for (int i = 0; i < samples.length; i++) {
			double r = samples[i] - mean;
			SS += (r*r);
		}
		
		return SS/(samples.length - 1);
	}
	
	
	/**
	 * Calculate the standard deviation of the values stored in an array
	 * @param samples input values
	 * @return the standard deviation of the values stored in an array
	 */	
	public static double getSigma(int [] samples) {
		return Math.sqrt(getVariance(samples));
	}

}
