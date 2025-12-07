package com.mycompany.di_netflix.componentes;

import javax.swing.JButton;
import java.awt.Color;

public class BotonNetflix extends JButton {

    public BotonNetflix(String texto) {
        super(texto);
        setBackground(Color.RED);
        setForeground(Color.WHITE);
    }
}
