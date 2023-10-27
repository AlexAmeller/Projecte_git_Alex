package test;

import java.util.Scanner;

public class multiple7 {

	public static void main(String[] args) {
			//
			Scanner sc = new Scanner(System.in);
			//
			System.out.println("Introducir un numero para convertir en multiplo de 7 ");
			//
			int numero = sc.nextInt();
			int residuo = numero%7;
			int resultado = (residuo == 0 )? 0 : (7 - residuo);
			//
			System.out.println(" hay que sumar " + resultado + " para que nuestro numero sea multiplo de 7 ");
			
			
		
		
	}

}
