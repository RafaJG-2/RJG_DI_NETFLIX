package com.mycompany.di_netflix;

/**
 * Clase Titulo
 * <p>
 * Representa un título dentro del sistema (serie, película, etc.).
 * Contiene únicamente el nombre del título.
 * </p>
 */
public class titulo {

    /** Nombre del título */
    private String nombre;

    /** Obtener nombre del título */
    public String getNombre() {
        return nombre;
    }

    /** Establecer nombre del título */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
