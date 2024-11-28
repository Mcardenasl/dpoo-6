package uniandes.dpoo.swing.interfaz.agregar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
@SuppressWarnings("serial")
public class PanelBotonesAgregar extends JPanel {
    // Referencia a la ventana principal
    private VentanaAgregarRestaurante ventanaPrincipal;

    // Constructor
    public PanelBotonesAgregar(VentanaAgregarRestaurante ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;

        setLayout(new FlowLayout());

        // Botón para crear un restaurante
        JButton btnCrear = new JButton("Crear Restaurante");
        btnCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la creación de un restaurante
                ventanaPrincipal.guardarRestaurante(
                        "Nombre de prueba",  // Estos valores pueden venir de un formulario
                        3,                  // Cambiar por los datos del usuario
                        true                // Simula que fue visitado
                );
            }
        });
        add(btnCrear); // Agrega el botón al panel

        // Botón para cerrar la ventana
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para cerrar la ventana
                ventanaPrincipal.dispose();
            }
        });
        add(btnCerrar); // Agrega el botón al panel
    }
}
