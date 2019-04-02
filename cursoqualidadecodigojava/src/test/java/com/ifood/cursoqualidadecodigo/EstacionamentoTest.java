package com.ifood.cursoqualidadecodigo;

import com.ifood.cursoqualidadecodigo.model.Carro;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EstacionamentoTest {

    private static final String PLACA_ABC_1234 = "ABC1234";
    private static final String PLACA_DEF_567 = "DEF5678";
    private static final String PLACA_INVALIDA = "ABC";

    private Estacionamento estacionamento;

    @Before
    public void setUp() throws Exception {
        estacionamento = new Estacionamento();
    }

    @Test
    public void incluirCarro() {
        estacionamento.incluirCarro(construirCarro(PLACA_ABC_1234));
        assertEquals(1, estacionamento.contarCarros());
    }

    @Test
    public void removerCarro() {
        estacionamento.incluirCarro(construirCarro(PLACA_ABC_1234));
        estacionamento.removerCarro(construirCarro(PLACA_ABC_1234));
        assertEquals(0, estacionamento.contarCarros());
    }

    @Test
    public void incluirMesmoCarroDuasVezes() {

    }

    @Test
    public void removerCarroDuasVezes() {

    }

    @Test
    public void removerCarroQueNaoFoiAdicionado() {

    }

    @Test
    public void incluirCarroComPlacaInvalida() {

    }

    private Carro construirCarro(String placa) {
        return new Carro(placa, null, null);
    }
}
