package Minterfaces.dominio;

public interface DataLoader {
    /*
    Interface, ela é tipo: "Essa classe é capaz de". Usando "implements" você consegue implementar uma
    classe no seu objeto, toda vez que você implementar uma, você obrigatoriamente tem que sobrescrever
    ela na classe que você for usar.
    Interfaces são sempre publicas e abstratas, então em toda a interface tem escondido o "public abstract",
    então nem precisa escrever ele.
    Um exemplo de interface: eu crio uma interface com o nome: Pagavel, e com o metodo pagar(); eu posso
    implementar ela em Boleto, pois o boleto pode usar o metodo pagar.
     */
     int MAX_DATA_SIZE = 123;
     void load();
     default void checkPermission(){
         System.out.println("Fazendo checagem de permissões");
     }
     static void retrieveMaxDataSize(){
         System.out.println("Dentro do método da interface");
     }
}
