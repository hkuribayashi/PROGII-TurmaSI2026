package exemplos1111;

import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {

    public Janela(String titulo){
        super(titulo);
        this.setSize(640, 480);

        JButton b1 = new JButton("Avançar");
        JButton b2 = new JButton("Cancelar");

        this.getContentPane().add(b1);
        this.getContentPane().add(b2);

        this.getContentPane().setLayout(
                    new java.awt.FlowLayout(FlowLayout.LEFT));

        this.setVisible(true);
    }
}
