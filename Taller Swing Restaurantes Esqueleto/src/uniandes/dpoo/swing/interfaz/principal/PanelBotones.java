package uniandes.dpoo.swing.interfaz.principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
@SuppressWarnings("serial")

public class PanelBotones extends JPanel {
    // Referencia a la ventana principal
    private VentanaPrincipal ventanaPrincipal;

    // Constructor
    public PanelBotones(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;

        setLayout(new FlowLayout());

        // Botón para agregar un nuevo restaurante
        JButton btnNuevo = new JButton("Nuevo");
        btnNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	ventanaPrincipal.mostrarVetanaNuevoRestaurante();
            }
        });
        add(btnNuevo);

        // Botón para mostrar todos los restaurantes en el mapa
        JButton btnVerTodos = new JButton("Ver todos");
        btnVerTodos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaPrincipal.mostrarVentanaMapa();
            }
        });
        add(btnVerTodos);
    }
}
