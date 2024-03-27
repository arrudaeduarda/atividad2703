package estruturaCondicional2;

import java.util.Scanner;

public class atividade27035 {

	public static void main(String[] args) {
		//Variável

		Scanner ler = new Scanner(System.in);
		int senha, cpf, valor,saldoFinal, saldo=1000;

		System.out.println("Informe seu CPF: ");
		cpf = ler.nextInt();

		if ( cpf == 509777808) {
			System.out.println(" Informe sua senha: ");
			senha= ler.nextInt();

			if ( senha == 1715) {
				System.out.println("Bem vindo! Seu saldo é de R$" +saldo);

				System.out.println(" Informe o valor que você deseja retirar: ");
				valor = ler.nextInt();
				if (valor > saldo) {
					System.out.println("O saque não pode ser realizado.");
				}
				else if ( valor < saldo) {
					saldoFinal =saldo - valor;
					System.out.println(" Saque realizado com sucesso!Seu saldo final é de R$"+saldoFinal);
				}
			}

			else {
				System.out.println("Senha incorreta! ");	
            }
		}
		else {
			System.out.println("CPF inválido.");
			ler.close();
		}

	}
}
