public class TermometroEncapsulado {
    // atributos se declaração: classe consegue ser vista e alterada por todos do packege (podem ser alterados por outros)
    // encapsulamento: restringir o acesso aos atributos; validações para atribuição de valores para os atributos
    private Double temperaturaAtual = 0.0;
    private Double temperaturaMaxRegistrada = 0.0;
    private Double temperaturaMinRegistrada = 0.0;


    // metodos getters
    public Double getTemperaturaAtual(){
        return temperaturaAtual;
    }

    public  Double getTemperaturaMaxRegistrada(){
        return temperaturaMaxRegistrada;
    }

    public Double getTemperaturaMinRegistrada(){
        return temperaturaMinRegistrada;
    }

    // metodos setters

    public void setTemperaturaMinRegistrada(Double temperaturaMinRegistrada) {
        this.temperaturaMinRegistrada = temperaturaMinRegistrada;
    }

    public void setTemperaturaMaxRegistrada(Double temperaturaMaxRegistrada) {
        this.temperaturaMaxRegistrada = temperaturaMaxRegistrada;
    }

    public void setTemperaturaAtual(Double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }


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
