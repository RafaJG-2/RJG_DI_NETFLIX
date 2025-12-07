package com.mycompany.di_netflix;

/**
 * Clase Pelicula
 * <p>
 * Representa una película, hereda de titulo e implementa Interfaz.
 * Contiene información como ID, duración y ruta de la imagen.
 * </p>
 */
public class pelicula extends titulo implements Interfaz {

    /** Identificador de la película */
    private int id;

    /** Duración de la película en minutos */
    int duracion;

    /** Ruta de la imagen de la película */
    private String rutaImagen;

    /**
     * Obtener ID
     * @return el ID de la película
     */
    public int getId() {
        return id;
    }

    /**
     * Establecer ID
     * @param id Identificador a asignar
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtener duración
     * @return duración en minutos
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Establecer duración
     * @param duracion Duración en minutos
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Obtener ruta de imagen
     * @return ruta de la imagen
     */
    public String getRutaImagen() {
        return rutaImagen;
    }

    /**
     * Establecer ruta de imagen
     * @param rutaImagen Ruta de la imagen
     */
    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    /**
     * Mostrar datos de la película
     * <p>
     * Incluye nombre, duración y ruta de la imagen.
     * </p>
     */
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Ruta de imagen: " + rutaImagen);
    }
}
