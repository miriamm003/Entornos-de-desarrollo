package Practica4;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(string[] args) {
		int num=0, suma = 0, contador = 0; 

	do
	{
		System.out.println("Introduce un número: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		contador = num++;
		suma += num;

	}while(contador<10);
	{
		System.out.println("La suma es: " + suma);
	}
}
