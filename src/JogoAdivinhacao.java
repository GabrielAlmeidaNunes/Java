import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura =new Scanner(System.in);
        Random numeroAleatorio = new Random();
        double numeroAleatorioGerado =numeroAleatorio.nextInt(10);
        System.out.println(" Valor aleatorio gerado foi o : " + numeroAleatorioGerado);
        int chances = 5;


        for (int i=0 ; i<5; i++){

            System.out.println(" Tente Adivinhar o numero aleatorio Gerado");
            double chute = leitura.nextDouble();

            if(chute==numeroAleatorioGerado){
                System.out.println(" Você acertou ");
                break;
            }else if( chute>numeroAleatorioGerado){
                chances -=1;
                System.out.println(" O numero do chute foi maior que o numero aleatorio gerado e  você tem mais :"  +chances +" chances " );

            }else{
                chances -=1;
                System.out.println("  O numero aleatorio e maior que o numero do chute, e  você tem mais : " +chances +" chances .");
            }
        }

        System.out.println(" Valor aleatorio gerado foi o : " + numeroAleatorioGerado);

    }
}
