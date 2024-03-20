package Aula;


import java.util.Scanner;

public class aula_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializa um array para armazenar as notas dos alunos
        double[] notas = new double[10];
        
        // Variável para armazenar a soma das notas
        double soma = 0;
        
        // Lê as notas dos alunos
        System.out.println("Digite as notas dos 10 alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        
        // Calcula a média da turma
        double mediaTurma = soma / notas.length;
        
        // Conta quantos alunos obtiveram nota acima da média
        int acimaDaMedia = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > mediaTurma) {
                acimaDaMedia++;
            }
        }
        
        // Imprime a média da turma e o número de alunos com nota acima da média
        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Número de alunos com nota acima da média: " + acimaDaMedia);
        
        scanner.close();
    }
}
