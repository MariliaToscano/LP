package school.sptech;

import java.util.Scanner;

public class ScannerExemplo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // "input"  // isso aqui cria um objeto - toda vez q usa new é um objeto
        Scanner leitor2 = new Scanner(System.in);


        System.out.println("Digite sua idade:");
        Integer idade = leitor.nextInt(); // Integer

        // cria um buffer (área temporaria na memória) o enter fica nele
        // nextLine consome o enter
        // leitor.nextLine();   // forma de corrigir o erro - next line vazio
        // melhor forma de corrigir: criar outro objeto para utilizar com o nextLine
        // um leitor para next e outro para nextLine

        System.out.println("Digite o seu nome:");
        String nome = leitor2.nextLine();  // String (next) - nextLine: aceita dois nomes


        System.out.println("Digite sua altura:");
        Double altura = leitor.nextDouble(); // Double

        System.out.println(("Digite 3 npumeros (separados por espaço)"));
        Integer num1 = leitor.nextInt();
        Integer num2 = leitor.nextInt();
        Integer num3 = leitor.nextInt();

        System.out.println("Número 01: " + num1);
        System.out.println("Número 02: " + num2);
        System.out.println("Número 03: " + num3);
    }

}
