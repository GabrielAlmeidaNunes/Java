public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        String nomeDoFilme = "Top Gun: Maverick";
        System.out.println("Filme: " + nomeDoFilme);

        int anoDeLancamento = 2022;
        System.out.println(" O Ano de lançamento do filme é : " + anoDeLancamento +".");

        boolean incluidoNoPlano = true;
        System.out.println(" Esse filme esta incluido no Plano ? " + incluidoNoPlano +".") ;

        double notaDoFilme = 8.1;
        System.out.println(" Essa é a nota do filme : " + notaDoFilme + ".");

        double media = (8+7+9.3)/3;
        System.out.println(media);

        String sinopese= """
                    Filme Top Gun.
                    Filme de Aventura com galã dos anos 80.
                    Muito Bom!
                    Ano de lançamento :
                """ + anoDeLancamento;
        System.out.println(sinopese);
        
        /*String sinopeseCompleta = """
                Nome  do Filme : %s 
                Ano de Lançamento : %d 
                Nota do filme : %.2f 
                
                """.formatted(nomeDoFilme,anoDeLancamento,notaDoFilme);

        System.out.println(sinopeseCompleta);

         */

        int classificacao =(int) (media/2);
        System.out.println(classificacao);





    }


}