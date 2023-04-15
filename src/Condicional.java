public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String plano= "basico";

        if(anoDeLancamento >= 2022){
            System.out.println(" Esse filme é um lançamento");
        }else {
            System.out.println(" Esse filme e retro");
        }

        if(incluidoNoPlano == true || plano.equals("Plus")){
            System.out.println("Filme Liberado");
        }else{
            System.out.println("Você precisa alugar o filme . ");
        }

    }
}
