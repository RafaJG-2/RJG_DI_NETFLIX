package com.mycompany.di_netflix;

import javax.swing.*;
import com.mycompany.di_netflix.componentes.BotonNetflix;

/**
 * Pantalla Principal
 * <p>
 * Ventana inicial que permite acceder a la sección de películas o series.
 * </p>
 */
public class PantallaPrincipal extends JFrame {

    private BotonNetflix btnPeliculas;
    private BotonNetflix btnSeries;

    /**
     * Constructor PantallaPrincipal
     * <p>
     * Inicializa los componentes de la ventana principal.
     * </p>
     */
    public PantallaPrincipal() {
        initComponents();
    }

    /**
     * Inicializar componentes
     * <p>
     * Configura la interfaz gráfica, botones y eventos de navegación.
     * </p>
     */
    private void initComponents() {
        btnPeliculas = new BotonNetflix("Películas");
        btnSeries = new BotonNetflix("Series");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(null);

        btnPeliculas.setBounds(200, 100, 200, 40);
        btnSeries.setBounds(200, 200, 200, 40);

        btnPeliculas.addActionListener(evt -> {
            Peliculas pelis = new Peliculas();
            pelis.setVisible(true);
            this.dispose();
        });

        btnSeries.addActionListener(evt -> {
            Series seriesnetflix = new Series();
            seriesnetflix.setVisible(true);
            this.dispose();
        });

        add(btnPeliculas);
        add(btnSeries);
    }
}
