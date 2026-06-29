package ZZGconcorrencia.dominio;


import java.util.Arrays;

public class Quote {
    private final String store;
    private final double price;
    private final Discount.Code discountCode;

    private Quote(String store, double price, Discount.Code discountCode) {
        this.store = store;
        this.price = price;
        this.discountCode = discountCode;
    }

    /**
     * Creates new Quote object form the value following the pattern storeName:price:discountCode
     * @param value containing storeName:price:discountCode
     * @return new Quote with values from @param value
     */
//    public static Quote newQuote(String value){
//        System.out.println(value);
//        String[] values = value.split(":");
//        System.out.println(Arrays.toString(values));
//        return new Quote(values[0], Double.parseDouble(values[1]), Discount.Code.valueOf(values[2]));
//    }

    public static Quote newQuote(String value){
        String[] values = value.split(":");

        for (String s : values) {
            System.out.println("-> " + s);
        }
        return new Quote(values[0], Double.parseDouble(values[1]), Discount.Code.valueOf(values[2]));
    }

    public String getStore() {
        return store;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDiscountCode() {
        return discountCode;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "store='" + store + '\'' +
                ", price=" + price +
                ", discountCode=" + discountCode +
                '}';
    }
}
