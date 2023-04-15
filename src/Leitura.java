import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String mensagemInformeDados = """
                    Informe o Nome do filme
                    Informe o Ano de laçamento do filme
                    Informe a avaliação do filme
                """;

        System.out.println(mensagemInformeDados);

        String nomeDoFilme = leitura.nextLine();
        int anofilme = leitura.nextInt();
        double avalicaoFilme = leitura.nextDouble();

        String dadosInformados = """
                Nome do filme : %s .
                Ano de Lançamento : %d .
                Avalição : %.2f .
                """.formatted(nomeDoFilme,anofilme,avalicaoFilme);

        System.out.println(dadosInformados);
    }
}
