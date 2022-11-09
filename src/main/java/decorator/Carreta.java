package main.java.decorator;

public class Carreta extends VeiculoDecorator{

    public Carreta(String revisao){
        super(revisao);
    }

    public String tipoDeBuzina(){
        return "Fon fon";
    }

    public String tipoDeQuilometragem(){
        return "Revisão da Carreta em " + this.getRevisao();
    }
}
