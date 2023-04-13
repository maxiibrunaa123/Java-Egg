package Guia02.Extras;

import java.util.Scanner;

public class Extra4 {
	/*
		Elaborar un algoritmo en el cual se ingrese un número entre 1 y 10 y
		se muestre su equivalente en romano.
		 */
	public static void extra4(){

		int n;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese numero de 1 al 10");
		n = scanner.nextInt();

		switch(n) {
			case 1:
				System.out.println("I");
				break;
			case 2:
				System.out.println("II");
				break;
			case 3:
				System.out.println("III");
				break;
			case 4:
				System.out.println("IV");
				break;
			case 5:
				System.out.println("V");
				break;
			case 6:
				System.out.println("VI");
				break;
			case 7:
				System.out.println("VII");
				break;
			case 8:
				System.out.println("VIII");
				break;
			case 9:
				System.out.println("IX");
				break;
			case 10:
				System.out.println("X");
				break;
		}
	}
}
