package curso_programacao;
import java.math.BigInteger;

public class testando_o_limite_do_meu_pc_com_BigInteger_fatorial_100k {

	public static void main(String[] args) {
		int n = 100_000; // fatorial de 100 mil
        BigInteger fat = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            fat = fat.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Fatorial de " + n + " calculado com sucesso!");
        System.out.println("Número de dígitos: " + fat.toString().length());
        System.out.println(fat);
    }
}