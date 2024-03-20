package Aula;
import java.util.Scanner;
public class ex02 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criando a matriz 3x3
        int[][] matriz = new int[3][3];
        
        // Lendo os valores da matriz
        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // Contando quantos valores são maiores que 10
        int valoresMaioresQue10 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > 10) {
                    valoresMaioresQue10++;
                }
            }
        }
        
        // Escrevendo o resultado
        System.out.println("A matriz possui " + valoresMaioresQue10 + " valores maiores que 10.");
        
        scanner.close();
    }
}
