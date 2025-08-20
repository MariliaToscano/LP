package school.sptech;

import javax.swing.plaf.DimensionUIResource;

public class Metodos {

   public static void exibeAsteriscos(){
       System.out.println("************************");
   }

   public static void exibeQuadroAsteriscos(){
       exibeAsteriscos();
       System.out.println("***                  ***");
       System.out.println("***                  ***");
       System.out.println("***                  ***");
       exibeAsteriscos();
   }

    public static void exibeQuadroAsteriscos(String msg){
        exibeAsteriscos();
        System.out.println("***                  ***");
        System.out.println("***  " + msg + "    ***");
        System.out.println("***                  ***");
        exibeAsteriscos();
    }

    public Double media(Double n1, Double n2){ // assinatura do metodo
       return(n1+n2)/2;
    }

    public static Double media(Double n1, Double n2, Double n3){
        return(n1+n2+n3)/3;
    }

    public static void main(String[] args) {
        // funcao = metodo
        // quando o metodo é void significa q ele não retorna valor
        // um metodo void pode ter retorno desde que o return n retorne nada
        // serve para sair forçadamente do metodo
        // overload method/ metodo sobrecarregado = mesmo metodo com assinatura diferentes
        // quando o metodo nao é static é necessario utilizar o new para utilizar o metodo - criar um objeto

        exibeAsteriscos();
        exibeQuadroAsteriscos();
        exibeQuadroAsteriscos("Quero comer.");

        Metodos m = new Metodos();  // criando um objeto da classe Metodos para chamar um metodo
        System.out.println(m.media(4.0,3.0));
        Double media = m.media(8.0,9.0);

        System.out.println(media);
        System.out.println(media(2.0,7.0,8.0));
    }
}
