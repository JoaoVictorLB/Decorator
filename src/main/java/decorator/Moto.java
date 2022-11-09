package main.java.decorator;

public class Moto extends VeiculoDecorator {
    public Moto(String revisao){
        super(revisao);
    }

    public String tipoDeBuzina(){
        return "Bi bi";
    }

    public String tipoDeQuilometragem(){
        return "Revisão da Moto em " + this.getRevisao();
    }
}
