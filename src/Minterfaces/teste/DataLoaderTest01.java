package Minterfaces.teste;

import Minterfaces.dominio.DataLoader;
import Minterfaces.dominio.DatabaseLoader;
import Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    static void main() {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
