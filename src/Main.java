import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Dados informados");
        System.out.println("- - - - - - - - - - - - - - -");

        File arquivo = new File("dados.txt");
        int[] dados = lerDados(arquivo);

        for (int data : dados) {
            System.out.println("Dado número: " + data);
        }

        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("Picos verdadeiros");
        System.out.println("- - - - - - - - - - - - - - -");

        int[] picos = encontrarPicos(dados);
        int contadorPicos = 1;
        for (int pico : picos) {
            System.out.println(contadorPicos + "º Pico: " + pico);
            contadorPicos++;
        }

        System.out.println("Tempo médio entre picos (TEMP)");
        System.out.println("- - - - - - - - - - - - - - -");

        LocalTime tempoMedio = calcularTempoMedioPicos(picos);
        System.out.println("Tempo médio = " + formatarTempo(tempoMedio));
    }

    // Ler os dados de um arquivo .txt
    private static int[] lerDados(File arquivo) {
        List<Integer> dados = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(arquivo);
            while (scanner.hasNextInt()) {
                dados.add(scanner.nextInt());
            }
            return dados.stream().mapToInt(Integer::intValue).toArray();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Erro ao ler o arquivo", e);
        }
    }

    // Encontrar os possíveis picos de acordo com a validação requerida
    private static int[] encontrarPicos(int[] dados) {
        List<Integer> picos = new ArrayList<>();

        for (int i = 0; i < dados.length; i++) {
            int picoAtual = dados[i];

            if (picoAtual < 50) {
                continue;
            }

            if ((i == 0 || picoAtual > dados[i - 1]) && (i == dados.length - 1 || picoAtual > dados[i + 1])) {
                picos.add(picoAtual);
            }
        }

        return picos.stream().mapToInt(Integer::intValue).toArray();
    }

    //Calcular tempo médio entre os picos
    private static LocalTime calcularTempoMedioPicos(int[] dados) {
        int somaPicos = 0;
        int totalPicos = 0;

        for (int i = 1; i < dados.length - 1; i++) {
            if (dados[i] > dados[i - 1] && dados[i] > dados[i + 1] && dados[i] >= 50) {
                somaPicos += (dados[i] - dados[i - 1]);
                totalPicos++;
            }
        }

        int segundosTempoMedio;

        if(totalPicos > 0) {
           segundosTempoMedio = somaPicos / totalPicos;
        } else {
            segundosTempoMedio = 0;
        }

        return LocalTime.ofSecondOfDay(segundosTempoMedio);
    }



    // Formatar o tempo para o formato "mm:ss"
    private static String formatarTempo(LocalTime tempo) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm:ss");
        return tempo.format(formatter);
    }
}