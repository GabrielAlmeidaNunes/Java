import java.util.Scanner;

public class LacoComWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao =0;
        double nota = 0;
        int totalDeNotas = 0 ;

        while(nota != -1){
            System.out.println("Infome uma avalição para o filme  ou -1 para sair");
            nota = leitura.nextDouble();

            if(nota != -1){
                mediaAvaliacao+= nota;
                totalDeNotas++;
            }
        }

        if(totalDeNotas!=0){
            System.out.println(" A media de Avaliação do filme foi de : " + mediaAvaliacao/totalDeNotas);
        }else{
            System.out.println(( " O valor da media deu 0"));
        }

    }
}
