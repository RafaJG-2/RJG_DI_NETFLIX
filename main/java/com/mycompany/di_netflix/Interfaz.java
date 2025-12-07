package com.mycompany.di_netflix;

/**
 * Interfaz Interfaz
 * <p>
 * Define el comportamiento básico que deben implementar las clases
 * que utilicen un identificador único y puedan mostrarlo.
 * </p>
 * 
 * Autor: Rafa
 */
public interface Interfaz {

    /**
     * Obtener ID
     * <p>
     * Método que debe implementar cualquier clase que use esta interfaz,
     * devolviendo su id.
     * </p>
     * @return id del objeto
     */
    int getId();

    /**
     * Mostrar ID
     * <p>
     * Método que imprime el id.
     * </p>
     */
    default void mostrarId() {
        System.out.println("ID: " + getId());
    }
}
