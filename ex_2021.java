package curso_programacao;
import java.util.Scanner;

public class ex_2021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		int moedas_ok = (int)(valor * 100);
				
		System.out.println("NOTAS:");
		
			System.out.println(moedas_ok / 10000 + " nota(s) de R$ 100.00");
			moedas_ok = moedas_ok % 10000;
			
			System.out.println(moedas_ok / 5000 + " nota(s) de R$ 50.00");
			moedas_ok = moedas_ok % 5000;
			
			System.out.println(moedas_ok / 2000 + " nota(s) de R$ 20.00");
			moedas_ok = moedas_ok % 2000;
			
			System.out.println(moedas_ok / 1000 + " nota(s) de R$ 10.00");
			moedas_ok = moedas_ok % 1000;
			
			System.out.println(moedas_ok / 500 + " nota(s) de R$ 5.00");
			moedas_ok = moedas_ok % 500;
			
			System.out.println(moedas_ok / 200 + " nota(s) de R$ 2.00");
			moedas_ok = moedas_ok % 200;
			
			System.out.println("MOEDAS:");
			
			System.out.println(moedas_ok / 100 + " moedas(s) de R$ 1.00");
			moedas_ok = moedas_ok % 100;
			
			System.out.printf(moedas_ok / 50 + " moedas(s) de R$ 0.50%n");
			moedas_ok = moedas_ok % 50;
			
			System.out.printf(moedas_ok / 25 + " moedas(s) de R$ 0.25%n");
			moedas_ok = moedas_ok % 25;
			
			System.out.printf(moedas_ok / 10 + " moedas(s) de R$ 0.10%n");
			moedas_ok = moedas_ok % 10;
			
			System.out.printf(moedas_ok / 5 + " moedas(s) de R$ 0.05%n");
			moedas_ok = moedas_ok % 5;
			
			System.out.printf(moedas_ok / 1 + " moedas(s) de R$ 0.01%n");
			
			
sc.close();
	}

}
