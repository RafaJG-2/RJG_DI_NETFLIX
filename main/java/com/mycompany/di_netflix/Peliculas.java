package com.mycompany.di_netflix;

import javax.swing.*;
import java.awt.Image;

/**
 * Pantalla de Películas
 * <p>
 * Ventana que muestra una lista de películas disponibles y su información.
 * </p>
 */
public class Peliculas extends JFrame {

    private JList<String> listaPeliculas;
    private JLabel Info;
    private JLabel lblImagen;
    private pelicula[] peliculasDisponibles;

    /**
     * Constructor Peliculas
     * <p>
     * Inicializa el catálogo de películas y configura la interfaz.
     * </p>
     */
    public Peliculas() {
        peliculasDisponibles = new pelicula[5];

        pelicula p1 = new pelicula();
        p1.setNombre("Los Increíbles");
        p1.setDuracion(120);
        p1.setRutaImagen("losincreibles.jpg");

        pelicula p2 = new pelicula();
        p2.setNombre("Toy Story");
        p2.setDuracion(95);
        p2.setRutaImagen("toystory.jpg");

        pelicula p3 = new pelicula();
        p3.setNombre("The Ring");
        p3.setDuracion(95);
        p3.setRutaImagen("thering.jpg");

        pelicula p4 = new pelicula();
        p4.setNombre("IT");
        p4.setDuracion(135);
        p4.setRutaImagen("it.jpg");

        pelicula p5 = new pelicula();
        p5.setNombre("Scream");
        p5.setDuracion(103);
        p5.setRutaImagen("scream.jpg");

        peliculasDisponibles[0] = p1;
        peliculasDisponibles[1] = p2;
        peliculasDisponibles[2] = p3;
        peliculasDisponibles[3] = p4;
        peliculasDisponibles[4] = p5;

        initComponents();
    }

    /**
     * Inicializar componentes
     * <p>
     * Configura la interfaz gráfica, lista de películas y etiquetas.
     * </p>
     */
    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(null);

        String[] nombres = new String[peliculasDisponibles.length];
        for (int i = 0; i < peliculasDisponibles.length; i++) {
            nombres[i] = peliculasDisponibles[i].getNombre();
        }

        listaPeliculas = new JList<>(nombres);
        listaPeliculas.setBounds(20, 20, 150, 300);
        listaPeliculas.addListSelectionListener(e -> mostrarPelicula(listaPeliculas.getSelectedValue()));

        Info = new JLabel();
        Info.setBounds(200, 20, 250, 50);

        lblImagen = new JLabel();
        lblImagen.setBounds(200, 80, 150, 250);

        add(listaPeliculas);
        add(Info);
        add(lblImagen);
    }

    /**
     * Mostrar película seleccionada
     * <p>
     * Actualiza la información y la imagen según la película elegida de la lista.
     * </p>
     *
     * @param nombreSeleccionado nombre de la película seleccionada
     */
    private void mostrarPelicula(String nombreSeleccionado) {
        if (nombreSeleccionado == null) 
            return;

        pelicula seleccionada = null;
        for (pelicula p : peliculasDisponibles) {
            if (p.getNombre().equals(nombreSeleccionado)) {
                seleccionada = p;
                break;
            }
        }
        if (seleccionada == null) 
            return;

        Info.setText("Nombre: " + seleccionada.getNombre() + "Duración: " + seleccionada.getDuracion() + " min");

        ImageIcon icon = new ImageIcon("src/main/imagenes/" + seleccionada.getRutaImagen());
        lblImagen.setIcon(new ImageIcon(icon.getImage().getScaledInstance(
        lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH)));
    }
}
