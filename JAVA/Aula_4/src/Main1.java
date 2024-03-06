import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0;
		double salario = 0.0;
		String nome = " " ;
		char digito = ' ' ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = input.nextInt();
		System.out.println("Digite seu salario: ");
		salario = input.nextDouble();
		System.out.println("Digite seu nome: ");
		nome = input.next();
		System.out.println("Digite apenas um digito qualquer: ");
		digito = input.next().charAt(0);
		input.close();
		
		System.out.println("Nome: " +nome+ " Idade: "+idade);
		System.out.println("Salario: "+salario);
		System.out.println("Digito: "+digito);
	}

}
