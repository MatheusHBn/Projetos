package Pwrapper.test;

public class WrapperTest01 {
    static void main() {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Long longW = 10L;
        Integer intW = 1; // autoboxing
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        Integer intW3 = Integer.parseInt("5");
        Boolean verdade = Boolean.parseBoolean("true");
        System.out.println(verdade);
        
    }
}
