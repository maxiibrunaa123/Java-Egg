package Guia02;

import sun.security.util.Length;

import java.util.Scanner;

public class Ejercicio03 {
/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
 Nota: investigar la función Lenght() en Java.
 */
	public static void ejercicio3(){
		String frase;
		Scanner scanner = new Scanner(System.in);

		try{
			System.out.println("Ingrese frase.");
			frase = scanner.nextLine();
			if(frase.length() == 8){
				System.out.println("Correcto");
			}else{
				System.out.println("Incorrecto");
			}
		}catch(Exception e){
			System.out.println("Error! " + e.getMessage());
		}
	}
}
