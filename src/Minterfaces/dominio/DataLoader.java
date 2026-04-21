package Minterfaces.dominio;

public interface DataLoader {
     int MAX_DATA_SIZE = 123;
     void load();
     default void checkPermission(){
         System.out.println("Fazendo checagem de permissões");
     }
     static void retrieveMaxDataSize(){
         System.out.println("Dentro do método da interface");
     }
}
