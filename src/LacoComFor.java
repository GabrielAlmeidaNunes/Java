import java.util.Scanner;

public class LacoComFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao =0;
        double nota = 0;

        for(int i=0; i<3; i++){
            System.out.println("Infome uma avalição para o filme ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println(" A media de Avaliação do filme foi de : " + (int) (mediaAvaliacao/3));
    }
}
