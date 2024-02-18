import java.util.*;

class Somadenumeros {
	
	public static void main(String[]args) {
		Scanner scanf = new Scanner(System.in);
		int num1, num2;
		//digitar 2 numeros
		System.out.println("Digite o primeiro numero");
		num1 = scanf.nextInt();
		System.out.println("Digite o segundo numero");
		num2 = scanf.nextInt();
		//Imprimir a soma
		System.out.println("Resultado da soma " + (num1+num2));
		
	}
	
}
