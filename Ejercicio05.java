import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int num=0, suma=0, media=0, contador=0; 
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt(); 
		
		while(num > 0) {
			suma += num; 
			contador++; 
			System.out.println("Introduce otro número: ");
			num = sc.nextInt();
		}
		
		if(contador == 0); 
		System.out.println("No se puede calcular");
		
		}else

	{
		media = suma / contador;
		System.out.println("La media es: " + media);
	}

}
