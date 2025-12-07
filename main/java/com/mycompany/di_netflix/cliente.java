package com.mycompany.di_netflix;

/**
 * Clase Cliente
 * <p>
 * Representa un cliente. Contiene información sobre tipo de cliente, imagen,
 * ID y datos personales.
 * </p>
 */
public class cliente extends persona implements Interfaz {

    /** Identificador del cliente */
    private int id;

    /** Ruta de la imagen del cliente */
    private String rutaImagen;

    /** Tipos de cliente disponibles */
    public enum TipoCliente {
        ANUNCIOS, BASICO, PREMIUM
    }

    /** Tipo de cliente actual */
    TipoCliente tipo;

    /**
     * Constructor Cliente
     * <p>
     * Inicializa un cliente con un tipo específico.
     * </p>
     * @param tipo Tipo de cliente a asignar
     */
    public cliente(TipoCliente tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtener tipo de cliente
     * @return tipo de cliente
     */
    public TipoCliente getTipo() {
        return tipo;
    }

    /**
     * Establecer tipo de cliente
     * @param tipo Tipo de cliente a asignar
     */
    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtener ID
     * @return ID del cliente
     */
    public int getId() {
        return id;
    }

    /**
     * Establecer ID
     * @param id ID a asignar
     */
    public void setId(int id) {
        this.id = id;
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
     * Mostrar datos del cliente
     * <p>
     * Imprime el nombre, edad, tipo de cliente y ruta de imagen.
     * </p>
     */
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombrep());
        System.out.println("Edad: " + getEdad());
        System.out.println("Tipo de cliente: " + tipo);
        System.out.println("Ruta de imagen: " + rutaImagen);
    }
}
