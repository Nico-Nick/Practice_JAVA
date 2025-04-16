package curso_programacao;
import java.util.Scanner;

public class bhaskara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        double delta = Math.pow(B, 2.0) - 4 * A * C;
        
        	if (A == 0 || delta < 0.0) {
        	System.out.println("Impossivel calcular");
        	
        }
        	else {
        
        double raiz_1 = (- B + Math.sqrt(delta)) / (2.0 * A);
        double raiz_2 = (- B - Math.sqrt(delta)) / (2.0 * A);
        System.out.printf("R1 = %.5f%n", raiz_1);
        System.out.printf("R2 = %.5f%n", raiz_2);
        	}
        	sc.close();
        }

}


