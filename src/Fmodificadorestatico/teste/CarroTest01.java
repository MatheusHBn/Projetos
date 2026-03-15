package Fmodificadorestatico.teste;

import Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    static void main() {
        Carro carro = new Carro("Porshe", 280);
        Carro carro1 = new Carro("HB20", 270);
        Carro carro2 = new Carro("BMW", 300);

        Carro.setVelocidadeLimite(109);
        carro.impime();
        carro1.impime();
        carro2.impime();
    }
}
