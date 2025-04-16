package curso_programacao;
import java.util.Scanner;

public class ex_1154 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int cont_media = 0;
		int total = 0;
		double media = 0;
		
		while (idade > 0) {
			
			cont_media = cont_media + 1;
			total = total + idade;
			idade = sc.nextInt();
		}
		
		media = (double) total / cont_media;
		System.out.printf("%.2f%n", media);

	}

}
