package curso_programacao;
import java.util.Scanner;

public class ex_1048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario_atual = sc.nextDouble();
		
		if (salario_atual <= 400.00) {
			
			 double novo_salario = (salario_atual * 0.15) + salario_atual;
			 double reajuste_ganho = (novo_salario - salario_atual);
			 int percentual = 15;
			 
			 System.out.printf("Novo salario: %.2f%n", novo_salario);
			 System.out.printf("Reajuste ganho: %.2f%n", reajuste_ganho);
			 System.out.printf("Em percentual: %d %%", percentual);
			
		}
		else if (salario_atual >= 400.01 && salario_atual <= 800.00) {
			
			double novo_salario = (salario_atual * 0.12) + salario_atual;
			 double reajuste_ganho = (novo_salario - salario_atual);
			 int percentual = 12;
			 
			 System.out.printf("Novo salario: %.2f%n", novo_salario);
			 System.out.printf("Reajuste ganho: %.2f%n", reajuste_ganho);
			 System.out.printf("Em percentual: %d %%", percentual);
			
		}
		else if (salario_atual >= 800.01 && salario_atual <= 1200.00) {
			
			double novo_salario = (salario_atual * 0.10) + salario_atual;
			 double reajuste_ganho = (novo_salario - salario_atual);
			 int percentual = 10;
			 
			 System.out.printf("Novo salario: %.2f%n", novo_salario);
			 System.out.printf("Reajuste ganho: %.2f%n", reajuste_ganho);
			 System.out.printf("Em percentual: %d %%", percentual);
			
		}
		else if (salario_atual >= 1200.01 && salario_atual <= 2000.00) {
			
			double novo_salario = (salario_atual * 0.07) + salario_atual;
			 double reajuste_ganho = (novo_salario - salario_atual);
			 int percentual = 7;
			 
			 System.out.printf("Novo salario: %.2f%n", novo_salario);
			 System.out.printf("Reajuste ganho: %.2f%n", reajuste_ganho);
			 System.out.printf("Em percentual: %d %%", percentual);
			
		}
		else if (salario_atual > 2000.00) {
			
			double novo_salario = (salario_atual * 0.04) + salario_atual;
			 double reajuste_ganho = (novo_salario - salario_atual);
			 int percentual = 4;
			 
			 System.out.printf("Novo salario: %.2f%n", novo_salario);
			 System.out.printf("Reajuste ganho: %.2f%n", reajuste_ganho);
			 System.out.printf("Em percentual: %d %%", percentual);
}
		else if (salario_atual <= 0) {
	 
	 System.out.printf("Valor invalido");
}
		sc.close();
	}

}
