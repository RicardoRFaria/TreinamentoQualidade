package com.ifood.cursoqualidadecodigo;

import com.ifood.cursoqualidadecodigo.model.Carro;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private final List<Carro> carros;

    public Estacionamento() {
        carros = new ArrayList<Carro>();
    }

    public void incluirCarro(Carro carro) {
        carros.add(carro);
    }

    public void removerCarro(Carro carro) {
        carros.remove(carro);
    }

    public int contarCarros() {
        return carros.size();
    }

}
