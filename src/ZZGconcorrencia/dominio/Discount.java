package ZZGconcorrencia.dominio;

public class Discount {
    public enum Code{
        NONE(0), CINCO_POR_CENTO(5), DEZ_POR_CENTO(10), QUINZE_POR_CENTO(15);
        private final int percentage;

        Code(int percentage){
            this.percentage = percentage;

        }

        public int getPercentage(){
            return percentage;
        }
    }
}
