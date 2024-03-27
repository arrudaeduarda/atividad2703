package estruturaCondicional2;

import java.util.Scanner;

public class atividade27034 {

	public static void main(String[] args) {
		//Variável

		Scanner ler = new Scanner(System.in);
		int a, b, c;
		System.out.println(" Informe a primeira medida: ");
		a = ler.nextInt();

		System.out.println("Informe a segunda medida: ");
		b = ler.nextInt();

		System.out.println("Informe a terceira medida: ");
		c = ler.nextInt();

		if (a == b && a == c) {
			System.out.println("O triângulo é equilátero!");
		}
		else if (a == b && a != c) {
			System.out.println("O triângulo é isosceles!");
		}
		else if (a != b && a != c) {
			System.out.println("O triângulo é escaleno!");
		}
		else {
			System.out.println("Informação não encontrada.");
		}
		ler.close();
	}
}


