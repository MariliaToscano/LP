public class TesteTermometro {
    public static void main(String[] args) {
        Termometro Termometro01 = new Termometro();
        System.out.println("Print 01:");
        System.out.println(Termometro01.toString());

        Termometro01.temperaturaAtual = 10.0;
        Termometro01.temperaturaMaxRegistrada = 10.0;

        Termometro01.aumentarTemperatura(null);

        System.out.println("\nPrint 02:");
        System.out.println(Termometro01.toString());

        Termometro01.diminuirTemperatura(2.0);

        System.out.println("\nPrint 03:");
        System.out.println(Termometro01.toString());

        System.out.println("\nFahrenheit:" + Termometro01.converterParaFahrenheit() + "Fº");


        Termometro Termometro02 = new Termometro();
        System.out.println("Print 01:");
        System.out.println(Termometro02.toString());

        Termometro02.aumentarTemperatura(20.0);

        System.out.println("\nPrint 02:");
        System.out.println(Termometro02.toString());

        Termometro02.diminuirTemperatura(30.0);

        System.out.println("\nPrint 03:");
        System.out.println(Termometro02.toString());

        System.out.println("\nFahrenheit:" + Termometro02.converterParaFahrenheit() + "Fº");

    }
}