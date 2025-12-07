package com.mycompany.di_netflix;

import java.util.Scanner;
import java.awt.*;
/**
 * Clase DI_NETFLIX
 * <p>
 * Clase principal del programa. Gestiona el inicio,
 * carga de datos de ejemplo y presentación de la interfaz.
 * </p>
 */
public class DI_NETFLIX {

    /**
     * Método principal
     * <p>
     * Entrada de la aplicación. Llama a la carga de datos inicial
     * y abre la ventana de Login.
     * </p>
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        peliculas_series();

        EventQueue.invokeLater(() -> {
            Login login = new Login();
            login.setVisible(true);
        });
    }

    /**
     * Carga de datos
     * <p>
     * Crea ejemplos de serie, película, cliente y actor para pruebas.
     * </p>
     */
    public static void peliculas_series() {
        int[] capitulos = {3, 2};
        int[][] duracionEpisodios = {{45, 50, 40}, {42, 38}};
        serie s1 = new serie(2, capitulos, duracionEpisodios);
        s1.setNombre("Game of Thrones");

        pelicula p1 = new pelicula();
        p1.setNombre("Los Increíbles");
        p1.setDuracion(120);

        cliente c1 = new cliente(cliente.TipoCliente.PREMIUM);
        c1.setNombrep("Rafa");
        c1.setEdad(23);

        Actor a1 = new Actor();
        a1.setNombrep("Johnny Deep");
        a1.setEdad(48);

        mostrarInformacion(s1, p1, c1, a1);
    }

    /**
     * Muestra información de un elemento del sistema
     * <p>
     * Permite elegir entre serie, película, cliente o actor, y muestra
     * sus datos.
     * </p>
     * @param s serie a mostrar
     * @param p película a mostrar
     * @param c cliente a mostrar
     * @param a actor a mostrar
     */
    public static void mostrarInformacion(serie s, pelicula p, cliente c, Actor a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué quieres ver? (1.Serie, 2.Película, 3.Cliente, 4.Actor)");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> s.mostrarDatos();
            case 2 -> p.mostrarDatos();
            case 3 -> c.mostrarDatos();
            case 4 -> a.mostrarDatos();
            default -> System.out.println("Opción no válida.");
        }
    }
}
