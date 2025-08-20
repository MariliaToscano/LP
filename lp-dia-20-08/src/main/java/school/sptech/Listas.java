package school.sptech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
    // coleções = classe que representa uma estrutura de dados
        List<String> lista = new ArrayList<>();  // List = interface - conjunto de dados
        // nos parenteses é possível definir o tamanho da lista - mas esse tamanho n é fixado
        // se souber que o tamanho é maior q dez ja especificar isso

        // da para definir uma classe mãe e classes que são herdeiras dessa classe
        // todas as classes do java são herdeiras da classe de Object
        // utilizando o Object é possivel criar uma lista ou um vetor que aceita varias tipagens

        List<Object> listaLoka = new ArrayList(); // classe que chama object

        listaLoka.add(2);
        listaLoka.add("assad");
        listaLoka.add(3.2);

        lista.add("Mickey");
        lista.add("Pateta");
        lista.add("Minnie");
        System.out.println("Tamanho da lista:" + lista.size());

        for (String m : lista){
            System.out.println(m);
        }

        for(int i = 0; i < lista.size();i++){
            System.out.println(lista.get(i));
        }

        System.out.println(lista);

        lista.add(0,"Disney");

        System.out.println(lista);

        lista.remove(3);

        System.out.println(lista);

        lista.remove("Disney");

        System.out.println(lista);

        // n é possivel criar uma lista de primitivos
        // index tem q ser int

        // verificando se a lista tem um determinado valor:
        System.out.println("Pateta está na lista? " + lista.contains("Pateta"));

        // verificando se a lista esta vazia
        System.out.println("A lista está vazia? "+ lista.isEmpty());

        // Obtendo o indice de um valor da lista
        System.out.println("Indice do Mickey: "+ lista.indexOf("Mickey"));

       lista.set(1, "Minnie");
        System.out.println(lista);

        System.out.println(listaLoka);
    }


}
