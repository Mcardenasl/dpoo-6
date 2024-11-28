package uniandes.dpoo.swing.interfaz.agregar;

import javax.swing.*;
@SuppressWarnings("serial")
public class VentanaAgregarRestaurante extends JFrame{
    // Panel principal para agregar restaurante
    private PanelEditarRestaurante panelEditar;

    // Constructor
    public VentanaAgregarRestaurante() {
        setTitle("Agregar Restaurante");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // TODO completar inicialización del panel de edición
        panelEditar = new PanelEditarRestaurante(this);
        add(panelEditar);

        // Configuración final
        setVisible(true);
    }

    /**
     * Método para guardar un restaurante.
     *
     * @param nombre      Nombre del restaurante.
     * @param calificacion Calificación del restaurante (1-5).
     * @param visitado    Indica si ya fue visitado.
     */
    public void guardarRestaurante(String nombre, int calificacion, boolean visitado) {
        // TODO completar lógica para guardar los datos del restaurante
        System.out.println("Guardando restaurante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Calificación: " + calificacion);
        System.out.println("Visitado: " + visitado);
        JOptionPane.showMessageDialog(this, "Restaurante guardado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Cerrar la ventana después de guardar
        dispose();
    }

    public static void main(String[] args) {
        // Para pruebas rápidas
        new VentanaAgregarRestaurante();
    }
}
