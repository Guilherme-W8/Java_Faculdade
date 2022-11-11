
import java.util.Scanner;

/*
* Leia dois valores inteiros, no caso para vari�veis A e B. A seguir,
* calcule a soma entre elas e atribua � vari�vel SOMA. A seguir escrever o valor desta vari�vel.
*/

public class simpleSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int SOMA = x + y;
		
		System.out.print("SOMA = " + SOMA);
		
		sc.close();
	}

}
