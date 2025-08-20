package school.sptech;

public class TesteCarro {
    public static void main(String[] args) {

        Carro fusca = new Carro(); // instanciando a classe carro

        fusca.anoFabricacao = 1976;
        fusca.modelo = "Fusca";
        fusca.cor = "Azul";
        fusca.velocidade = 0.0;

        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        System.out.println("Velocidade atual: " + fusca.velocidade);

        fusca.frear();
        System.out.println("Velocidade atual: " + fusca.velocidade);

        fusca.colidir();
        System.out.println("Velocidade atual: " + fusca.velocidade);

        System.out.println(fusca);

        Carro uno = new Carro();
        uno.modelo = "Uno";
        uno.velocidade = 0.0;
        uno.anoFabricacao = 2003;
        uno.cor = "cinza";

        Carro uno2 = new Carro();
        uno2.modelo = "Uno";
        uno2.velocidade = 0.0;
        uno2.anoFabricacao = 2003;
        uno2.cor = "cinza";

        Carro uno3 = uno;

        if(uno == uno3){ // esta comparando o endereço da memoria e não os seus valores
            System.out.println("São iguais");
        }else {
            System.out.println("São diferentes");
        }

// o objeto só existe em tempo de execução, o que existe é a classe
    }
}
