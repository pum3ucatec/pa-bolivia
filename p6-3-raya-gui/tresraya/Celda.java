package tresraya;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;

public class Celda extends JButton {

    public Celda() {
        this.setText(" ");
        this.setFont(new Font("Arial", Font.PLAIN, 60));
    }

    @Override
    public void setText(String text) {
        super.setText(text);

        if (text.equals("X")) {
            this.setForeground(Color.blue);
        } else {
            this.setForeground(Color.red);
        }

    }
}
