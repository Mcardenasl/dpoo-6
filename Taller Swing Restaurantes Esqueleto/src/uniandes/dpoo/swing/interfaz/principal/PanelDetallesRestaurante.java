package uniandes.dpoo.swing.interfaz.principal;

import javax.swing.*;
import java.awt.*;

import uniandes.dpoo.swing.mundo.Restaurante;
@SuppressWarnings("serial")

public class PanelDetallesRestaurante extends JPanel {
    // Etiquetas para mostrar los detalles del restaurante
    private JLabel lblNombre;
    private JLabel lblCalificacion;
    private JLabel lblVisitado;

    // Constructor
    public PanelDetallesRestaurante() {
        setLayout(new GridLayout(3, 2, 10, 10)); // Grid de 3 filas y 2 columnas
        setBorder(BorderFactory.createTitledBorder("Detalles del Restaurante"));

        // Etiqueta para el nombre
        add(new JLabel("Nombre:"));
        lblNombre = new JLabel("-");
        add(lblNombre);

        // Etiqueta para la calificación
        add(new JLabel("Calificación:"));
        lblCalificacion = new JLabel("-");
        add(lblCalificacion);

        // Etiqueta para el estado de visitado
        add(new JLabel("¿Visitado?:"));
        lblVisitado = new JLabel("-");
        add(lblVisitado);
    }

    /**
     * Método para actualizar los detalles del restaurante mostrado.
     *
     * @param restaurante Restaurante cuyas propiedades se mostrarán.
     */
    public void actualizarRestaurante(Restaurante restaurante) {
        if (restaurante != null) {
            lblNombre.setText(restaurante.getNombre());
            lblCalificacion.setText(String.valueOf(restaurante.getCalificacion()));
            lblVisitado.setText(restaurante.isVisitado() ? "Sí" : "No");
        } else {
            lblNombre.setText("-");
            lblCalificacion.setText("-");
            lblVisitado.setText("-");
        }
    }
}
