package curso_programacao;
import java.util.Scanner;

public class exnelio2 {
	
	public static void main(String[] args) {
		 
	      Scanner sc = new Scanner(System.in);
	      
	      String nome = sc.next();
	      int idade = sc.nextInt();
	      
	      String nome2 = sc.next();
	      int idade2 = sc.nextInt();
	      double media = idade + idade2 / 2.0;
	     System.out.printf("A idade média de %s e %s é de %.1f%n", nome, nome2, media);
	      
	    sc.close();
	}

}
