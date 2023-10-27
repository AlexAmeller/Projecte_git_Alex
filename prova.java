package programacion;

import java.util.Scanner;

public class multiple7 {

	public static void main(String[] args) {
		//Declaram un Scanner 4jfi4jf4i
		Scanner sc = new Scanner(System.in);
						
		//Declaram variable
		int numero;
						
		//Imprimim una ordre
		System.out.println("Introdueix un nuombre");
						
		//Guardam dins numero el nombre introduït
		numero = sc.nextInt();
		
		//Declaram una variablei li assignam un valor
		int res = numero%7;
		
		//Declaram una variablei li assignam un valor
		int resultado = (res == 0) ? 0 : (7 -res);

		//Imprimim un resultat
		System.out.println("Hay que sumarle " + resultado + " para que sea multiplede 7");

	}

}
