package school.sptech;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

    public static void exibeVetor(Integer[] v){
        //exibindo os dados:
        for(int i = 0; i < v.length;i++){
            System.out.println(v[i]);
        }
    }

    public static void lerVetor(Integer[] v5, Scanner leitor){
        for(int i =0;i< v5.length;i++){
            System.out.println("Digite o valor do vetor["+i+"]:");
            v5[i] = leitor.nextInt();

            // da pra passar o scanner como parametro
            // o return quando voce passa um vetor como parametro ele n cria uma copia mas passa o endereço na memoria
            // então o vetor é o mesmo, ou seja n é preciso retornar o vetor
            // tudo que é alterado no metodo é alterado no vetor original
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer[] vetor = new Integer[5];
        Integer[] vetor2 = { 100, 200, 300, 400, 500, 600, 700};
        String[] nome2 = {"Mickey", "Pateta","Minie"};


        //preenchendo o vetor:
//        for(int i = 0; i < vetor.length; i++){
//            vetor[i] = i * 10;
//        }

        // for enchanced - for aprimorado
        // for que nao faz uso de indices, para cada string em nome2, exibir
        // utilizado apenas para obter os valores e n configurando valores
        for(String n : nome2){
            System.out.println(n);
        }

        exibeVetor(vetor);
        exibeVetor(vetor2);


        lerVetor(vetor,leitor);
        exibeVetor(vetor);
        System.out.println(Arrays.toString(vetor));

    }

}
// o vetor é um objeto, precisa definir o tipo, precisa definir o tamanho do vetor
// n é possível mudar o tamnho do vetor depois no meio do script
// tamanho do vetor = endereço de memoria - valor que representa um local na memoria
// o new reserva uma espaço na memoria RAM e retorna o endereço de memoria
// cada inteiro ocupa 4 bytes

// lista no java por baixo dos panos: cria um vetor de tamanho 10 - ao preencher 10 elementos, ele cria um vetor
// de tamanho 20 e passa as infos do primeiro vetor para esse vetor de tamanho 20
// linked list - unico conceito dinâmico