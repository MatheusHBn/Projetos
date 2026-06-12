package Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemove{
    /*
    E diferente da herança, você pode utilizar mais de uma inteface na sua classe
     */
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }


    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissão no banco de dados");
    }


    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do método da classe");
    }
}
