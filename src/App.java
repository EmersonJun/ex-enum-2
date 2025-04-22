import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do mês (1 a 12): ");
        int mes = scanner.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido.");
            return;
        }

        Estacoes estacaoAtual = null;

        for (Estacoes estacao : Estacoes.values()) {
            if (estacao.contMes(mes)) {
                estacaoAtual = estacao;
                break;
            }
        }

        if (estacaoAtual != null) {
            System.out.println("\nEstação do ano: " + estacaoAtual.name());
            System.out.println("Meses dessa estação:");

            for (int m : estacaoAtual.getMeses()) {
                if (m == mes) {
                    System.out.println("**" + m + "**");
                } else {
                    System.out.println(m);
                }
            }
        }

    }
}
