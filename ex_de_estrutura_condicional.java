package curso_programacao;
import java.util.Scanner;

public class ex_de_estrutura_condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota_um = sc.nextDouble();
		double nota_dois = sc.nextDouble();
		int nota_minima = 60;
		double nota_final = nota_um + nota_dois;
		
		if (nota_final >= nota_minima){ 
			System.out.printf("NOTA FINAL: %.1f%n APROVADO", nota_final);
			
		}
		 else {
			System.out.printf("NOTA FINAL: %.1f%n REPROVADO", nota_final);
		}

	}

}
