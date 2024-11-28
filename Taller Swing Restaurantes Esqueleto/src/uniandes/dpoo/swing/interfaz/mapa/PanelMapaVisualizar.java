package uniandes.dpoo.swing.interfaz.mapa;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import uniandes.dpoo.swing.mundo.Restaurante;
@SuppressWarnings("serial")

public class PanelMapaVisualizar extends JPanel {
    // Lista de restaurantes para mostrar en el mapa
    private List<Restaurante> restaurantes;

    // Constructor
    public PanelMapaVisualizar(List<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
        setPreferredSize(new Dimension(800, 600)); // Tamaño del panel
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja el fondo
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Dibuja los restaurantes en el mapa
        if (restaurantes != null) {
            for (Restaurante restaurante : restaurantes) {
                // Coordenadas del restaurante
                int x = restaurante.getX();
                int y = restaurante.getY();

                // Dibuja el punto y el nombre del restaurante
                g.setColor(Color.RED);
                g.fillOval(x - 5, y - 5, 10, 10); // Punto en el mapa
                g.setColor(Color.BLACK);
                g.drawString(restaurante.getNombre(), x + 10, y); // Nombre del restaurante
            }
        }
    }

    /**
     * Actualiza la lista de restaurantes a mostrar en el mapa.
     *
     * @param restaurantes Nueva lista de restaurantes.
     */
    public void actualizarMapa(List<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
        repaint(); // Redibuja el panel para reflejar los cambios
    }
}
