package Ycolecoes.dominio;

public class Celular {
    private String numberSerial;
    private String marca;

    public Celular(String numberSerial, String marca) {
        this.numberSerial = numberSerial;
        this.marca = marca;
    }

    public String getNumberSerial() {
        return numberSerial;
    }

    public void setNumberSerial(String numberSerial) {
        this.numberSerial = numberSerial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    // pra mudar o equals tem q ter algumas coisas fundamentais
    // 1 - Reflexivo: basicamente x.equals(x) tem quer ser true pra tudo, menos pra null
    // 2 - Simétrico: para x e y diferentes de null, se x.equals(y) == true, logo y.equals(x) == true
    // 3 - Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true, logo y.equals(z) == true
    // 4 - Consistente: x.equals(x) sempre retorna true se x for diferentes de null
    // 5 - para x diferente de null, x.equals(null) tem que retornar false
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Celular celular1 = (Celular) obj;
        Celular celular = (Celular) obj;
        return numberSerial != null && numberSerial.equals(celular.numberSerial);
    }
    // e tbm tem algumas regras pro hashCode
    // 1 - se x.equals(y) == true, y.hashCode() == x.hashCode()
    // 2 - y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que ser true
    // 3 - x.equals(y) == false, hasCode diferente
    // 4 - y.hashCode() != x.hashCode() x.equals(y) deverá ser false
    @Override
    public int hashCode() {
        return numberSerial == null ? 0 : this.numberSerial.hashCode();
    }

    @Override
    public String toString() {
        return "Celular{" +
                "numberSerial='" + numberSerial + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
