public class Aula04Operadores {
    static void main() {
        // vendo operadores: + - / *
        int number01 = 40;
        int number02 = 23;
        int result = number01 * number02;
        double result1 = number01 / (double) number02;

        System.out.println(result);
        System.out.println(result1);
        System.out.println(number01-number02);
        System.out.println(number01+number02);

        // %
        int resto = 23 % 3;
        System.out.println(resto);

        // < > <= >= == =!

        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 <= 20;
        boolean isTenEqualTwenty = 10 == 10;
        boolean isTenDifferentFourteen = 10 != 14;
        System.out.println("É maior? "+ isTenGreaterThanTwenty);
        System.out.println("É maior? "+ isTenLessThanTwenty);
        System.out.println("É igual? "+ isTenEqualTwenty);
        System.out.println("É diferente? "+ isTenDifferentFourteen);

        // && (and), || (or)

        int age = 16;
        float salary = 3500;
        boolean isInsideRulesGreaterThirty = age > 30 && salary > 4612;
        boolean isInsideRulesLessThirty = age < 30 && salary <= 4612;

        System.out.println("Dentro da lei? "+ isInsideRulesGreaterThirty);
        System.out.println("Dentro da lei? "+ isInsideRulesLessThirty);

        double TotalValueCurrent = 200;
        double TotalValueSaivings = 10000;
        float ValuePlayStation = 7000f;

        boolean isPlaystationpurchasable = TotalValueCurrent > ValuePlayStation || TotalValueSaivings > ValuePlayStation;
        System.out.println(isPlaystationpurchasable);

        // = += -= *= /= %=

        double bonus = 1875;
        bonus += 1000;
        bonus -= 6920;
        bonus *= 0.7;
        bonus /= 0.2;
        System.out.println(bonus);

        // ++ --
        int count = 0;
        count++;
        count--;
        --count;
        System.out.println(++count);

    }
}
