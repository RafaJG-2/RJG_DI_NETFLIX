package com.mycompany.di_netflix;

/**
 * Clase Actor
 * <p>
 * Representa a un actor, hereda de persona e implementa la interfaz.
 * Permite mostrar los datos del actor.
 * </p>
 */
public class Actor extends persona implements Interfaz {

    /** Identificador del actor */
    private int id;

    /** Ruta de la imagen del actor */
    private String rutaImagen;

    /**
     * Obtiene el ID del actor.
     * @return el ID del actor
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del actor.
     * @param id Identificador a asignar
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la ruta de la imagen del actor.
     * @return ruta de la imagen
     */
    public String getRutaImagen() {
        return rutaImagen;
    }

    /**
     * Establece la ruta de la imagen del actor.
     * @param rutaImagen Ruta de la imagen
     */
    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    /**
     * Muestra la información del actor.
     * <p>
     * Incluye nombre, edad y ruta de la imagen.
     * </p>
     */
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombrep());
        System.out.println("Edad: " + getEdad());
        System.out.println("Ruta de imagen: " + rutaImagen);
    }
}
