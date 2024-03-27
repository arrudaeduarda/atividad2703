package estruturaCondicional2;

import java.util.Scanner;

public class atividade27032 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Informe o número: ");
		numero= ler.nextInt();

		if (numero > 0) {
			System.out.println("O número positvo!");
		}
		else if (numero < 0 ) {
			System.out.println("O número é negativo!");
		}
		else if (numero == 0 ) {
			System.out.println("O número é zero!");
		}
		ler.close();
	}

}
