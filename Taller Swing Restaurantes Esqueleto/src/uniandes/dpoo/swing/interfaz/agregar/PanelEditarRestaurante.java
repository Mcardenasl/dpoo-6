package uniandes.dpoo.swing.interfaz.agregar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel implements ActionListener {
    // Atributos
    private JTextField txtNombre;
    private JTextField txtCalificacion;
    private JCheckBox chkVisitado;
    private JButton btnGuardar;
    private JButton btnCancelar;

    private VentanaAgregarRestaurante ventanaAgregar;

    // Constructor
    public PanelEditarRestaurante(VentanaAgregarRestaurante ventana) {
        this.ventanaAgregar = ventana;

        setLayout(new BorderLayout());

        // Panel central para campos de texto y el checkbox
        JPanel panelCentral = new JPanel(new GridLayout(3, 2, 10, 10));
        panelCentral.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Campo para el nombre del restaurante
        panelCentral.add(new JLabel("Nombre del restaurante:"));
        txtNombre = new JTextField();
        panelCentral.add(txtNombre);

        // Campo para la calificación del restaurante
        panelCentral.add(new JLabel("Calificación (1-5):"));
        txtCalificacion = new JTextField();
        panelCentral.add(txtCalificacion);

        // Checkbox para marcar si el restaurante ya fue visitado
        panelCentral.add(new JLabel("¿Ya fue visitado?"));
        chkVisitado = new JCheckBox();
        panelCentral.add(chkVisitado);

        add(panelCentral, BorderLayout.CENTER);

        // Panel inferior para los botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(this);
        panelBotones.add(btnGuardar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(this);
        panelBotones.add(btnCancelar);

        add(panelBotones, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.equals("Guardar")) {
            // TODO completar lógica para guardar la información del restaurante
            String nombre = txtNombre.getText();
            String calificacionTexto = txtCalificacion.getText();
            boolean visitado = chkVisitado.isSelected();

            try {
                int calificacion = Integer.parseInt(calificacionTexto);
                if (calificacion < 1 || calificacion > 5) {
                    JOptionPane.showMessageDialog(this, "La calificación debe estar entre 1 y 5.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                ventanaAgregar.guardarRestaurante(nombre, calificacion, visitado);
                JOptionPane.showMessageDialog(this, "Restaurante guardado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido para la calificación.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (comando.equals("Cancelar")) {
            // TODO completar lógica para cancelar y cerrar la ventana
            ventanaAgregar.dispose();
        }
    }
}
