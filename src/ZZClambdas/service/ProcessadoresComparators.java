package ZZClambdas.service;

import ZZClambdas.dominio.Processadores;

public class ProcessadoresComparators {
   public static int compareByName(Processadores p1, Processadores p2){
       return p1.getName().compareTo(p2.getName());
   }

    public static int compareByModel(Processadores p1, Processadores p2){
        return p1.getModel().compareTo(p2.getModel());
    }

    public int compareByModelNoStatic(Processadores p1, Processadores p2){
        return p1.getModel().compareTo(p2.getModel());
    }
}
