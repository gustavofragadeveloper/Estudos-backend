import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro valor: ");
		int valor1 = input.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor2 = input.nextInt();
		
		System.out.println("Digite a operação matemática: +, -, *, /");
		char operacao = input.next().charAt(0);
		
		switch(operacao) {
		case '+' :
			System.out.println(valor1 + valor2);
			break;
		case '-' :
			System.out.println(valor1 - valor2);
			break;
		case '*' :
			System.out.println(valor1 * valor2);
			break;
		case '/' :
			System.out.println(valor1 / valor2);
			break;
		
			default:
				System.out.println("Digite uma operação válida!");
		}
		
	}
}
