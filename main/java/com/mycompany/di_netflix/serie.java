package com.mycompany.di_netflix;

/**
 * Clase Serie
 * <p>
 * Representa una serie. Contiene información sobre temporadas, capítulos, duración y ruta de imagen.
 * </p>
 */
public class serie extends titulo implements Interfaz {

    /** Identificador de la serie */
    private int id;

    /** Ruta de la imagen de la serie */
    private String rutaImagen;

    /** Número de temporadas */
    int numTemporadas;

    /** Número de capítulos por temporada */
    int[] capitulosTemporada;

    /** Duración de cada episodio por temporada */
    int[][] duracion_episodios;

    /** Duración total de la serie */
    int duracion;

    /** Constructor vacío */
    public serie() {
    }

    /** Establecer duración */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /** Obtener duración */
    public int getDuracion() {
        return duracion;
    }

    /** Establecer nombre */
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    /** Obtener ID */
    public int getId() {
        return id;
    }

    /** Establecer ID */
    public void setId(int id) {
        this.id = id;
    }

    /** Obtener ruta de imagen */
    public String getRutaImagen() {
        return rutaImagen;
    }

    /** Establecer ruta de imagen */
    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    /**
     * Constructor con temporadas y duración de episodios
     * @param numTemporadas Número de temporadas
     * @param capitulosPorTemporada Array con número de capítulos por temporada
     * @param duracionEpisodios Matriz con duración de cada episodio
     */
    public serie(int numTemporadas, int[] capitulosPorTemporada, int[][] duracionEpisodios) {
        this.numTemporadas = numTemporadas;
        this.capitulosTemporada = capitulosPorTemporada;
        this.duracion_episodios = duracionEpisodios;
    }

    /** Calcular duración total */
    public int duracionTotal() {
        int total = 0;
        for (int i = 0; i < numTemporadas; i++) {
            for (int j = 0; j < capitulosTemporada[i]; j++) {
                total += duracion_episodios[i][j];
            }
        }
        return total;
    }

    /** Mostrar datos de la serie */
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Número de temporadas: " + numTemporadas);
        System.out.print("Capítulos por temporada: ");
        for (int cap : capitulosTemporada) {
            System.out.print(cap);
        }
        System.out.println("Duración de episodios:");
        for (int i = 0; i < duracion_episodios.length; i++) {
            System.out.print("Temporada " + (i + 1) + ": ");
            for (int j = 0; j < duracion_episodios[i].length; j++) {
                System.out.print(duracion_episodios[i][j] + " ");
            }
        }
        System.out.println("Ruta de imagen: " + rutaImagen);
    }
}
