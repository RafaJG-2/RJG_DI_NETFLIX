package com.mycompany.di_netflix;

import javax.swing.*;
import java.awt.Image;
/**
 * Pantalla de Series
 * <p>
 * Ventana que muestra una lista de series disponibles y su información.
 * </p>
 */
public class Series extends JFrame {

    private JList<String> listaSeries;
    private JLabel Info;
    private JLabel lblImagen;

    private serie[] seriesDisponibles;

    /**
     * Constructor Series
     * <p>
     * Carga el catálogo de series y prepara la interfaz gráfica.
     * </p>
     */
    public Series() {
        seriesDisponibles = new serie[5];

        serie s1 = new serie();
        s1.setNombre("La que se Avecina");
        s1.setDuracion(50);
        s1.setRutaImagen("lqsa.jpg");

        serie s2 = new serie();
        s2.setNombre("Squid Game");
        s2.setDuracion(45);
        s2.setRutaImagen("squidgame.jpg");

        serie s3 = new serie();
        s3.setNombre("Los Simpsons");
        s3.setDuracion(55);
        s3.setRutaImagen("simpsons.jpg");

        serie s4 = new serie();
        s4.setNombre("Breaking Bad");
        s4.setDuracion(48);
        s4.setRutaImagen("breakingbad.jpg");

        serie s5 = new serie();
        s5.setNombre("Stranger Things");
        s5.setDuracion(50);
        s5.setRutaImagen("st.jpg");

        seriesDisponibles[0] = s1;
        seriesDisponibles[1] = s2;
        seriesDisponibles[2] = s3;
        seriesDisponibles[3] = s4;
        seriesDisponibles[4] = s5;

        initComponents();
    }

    /**
     * Inicializar componentes
     * <p>
     * Configura la ventana, la lista de series y las etiquetas.
     * </p>
     */
    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(null);

        String[] nombres = new String[seriesDisponibles.length];
        for (int i = 0; i < seriesDisponibles.length; i++) {
            nombres[i] = seriesDisponibles[i].getNombre();
        }

        listaSeries = new JList<>(nombres);
        listaSeries.setBounds(20, 20, 150, 300);
        listaSeries.addListSelectionListener(e -> mostrarSerie(listaSeries.getSelectedValue()));

        Info = new JLabel();
        Info.setBounds(200, 20, 250, 50);

        lblImagen = new JLabel();
        lblImagen.setBounds(200, 80, 150, 250);

        add(listaSeries);
        add(Info);
        add(lblImagen);
    }

    /**
     * Mostrar serie seleccionada
     * <p>
     * Actualiza la información y la imagen según la serie elegida.
     * </p>
     *
     * @param nombreSeleccionado nombre de la serie seleccionada
     */
    private void mostrarSerie(String nombreSeleccionado) {
        if (nombreSeleccionado == null) 
            return;

        serie seleccionada = null;
        for (serie s : seriesDisponibles) {
            if (s.getNombre().equals(nombreSeleccionado)) {
                seleccionada = s;
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
