package Practica4;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int num = 0, suma = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introducir un número: ");
			num = sc.nextInt();
			suma = suma + num;
		} while (num != 0);
		{
			System.out.println("La suma es: " + suma);
		}

	}

}
