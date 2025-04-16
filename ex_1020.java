package curso_programacao;
import java.util.Scanner;

public class ex_1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		int ano = valor / 365;
		valor = valor % 365;
		
		int mes = valor / 30;
		valor = valor % 30;
				
		int dia = valor;
		
		System.out.printf("%d ano(s)%n", ano);
		System.out.printf("%d mes(es)%n", mes);
		System.out.printf("%d dia(s)", dia);
		
		sc.close();

	}

}
