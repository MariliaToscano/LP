public class TesteTermometroConstrutor {
    public static void main(String[] args) {
        TermometroConstrutor Termometro01 = new TermometroConstrutor(0.0,0.0,0.0);
        System.out.println("Print 01:");
        System.out.println(Termometro01.toString());

        Termometro01.setTemperaturaAtual(10.0);
        Termometro01.setTemperaturaMaxRegistrada(10.0);

        Termometro01.aumentarTemperatura(null);

        System.out.println("\nPrint 02:");
        System.out.println(Termometro01.toString());

        Termometro01.diminuirTemperatura(2.0);

        System.out.println("\nPrint 03:");
        System.out.println(Termometro01.toString());

        System.out.println("\nFahrenheit:" + Termometro01.converterParaFahrenheit() + "Fº");


        TermometroEncapsulado Termometro02 = new TermometroEncapsulado();
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