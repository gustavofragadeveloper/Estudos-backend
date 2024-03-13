import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int valor1 = 0;
		int valor2 = 0;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = input.nextInt();
//		do {
//			System.out.println("Digite o segundo valor: ");
//			valor2 = input.nextInt();
//		}while(valor2 == 0);
		
		while(valor2 == 0) {
			System.out.println("Digite o segundo valor: ");
			valor2 = input.nextInt();
		}
		
		
	}
}
