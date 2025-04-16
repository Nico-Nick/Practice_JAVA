package curso_programacao;
import java.util.Scanner;

public class ex_1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int segundos = sc.nextInt();
		
		int h = segundos / 3600;
		segundos = segundos % 3600;
		
		int minutos = segundos / 60;
		segundos = segundos % 60;
		
		int qtsegundos = segundos;
		
		System.out.printf("%d:%d:%d%n", h, minutos, qtsegundos);
		
		sc.close();
	}
}
