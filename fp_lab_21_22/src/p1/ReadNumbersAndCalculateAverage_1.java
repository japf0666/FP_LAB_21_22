package p1;

import utilidades.Teclado;

public class ReadNumbersAndCalculateAverage_1 {

	public static void main(String[] args) {
		
		char keepOnReading = 'y';
		
		int counter = 0;
		int total = 0;
		double average;
		
		while (keepOnReading == 'y' && counter < 5) {
			
			counter++;
			
			System.out.print("Type a number ---> ");
			
			int n = Teclado.readInt();
			total = total + n;
			//average = total/counter;
			average = (double) total/counter;
			
			System.out.println("total = " + total + ", counter = " + counter + ", average = " + average);
			System.out.println();
			
			System.out.print("More numbers (y/n): ");
			keepOnReading = Teclado.readChar();
		}
		System.out.println();
		System.out.println("Bye ... Program ReadNumbersAndCalculateAverage_1 is over. ");
	}

}
