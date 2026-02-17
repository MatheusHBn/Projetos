public class Exercicio05 {
    static void main() {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição, valorDaParcela >= 1000
        double valorTotal = 30000;
        int valorDaParcela = 2700;
        double QuantidadeParcelas = 0;
        for (int i=valorDaParcela;i <= valorTotal; i += valorDaParcela) {
                QuantidadeParcelas += 1;
                System.out.println(QuantidadeParcelas);
        if (valorTotal < i){
            break;
        }
        }
    }
}