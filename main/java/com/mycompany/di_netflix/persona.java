package com.mycompany.di_netflix;

/**
 * Clase Persona
 * <p>
 * Representa a una persona. Contiene información como nombre y edad.
 * </p>
 */
public class persona {

    /** Nombre de la persona */
    private String nombrep;

    /** Edad de la persona */
    private int edad;

    /**
     * Obtener nombre
     * @return nombre de la persona
     */
    public String getNombrep() {
        return nombrep;
    }

    /**
     * Establecer nombre
     * @param nombrep Nombre a asignar
     */
    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    /**
     * Obtener edad
     * @return edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establecer edad
     * @param edad Edad a asignar
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
