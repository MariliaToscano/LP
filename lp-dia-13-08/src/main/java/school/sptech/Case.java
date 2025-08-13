package school.sptech;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {

        Boolean fim = false;

        while (!fim){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha uma das opções abaixo");
        System.out.println("1- Cadastrar");
        System.out.println("2- Alterar dados");
        System.out.println("3- Sair");

        Integer resposta = leitor.nextInt();

        switch (resposta) {
            case 1:
                // if (resposta == 1)
                System.out.println(("Cadastrado"));
                break;
            case 2:
                System.out.println(("Alterado"));
                break;
            case 3:  // começo
                System.out.println("Saindo");
                fim = true;
                break;  // final
            // default - "else"
            default:
                System.out.println("Número Inválido!");
            }
        }
    }
}
