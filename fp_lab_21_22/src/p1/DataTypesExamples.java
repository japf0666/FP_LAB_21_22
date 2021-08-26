package p1;

/**
 * Examples of using built-in types. Operations, range, precision ...
 * @author japf0
 *
 */
public class DataTypesExamples {

	
	public static void main(String [] args){
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("CADENAS DE CARACTERES");
		System.out.println("La salida por sonsola se puede hacer mediante system.out.println(texto)");
		System.out.println("Los caracteres especiales se imprimen con secuencias de escape");
		System.out.println("hola \\ \n que tal\t tabulador, comillas \" ");
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("CARACTERES");		
		
		char a = 'a';
		char b = 'b';
				
		System.out.println("Los caracteres se pueden comparar");
		System.out.println("a > b es " + (a > b));
		System.out.println();
		
		System.out.println("Los caracteres se pueden sumar, restar, dividir,... pero ...");
		System.out.println("el resultado debe asignarse a una variable numérica.");
		
		int c = 'a' + b;

		System.out.println("int c = 'a' + 'b' = " + c);
		System.out.println();
		System.out.println("La variable numérica puede convertirse en char (cast explícito).");
		
		char f = (char)c;
		
		System.out.println();
		System.out.println("char f = (char)c = " + f);
		System.out.println();
		
		// Mire que pasa si descomenta la siguiente sentencia.
		// char g = a + b;
		
		System.out.println("Los caracteres que no aparecen en el teclado se pueden sustituir por su codigo:");
		System.out.println("\\u007e = " + '\u007e');
		System.out.println("\u0370 \u0371 Soy un String con dos caracteres griegos");
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("VARIABLES NUMÉRICAS");			
		
		// Notación hexadecimal.
		int y2 =  0x9; 
		int y3 = -0x9;
			
		System.out.println("int y2 = " + y2 + "\tHEX -> " + Integer.toHexString(y2));
		System.out.println("int y3 = " + y3 + "\tHEX -> " + Integer.toHexString(y3));	
		System.out.println();
		System.out.println("Observe que la operación de modulo tiene signo: (7%3) = "  + (( 7)%3));	
		System.out.println("Observe que la operación de modulo tiene signo: (-7%3) = " + ((-7)%3));	
		System.out.println("La operación de modulo puede aplicarse a los tipos reales: (-7.12%3) = " + ((-7.12)%3));
		System.out.println("La operación de modulo puede aplicarse a los tipos reales: (-7.12%3.2) = " + ((-7.12)%3.2));
		System.out.println();
		System.out.println("La división por cero en los tipos reales: (7.0/0) = " + (7.0/0));	
		System.out.println("no produce error sino un valor especial");		
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("DESBORDAMIENTO DE VARIABLES ENTERAS");			
		System.out.println("Mucho cuidado con los desbordamientos de las variables enteras.");		
		System.out.println("Java no deja escribir valores fuera de rango, pero si el desbordamiento");	
		System.out.println("se produce como consecuencia de una operación matemática, ");			
		System.out.println("el sistema no informa de error, se vuelve a \"contar\" desde el principio.");
		System.out.println();
		
		System.out.println("Máximo valor int = 2147483647");	
		System.out.println("2147483647 + 1 = " + (2147483647 + 1));			
		System.out.println("2147483647 * 2 = " + (2147483647 * 2));		
		
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("PRECISION FINITA DE VARIABLES REALES");			
		System.out.println("Las variables reales tienen precisión finita y variable en su rango.");
		System.out.println();
		
		float  z1 = 1f / 3f;
		System.out.println("float   z1 = (float)(1f / 3f) = " + z1);
		z1 = 100000f / 3f;
		System.out.println("float   z1 = (float)(100000f / 3f) = " + z1);
		z1 = 10000000f / 3f;
		System.out.println("float   z1 = (float)(10000000f / 3f) = " + z1);
		
		System.out.println();
		System.out.println("La precisión va disminuyendo a medida que aumenta el valor absoluto del número.");
		System.out.println();
		
		z1 = 200100f; 
		System.out.println("z1 = 200100f,  el valor de z1 almacenado es:       " + z1);
		z1 += 1f; 
		System.out.println("z1 = 200100f, el valor almacenado para z1+1 es:    " + z1);
		z1 = 200100f; 
		z1 += 11f;
		System.out.println("z1 = 200100f, el valor almacenado para z1+11 es:   " + z1);
		z1 = 200100f; 
		z1 += 111f; 
		System.out.println("z1 = 200100f, el valor almacenado para z1+111 es:  " + z1);
		z1 = 200100f; 
		z1 += 1111f; 
		System.out.println("z1 = 200100f, el valor almacenado para z1+1111 es: " + z1);
		
		System.out.println();
		System.out.println("Llega un momento en que la precisión es menor que la unidad, la decenas ... ");	
		System.out.println();
		
		z1 = 200000100f; 
		System.out.println("z1 = 200000100f,  el valor de z1 almacenado es:       " + z1);
		z1 += 1f; 
		System.out.println("z1 = 200000100f, el valor almacenado para z1+1 es:    " + z1);
		z1 = 200000100f; 
		z1 += 11f;
		System.out.println("z1 = 200000100f, el valor almacenado para z1+11 es:   " + z1);
		z1 = 200000100f; 
		z1 += 111f; 
		System.out.println("z1 = 200000100f, el valor almacenado para z1+111 es:  " + z1);
		z1 = 200000100f; 
		z1 += 1111f; 
		System.out.println("z1 = 200000100f, el valor almacenado para z1+1111 es: " + z1);
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("EXPRESIONES BOOLEANAS");	
		boolean ba = true;
		boolean bb = false;
		System.out.println("Devuelven true o false. ");
		System.out.println("Con variables booleanas los operadore | y || y & y &&  ");
		System.out.println("son funcionalmente equivalentes.  ");
		System.out.println();
		
		System.out.println("boolean ba = true, bb = false -> ");	
		System.out.println();
		System.out.println("ba | bb  = " + (ba|bb));
		System.out.println("ba || bb = " + (ba||bb));
		System.out.println("ba & bb  = " + (ba&bb));
		System.out.println("ba && bb = " + (ba&&bb));		
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("OPERACIONES SOBRE BITS");
		System.out.println("Con variables enteras los operadore | y & trabajan bit a bit y devuelven un entero. ");		
		System.out.println();
		System.out.println("short ia = 0xff, ib = 0xaa, ic = 0x55");
		System.out.println();
		short ia = 0xff;
		short ib = 0xaa;	
		short ic = 0x55;
		short id1 =  0xf5;
		short id2 = -0xf5;
		System.out.println("ib | ic = 0x" + Integer.toHexString(ib|ic) + " = " + Integer.toBinaryString(ib|ic));
		System.out.println("ia & ib = 0x" + Integer.toHexString(ia&ib) + " = " + Integer.toBinaryString(ia&ib));
		System.out.println("ia & ic = 0x" + Integer.toHexString(ia&ic) + " =  " + Integer.toBinaryString(ia&ic));
		
		System.out.println("id1 = 0x" + Integer.toHexString(id1) + " =  " + Integer.toBinaryString(id1));
		System.out.println("id2 = 0x" + Integer.toHexString(id2) + " =  " + Integer.toBinaryString(id2));
		
		System.out.println("id1>>>4 = 0x" + Integer.toHexString(id1>>>4) + " =  " + Integer.toBinaryString(id1>>>4));
		System.out.println("id2>>>4 = 0x" + Integer.toHexString(id2>>>4) + " =  " + Integer.toBinaryString(id2>>>4));
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("CLASE Math");
		System.out.println("El valor absoluto de -67 es: " + Math.abs(-67));
		System.out.println("La raíz cuadrada de 56.4 es: " + Math.sqrt(56.4));
		System.out.println("El seno de PI/4 es         : " + Math.sin(Math.PI/4));
	}
}
