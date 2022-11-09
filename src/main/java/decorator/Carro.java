package main.java.decorator;

public class Carro extends VeiculoDecorator{

    public Carro(String revisao){
        super(revisao);
    }

    public String tipoDeBuzina(){
        return "Pam pam";
    }

    public String tipoDeQuilometragem(){
        return "Revisão do Carro em " + this.getRevisao();
    }
}
