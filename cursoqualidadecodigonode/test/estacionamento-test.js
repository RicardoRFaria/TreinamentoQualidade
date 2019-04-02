const assert = require('assert');
const CarroConstrutor = require('../src/model/carro');
const EstacionamentoConstrutor = require('../src/estacionamento');

const PLACA_ABC_1234 = "ABC1234";
const PLACA_DEF_567 = "DEF5678";
const PLACA_INVALIDA = "ABC";

let estacionamento;

describe('O estacionamento deve', function () {

    beforeEach('Setting up the userList', function(){
        console.log('beforeEach');
        estacionamento = new EstacionamentoConstrutor();
      });

    it('incluir um carro', function () {
        const carro = new CarroConstrutor(PLACA_ABC_1234)
        estacionamento.incluirCarro(carro);
        assert.equal(estacionamento.contarCarros(), 1)
    });
    it('remover um carro', function () {
        const carro = new CarroConstrutor(PLACA_ABC_1234)
        estacionamento.incluirCarro(carro);
        estacionamento.removerCarro(carro);
        assert.equal(estacionamento.contarCarros(), 0)
    });
});