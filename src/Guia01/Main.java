package Guia01;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Main {
	public static void main(String[] args) {
		ejercicio1();
		ejercicio2();
		ejercicio3();
		ejercicio4();
		ejercicio5();
	}
	public static void ejercicio1(){
		int num1,num2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero");
		num1 = scanner.nextInt();
		System.out.println("Ingrese numero");
		num2 = scanner.nextInt();
		System.out.println("la suma es: " + (num1+num2));

	}
	public static void ejercicio2(){
		//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
		String nombre;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese nombre");
		nombre= scanner.nextLine();
		System.out.println("Su nombre es: " + nombre);
	}
	public static void ejercicio3(){
		//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
		Scanner scanner = new Scanner(System.in);
		String frase;
		System.out.println("Ingrese frase");
		frase = scanner.nextLine();
		frase = toUpperCase(frase);
		System.out.println(frase);
	}
	public static void ejercicio4(){
		//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
		Double grados,convers;
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese grados");
		grados = scanner.nextDouble();
		System.out.println("La conversion de es: "+ grados + "=" + (32+(9*grados/5)));
	}
	public static void ejercicio5(){
		//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
		Scanner scanner = new Scanner(System.in);
		double n;
		System.out.println("Ingrese numero");
		n= scanner.nextDouble();
		System.out.println("El dobre del numero es: " + (n*2));
		System.out.println("El triple es: " + (n*3));
		System.out.println("La raiz cuadrada es : " + Math.sqrt(n));
	}
}
