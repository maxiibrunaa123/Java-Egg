package Guia02.Extras;

import java.util.Scanner;

public class Extra5 {

	public static void extra5(){
		String category;
		int price;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese categoria de afiliado:");
		category = scanner.nextLine();
		category = category.toLowerCase();
		System.out.println("Ingrese el monto total del tratamiento.");
		price = scanner.nextInt();

		switch (category){

			case "a": //categoria con 50% de decscuento
				System.out.println("Se aplica 50% de descuento.");
				System.out.println("Total: " + price);
				System.out.println("Importe a abonar: " + price * 0.50);
				break;

			case "b": //categoria con 35% de descuento
				System.out.println("Se aplica 35% de descuento.");
				System.out.println("Total: " + price);
				System.out.println("Importe a abonar: " + price * 0.35);
				break;

			case "c": //sin descuento
				System.out.println("No corresponde descuento. Monto a abonar: " + price);
				break;
		}


	}
}
