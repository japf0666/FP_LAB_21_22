package p1;

import utilidades.Teclado;

public class PlayingWithIntegersNonStop {
	
	
	public static void main(String args []) {
		
		char keepOnPlaying = 'y';
		
		while (keepOnPlaying == 'y') {
			showMaxAndMin();
			playingWithIntegers();
			System.out.println("One more time?(y/n): ");
			keepOnPlaying = Teclado.readChar();
		}
		
	}
	
	
	public static void showMaxAndMin() {
		System.out.println("interesting values ...");
		System.out.println();
		System.out.println("MinByte  ---> " + Byte.MIN_VALUE    + "\t\t\tMaxByte  ---> " + Byte.MAX_VALUE);
		System.out.println("MinShort ---> " + Short.MIN_VALUE   + "\t\t\tMaxShort ---> " + Short.MAX_VALUE);
		System.out.println("MinInt   ---> " + Integer.MIN_VALUE + "\t\tMaxInt   ---> "   + Integer.MAX_VALUE);
		System.out.println("MinLong  ---> " + Long.MIN_VALUE    + "\tMaxLong  ---> "     + Long.MAX_VALUE);				

		System.out.println();
	}
	
	public static void playingWithIntegers() {
		System.out.println();
		System.out.println("----------------------------------------");
		// Get some values from keyboard ...
		System.out.print("Type a byte value  b1 ---> ");
		byte b1 = Teclado.readByte();

		System.out.print("Type a short value s1 ---> ");		
		short s1 = Teclado.readShort();

		System.out.print("Type an int value  i1 ---> ");		
		int i1 = Teclado.readInt();

		System.out.print("Type a long value  l1 ---> ");		
		long l1 = Teclado.readLong();		
		
		// Show the input:
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("Input values ---> ");	
		System.out.println("b1 ---> " + b1);
		System.out.println("s1 ---> " + s1);
		System.out.println("i1 ---> " + i1);
		System.out.println("l1 ---> " + l1);
		
		b1 = (byte) s1;
		s1 = (short) i1;
		i1 = (int) l1;
		s1 = b1;
		l1 = i1;
		
		// Show variables again
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("New values ---> ");	
		System.out.println("b1 ---> " + b1);
		System.out.println("s1 ---> " + s1);
		System.out.println("i1 ---> " + i1);
		System.out.println("l1 ---> " + l1);
	}

}
