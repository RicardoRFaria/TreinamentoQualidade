
function Estacionamento() {
    this.__carros = [];
    this.incluirCarro = function(carro) {
        this.__carros.push(carro);
    };
    this.removerCarro = function(carro) {
        for (let i = 0; i < this.__carros.length; i++) {
            if (this.__carros[i].placa === carro.placa) {
                this.__carros.splice(i, 1);
            }
        }
    };
    this.contarCarros = function() {
        return this.__carros.length;
    }
}
module.exports = Estacionamento;