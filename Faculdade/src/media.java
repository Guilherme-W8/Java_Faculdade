
import java.util.Locale;
import java.util.Scanner;

/*
 * Leia 3 valores, no caso, vari�veis A, B e C, que s�o as tr�s notas de um aluno. A seguir, calcule a m�dia do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 at� 10.0, sempre com uma casa decimal.
 */


public class media {

	public static void main(String[] args) {
		double A, B, C;
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		System.out.println("Write your notes: ");
		
		//La�o para verifica��o de restri��o (A nota so pode ser no intervalo de 0.0 a 10.0).
		
		do {
			A = sc.nextDouble();
			B = sc.nextDouble();
			C = sc.nextDouble();
		}while((A < 0.0 || A > 10.0) || (B < 0.0 || B > 10.0) || (C < 0.0 || C > 10.0));
		
		double media = (A * 2 + B * 3 + C * 5)/10;
		
		System.out.printf("Media = %.1f", media);
		sc.close();
	}
}
