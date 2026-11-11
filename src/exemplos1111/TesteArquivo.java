import exemplos1111.Arquivo;

import javax.swing.*;

void main(){

    String caminho = "/Users/hugo/Desktop/teste.txt";

    try {
        Arquivo a1 = new Arquivo(caminho);
    }catch (FileNotFoundException e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}