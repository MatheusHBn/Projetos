package Qstring.test;

public class StringPerformanceTest01 {
    static void main() {
        long inicio = System.currentTimeMillis();
        cocatenarString(100900);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: "+ (fim - inicio)+ "ms");

        inicio = System.currentTimeMillis();
        BuilderString(100999900);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: "+ (fim - inicio)+ "ms");

        inicio = System.currentTimeMillis();
        BuilderString(100999900);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: "+ (fim - inicio)+ "ms");
    }

    private static void cocatenarString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void BuilderString(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void BufferString(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

}
