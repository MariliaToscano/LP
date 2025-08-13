package school.sptech;

import java.util.Scanner;

public class LacoRepeticao {
    public static void main(String[] args) {
        int contador = 0;

        do {
            contador++;
            System.out.println(contador);
        } while (contador < 10); // primeiro faz o 'do', depois verifica se o loop continua
        // em um while normal primeiro verifica e depois faz

        // usabilidade: validações (se o numero lido n é negativo)

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número não negativo: ");
        Integer i = leitor.nextInt();
        do{
            System.out.println("Número inválido! Digite novamente.");

        }  while (i < 0);
    // :(

    }
}
