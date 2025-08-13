package school.sptech;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Aleatorio {
    public static void main(String[] args) {
        // com teto
        Integer numAleatorio = (int)(Math.random()*10); // necessita do int para ramdom
        // casting - tipo da variável

        System.out.println("Número Sorteado: " + numAleatorio);

        // com piso
        Integer numPiso = (int)(Math.random()*10+5); // necessita do int para ramdom
        // casting - tipo da variável

        System.out.println("Número Sorteado (min:5): " + numPiso);

        // ThreadLocalRandom

        Random numThread = new Random();
        Integer i = numThread.nextInt(10); // limite - 1 : ou seja 10 -1 = 9
        System.out.println("Aleatório nextInt(): " + i);

        // ThreadLocalRandom
        Integer m = ThreadLocalRandom.current().nextInt(0,50);  // do 0 até o 49
        System.out.println("Aleatŕoio Thread: " + m);

        Double d = ThreadLocalRandom.current().nextDouble(1,2);
        System.out.printf("Aleatório Double: %.2f", d);
    }
}
