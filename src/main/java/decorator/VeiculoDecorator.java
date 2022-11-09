package main.java.decorator;

public abstract class VeiculoDecorator implements Veiculo {
    private String revisao;

    public String getRevisao() {
        return revisao;
    }

    public void setRevisao(String revisao) {
        this.revisao = revisao;
    }

    public VeiculoDecorator(String revisao){
        this.revisao = revisao;
    }

    public abstract String tipoDeBuzina();

    public String buzinar(){
        return tipoDeBuzina();
    }

    public abstract String tipoDeQuilometragem();

    public String quilometragemRevisao(){
        return tipoDeQuilometragem();
    }

}
