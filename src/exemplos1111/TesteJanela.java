import exemplos1111.Janela;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

void main(){

    Janela j = new Janela("Tela de Cadastro");
    j.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e){
            super.windowClosed(e);
            System.exit(0);
        }
    });

}