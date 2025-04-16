package curso_programacao;
import java.util.Scanner;

public class ex_1114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
		int senha1 = sc.nextInt();
		
		while (senha1 != 2002) {
		
			System.out.println("Senha Invalida");
			senha1 = sc.nextInt();
			}
		if (senha1 == 2002) {
			
			System.out.println("Acesso Permitido");
		}
	}

}
