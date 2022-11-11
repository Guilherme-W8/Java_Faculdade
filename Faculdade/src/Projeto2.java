

/*
 * Criar um programa para entrar com números inteiros em um vetor a de tamanho 10. Gerar
e imprimir o vetor b onde cada elemento é o quadrado do elemento, na respectiva posição
do vetor a.
 */

import java.util.Scanner;

public class Projeto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] vetorB = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = (int) Math.pow(vetorA[i], 2);
		}
		
		for(int mostrarVetorA : vetorA) {
			System.out.println(mostrarVetorA);
		}
		
		System.out.println("\nSeparação do resultado dos vetores.\n");
		
		for(int mostrarVetorB : vetorB) {
			System.out.println(mostrarVetorB);
		}
		
		sc.close();

	}

}
