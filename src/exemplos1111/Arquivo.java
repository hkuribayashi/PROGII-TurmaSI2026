package exemplos1111;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Arquivo {

    private FileReader leitor;

    public Arquivo(String caminho) throws FileNotFoundException {
        this.leitor = new FileReader(caminho);
    }

}
