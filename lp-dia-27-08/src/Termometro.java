public class Termometro {
    // atributos se declaração: classe consegue ser vista e alterada por todos do packege (podem ser alterados por outros)
    // encapsulamento: restringir o acesso aos atributos; validações para atribuição de valores para os atributos
    Double temperaturaAtual = 0.0;
    Double temperaturaMaxRegistrada = 0.0;
    Double temperaturaMinRegistrada = 0.0;


    public void  aumentarTemperatura(Double valor){
        if(valor == null || valor <= 0 ){
            System.out.println("Parâmetro inválido");
        } else {
            temperaturaAtual += valor;
            if(temperaturaAtual > temperaturaMaxRegistrada){
                temperaturaMaxRegistrada = temperaturaAtual;
            }
        }
    }

    public void diminuirTemperatura(Double valor){
        if(valor == null || valor <= 0 ){
            System.out.println("Parâmetro inválido");
        } else {
            temperaturaAtual -= valor;
            if(temperaturaAtual < temperaturaMinRegistrada){
                temperaturaMinRegistrada = temperaturaAtual;
            }
        }
    }

    public Double converterParaFahrenheit(){
        return   temperaturaAtual * 1.8 + 32;
    }

    public String toString(){
        return "Temperatura Atual: "+ temperaturaAtual.toString()
                + "\nTemperatura Máxima Registrada: " + temperaturaMaxRegistrada.toString() +
                "\nTemperatura Mínima Registrada: " + temperaturaMinRegistrada.toString();
    }
}
