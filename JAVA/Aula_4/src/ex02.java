import java.util.Scanner;
public class ex02 {
	public static void main(String[] args) {
	int idade = 0;
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.println("Digite sua idade: ");
	idade = input.nextInt();
//	if(idade >= 16 && 69>=idade) {
//		System.out.println("Parabéns! Você está apto para a doação!");
//	}else {
//		System.out.println("Você deve ter idade entre 16 e 69 anos para estar apto a doação");
//	}
//	String veridade = (idade >= 16 & 69>=idade)? "Pode doar": "Vá se lascar";
//	System.out.println(veridade);
	
	if(idade >= 16 & 18 > idade) {
		System.out.println("Você precisa da autorização do seu responsável!");
	}
	else if(idade >= 18 & 69>= idade) {
		System.out.println("pode doar!");
	}else {
		System.out.println("Vá embora!");
	}
	
	System.out.println("O ano do seu nascimento é: " +(2024-idade));
   }
}
