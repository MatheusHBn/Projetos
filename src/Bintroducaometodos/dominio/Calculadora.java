package Bintroducaometodos.dominio;

public class Calculadora {
    public void soma(){
        System.out.println(14+94);
        System.out.println("Somei tudo");
    }
    public void subtracao(){
        System.out.println(23-45);
        System.out.println("Subtrai tudo");
    }
    public void multiplicacao(int num1, int num2){
        System.out.println(num1 * num2);
        System.out.println("Resultado ai");
    }
    public double divisao(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }
    public void ImprimeDivisao(int num1, int num2){
        if (num2 == 0 ){
            System.out.println("Não tem divisão por 0");
            return;
        }
        System.out.println(num1/num2);
    }
    public void AlteraDados(int num1, int num2) {
        num1 = 99;
        num2 = 34;
        System.out.println("Dentro do metodo");
        System.out.println("Num: "+ num1);
        System.out.println("Num2: "+num2);
    }
    public void SomaArray(int[] numeros) {
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void SomaArgs(int... numeros) {
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
