package school.sptech;

public class Print {

    public static void main(String[] args) { // metodo main (comando: psvm ou main)
        System.out.println("Olá mundo!"); // pula linha
        System.out.print("Olá \n"); // não pula linha


        String nome = "Gilberto";
        Integer idade = 22;
        Double altura = 1.78;
        Double nota = 78.0;

        String textoFormatado =
                String.format("Olá %s, você tem %d anos, e mede %.2fm. "+ "Você Acertou %.1f%% da prova",
                        // %% pra colocar porcentagem no texto
                        nome, idade, altura, nota);

        System.out.println(textoFormatado);

        System.out.printf("Olá %s, você tem %d anos, e mede %.2fm. "+ "Você Acertou %.1f%% da prova",
                nome, idade, altura, nota); // format dentro do print


    }
}
