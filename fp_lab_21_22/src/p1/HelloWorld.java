package p1;

import utilidades.Teclado;

public class HelloWorld {

	public static void main(String[] args) {
		
		// Greets the world
		System.out.println("Hello World");
		
		// Declare and initialize a variable
		int x = 5;
		
		// Print the value of x
		System.out.println("x = " + x);
		
		// Ask for a new value of x
		System.out.println("Type a value for x ---> ");
		
		// Get the x's value
		x = Teclado.readInt();
		
		// Show the new x's value
		System.out.println("x = " + x);
		
		// Say goodbye
		System.out.println("Good bye ...");		

	}

}
