package Guia02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void ejercicio2(){
		/*
		Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto
		 */
		String frase;
		Scanner scanner = new Scanner(System.in);
		try{
			System.out.println("Ingrese frase");
		frase=scanner.nextLine();
		if(frase.equals("eureka")){
			System.out.println("Correcto");
		}else{
			System.out.println("Incorrecto");
		}}catch(Exception e) {
		System.out.println("Error! : " + e.getMessage());
		}

	}
}
