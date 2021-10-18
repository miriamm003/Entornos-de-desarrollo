import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int num1, num2, suma = 0;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		do {
			System.out.println("Introduce el primer número: ");
			num1 = sc.nextInt();

			System.out.println("Introduce el segundo número: ");
			num2 = sc2.nextInt();
			suma = num1 + num2;

		} while (num1 != num2);
		{
			System.out.println("La suma es: " + suma);
		}
	}

}
