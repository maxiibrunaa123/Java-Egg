package Guia02;

import java.util.Scanner;

public class Ejercicio01 {

	public static void ejercicio1(){
		/*
		Crear un programa que dado un número determine si es par o impar.
		 */
		int n;
		Scanner scanner = new Scanner(System.in);

		try{
			System.out.println("Ingrese numero para saber si es par o impar:");
			n = scanner.nextInt();
			if(n % 2 == 0){
				System.out.println("El numero ingresado es par");
			}else{
				System.out.println("El numero ingresado es inpar");}
			}catch(Exception e){
			System.out.println("Error! : " + e);
			}
		}
	}

