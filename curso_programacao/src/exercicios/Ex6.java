package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int peca1 = sc.nextInt();
		int nrPeca1 = sc.nextInt();
		double vlPeca1 = sc.nextDouble();

		int peca2 = sc.nextInt();
		int nrPeca2 = sc.nextInt();
		double vlPeca2 = sc.nextDouble();
		double valorTotal = (nrPeca1 * vlPeca1) + (nrPeca2 *vlPeca2);

		System.out.printf("VALOR A PAGAR: U$ %.2f%n", valorTotal);
		System.out.println("NÚMERO PEÇA 1: " + peca1);
		System.out.println("NÚMERO PEÇA 2: " + peca2);

		sc.close();

		
	}

}
