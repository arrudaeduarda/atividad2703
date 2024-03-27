package estruturaCondicional2;

import java.util.Scanner;

public class atividade2703 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mes;


		System.out.println("Informe o valor (1-12) :  ");
		mes = ler.nextInt();

		if (mes == 1) {
			System.out.println("O mês correspondente é Janeiro!");
		}
		else if (mes == 2) {
			System.out.println("O mês correspondente é Fevereiro!");
		}
		else if (mes == 3) {
			System.out.println("O mês correspondente é Março! ");
		}
		else if (mes == 4) {
			System.out.println("O mês correspondente é Abril!");
		}
		else if (mes == 5) {
			System.out.println("O mês correspondente é Maio!");
		}
		else if (mes == 6) {
			System.out.println("O mês correspondente é Junho!");
		}
		else if (mes == 7) {
			System.out.println("O mês correspondente é Julho!");
		}
		else if (mes == 8) {
			System.out.println("O mês correspondente é Agosto!");
		}
		else if (mes == 9) {
			System.out.println("O mês correspondente é Setembro!");
		}
		else if (mes == 10) {
			System.out.println("O mês correspondente é Outubro!");
		}
		else if (mes == 11) {
			System.out.println("O mês correspondente é Novembro!");
		}
		else if (mes == 12) {
			System.out.println("O mês correspondente é Dezembro!");
		}
			else {
				System.out.println("O mês não é correspondente.");
			}
		
		ler.close();
	}

}
