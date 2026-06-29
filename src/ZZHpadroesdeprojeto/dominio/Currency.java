package ZZHpadroesdeprojeto.dominio;

public interface Currency {
    String getSymbol();
}

class Real implements Currency {
    @Override
    public String getSymbol() {
        return "R$";
    }

    @Override
    public String toString() {
        return "Real";
    }
}

class UsDollar implements Currency{
    @Override
    public String getSymbol() {
        return "$";
    }

    @Override
    public String toString() {
        return "UsDollar";
    }
}
