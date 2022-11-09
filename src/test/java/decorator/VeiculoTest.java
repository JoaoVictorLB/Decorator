package test.java.decorator;

import main.java.decorator.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeiculoTest {
    @Test
    void deveRetornarQuilometragemDeRevisaoCarreta(){
        Veiculo veiculo = new Carreta("100.000 km");
        assertEquals("Revisão da Carreta em 100.000 km", veiculo.quilometragemRevisao());
    }

    @Test
    void deveRetornarQuilometragemDeRevisaoCarro(){
        Veiculo veiculo = new Carro("10.000 km");
        assertEquals("Revisão do Carro em 10.000 km", veiculo.quilometragemRevisao());
    }

    @Test
    void deveRetornarQuilometragemDeRevisaoMoto(){
        Veiculo veiculo = new Moto("5.000 km");
        assertEquals("Revisão da Moto em 5.000 km", veiculo.quilometragemRevisao());
    }

    @Test
    void deveRetornarBuzinaCarreta(){
        Veiculo veiculo = new Carreta("100.000 km");
        assertEquals("Fon fon", veiculo.buzinar());
    }

    @Test
    void deveRetornarBuzinaCarro(){
        Veiculo veiculo = new Carro("100.000 km");
        assertEquals("Pam pam", veiculo.buzinar());
    }

    @Test
    void deveRetornarBuzinaMoto(){
        Veiculo veiculo = new Moto("100.000 km");
        assertEquals("Bi bi", veiculo.buzinar());
    }
}
