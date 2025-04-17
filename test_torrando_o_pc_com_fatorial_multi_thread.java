package curso_programacao;

import java.math.BigInteger;
import java.util.concurrent.*;

public class test_torrando_o_pc_com_fatorial_multi_thread {

    static class FatorialParcial implements Callable<BigInteger> {
        private final int inicio;
        private final int fim;

        public FatorialParcial(int inicio, int fim) {
            this.inicio = inicio;
            this.fim = fim;
        }

        @Override
        public BigInteger call() {
            BigInteger resultado = BigInteger.ONE;
            for (int i = inicio; i <= fim; i++) {
                resultado = resultado.multiply(BigInteger.valueOf(i));
            }
            return resultado;
        }
    }

    public static void main(String[] args) throws Exception {
        int n = 2_368_421; 
        int threads = 4;
        ExecutorService executor = Executors.newFixedThreadPool(threads);

        // Inicia a medição de tempo
        long inicio = System.currentTimeMillis();

        int faixa = n / threads;
        Future<BigInteger>[] futuros = new Future[threads];

        for (int i = 0; i < threads; i++) {
            int inicioIntervalo = i * faixa + 1;
            int fimIntervalo = (i == threads - 1) ? n : (i + 1) * faixa;
            futuros[i] = executor.submit(new FatorialParcial(inicioIntervalo, fimIntervalo));
        }

        BigInteger resultadoFinal = BigInteger.ONE;
        for (Future<BigInteger> futuro : futuros) {
            resultadoFinal = resultadoFinal.multiply(futuro.get());
        }

        executor.shutdown();

        // Finaliza a medição de tempo
        long fim = System.currentTimeMillis();
        
        // Converte o tempo para segundos
        double tempoSegundos = (fim - inicio) / 1000.0;
        
        System.out.println("Fatorial de " + n + " (parcial):");
        System.out.println("Número de dígitos: " + resultadoFinal.toString().length());

        // Mostra o tempo de execução em segundos
        System.out.printf("Tempo de execução: %.4f segundos\n", tempoSegundos);
    }
}