package Guia02.Extras;

import java.util.Scanner;

public class Extra6 {
	/*
	Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
	 */
	public static void extra6(){
		Scanner scanner = new Scanner(System.in);
		double altura,sumaMenor,promedio,promMenor,sumaMayor;
		int personas,contadorMenor;
		contadorMenor = 0;
		sumaMenor = 0.00;
		sumaMayor = 0;
		System.out.println("Ingrese cantidad de personas a medir.");
		personas = scanner.nextInt();

		for(int i=0;i<personas;i++){
			System.out.println("Ingrese altura de persona " + i);
			altura = scanner.nextDouble();
			if (altura < 1.60){
				contadorMenor++;
				sumaMenor = sumaMenor + altura;
			}
			sumaMayor = sumaMayor+altura;
		}
		promMenor=sumaMenor / contadorMenor;
		promedio = sumaMayor / personas;

		System.out.println("El promedio de las personas por debajo de 1.60mts. es:" + promMenor);
		System.out.println("El promedio general es : " + promedio);
	}
}
