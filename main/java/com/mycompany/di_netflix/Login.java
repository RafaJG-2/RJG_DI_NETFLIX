package com.mycompany.di_netflix;

import javax.swing.*;
import com.mycompany.di_netflix.componentes.BotonNetflix;
import java.awt.*;

/**
 * Clase Login
 * <p>
 * Ventana de inicio de sesión que permite al usuario introducir usuario
 * y contraseña para acceder a la aplicación.
 * </p>
 */
public class Login extends JFrame {

    private JTextField jTextField1;
    private JPasswordField jPasswordField1;
    private BotonNetflix jButton1;

    /**
     * Constructor Login
     * <p>
     * Inicia la ventana y sus componentes.
     * </p>
     */
    public Login() {
        initComponents();
    }

    /**
     * Inicializar componentes
     * <p>
     * Crea los elementos de la interfaz gráfica, define sus posiciones,
     * tamaños, etc.
     * </p>
     */
    private void initComponents() {
        jTextField1 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jButton1 = new BotonNetflix("Login");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(null);

        jTextField1.setBounds(200, 100, 200, 30);
        jPasswordField1.setBounds(200, 150, 200, 30);
        jButton1.setBounds(250, 200, 100, 30);

        jButton1.addActionListener(evt -> jButton1ActionPerformed());

        add(jTextField1);
        add(jPasswordField1);
        add(jButton1);
    }

    /**
     * Acción del botón
     * <p>
     * Valida las credenciales y abre la pantalla principal
     * si son correctas.
     * </p>
     */
    private void jButton1ActionPerformed() {
        String usuario = jTextField1.getText();
        String contraseña = new String(jPasswordField1.getPassword());

        if (usuario.equals("admin") && contraseña.equals("1234")) {
            PantallaPrincipal principal = new PantallaPrincipal();
            principal.setVisible(true);
            this.setVisible(false);
            this.dispose();
        }
    }

    /**
     * Método main
     * <p>
     * Inicia la aplicación creando y mostrando la ventana de login.
     * </p>
     */
    public static void main(String[] args) {
            EventQueue.invokeLater(() -> {
            Login login = new Login();
            login.setVisible(true);
        });
    }
}
