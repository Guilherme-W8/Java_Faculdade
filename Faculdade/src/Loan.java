
import java.util.Scanner;
public class Loan {
	
	/*A prefeitura de Praia Grande abriu uma linha de cr�dito para funcion�rios estatut�rios. O
	valor m�ximo da presta��o n�o poder� ultrapassar 30% do sal�rio bruto do funcion�rio.
	Implemente um programa em Java que dados o sal�rio bruto, o valor do empr�stimo e o
	n�mero de parcelas, informa o valor da parcela e se o empr�stimo pode ou n�o ser concedido.
	Caso o empr�stimo n�o possa ser concedido, informa tamb�m o valor m�ximo da parcela.
	*/ 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Write your salary: ");
			double salary = sc.nextDouble();
		
		System.out.print("Specify the loan you want: ");
			double loan = sc.nextDouble();
		
		System.out.print("Specify the number of plots: ");
			double plots = sc.nextInt();
		
		
			double verificationSalary = salary * 0.30; //Variavel para verificar o valor de 30% do salario.
			double valueEachPlot = loan/plots;
		
		if (verificationSalary > valueEachPlot) {
			System.out.println("Granted loan!");
			System.out.printf("Value for each plot: R$ %.2f", valueEachPlot);
		}
		else {
			System.out.println("Not granted loan!");
			System.out.printf("Value for each plot: R$ %.2f", valueEachPlot);
		}
		System.out.println();
		sc.close();
	}
}
