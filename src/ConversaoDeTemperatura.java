public class ConversaoDeTemperatura {
    public static void main (String[] args){
        double grauCelsius = 36.5;

        double grauFahrenheit = (grauCelsius *1.8) + 32 ;

        String valorDatemperatura = """
                    
                    O valor da temperatura em Celsius %.2f equivale a %.2f em Fahrenheit .
                
                """.formatted(grauCelsius,grauFahrenheit);

        System.out.println(valorDatemperatura);


        int grauFahrenheitSemCasaDecimal = (int) (grauFahrenheit);

        System.out.println(" A temperatura em Farenheit sem casa decima é : " + grauFahrenheitSemCasaDecimal);

    }
}
