package school.sptech;

public class Carro {

    // Atributos - variáveis que são criadas dentro da classe,
    // mas fora do escopo dos metodos
    // São usados para representar as características do objeto
    // que são relevantes para o projeto

    String modelo;
    Double velocidade;
    String cor;
    Integer anoFabricacao;

    // Metodos - representam o comportamento do objeto (aquilo que o objeto faz no sistema ou,
    // o que o sistema faz com aquele objeto

    public void acelerar(){
        System.out.println("vruuuuuummmmmmmmmmm");
        velocidade += 20;
    }

    public void  frear(){
        System.out.println("Freando....");
        velocidade -= 20;
    }

    public void colidir(){
        System.out.println("CRASHHHHHHH.....");
        velocidade = 0.0;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                ", cor='" + cor + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
