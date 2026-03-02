import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame{
    private JLabel etiqueta;

    public Ventana(int x, int y, int ancho, int alto, String titulo) {
        // Configiuración de la ventana
        super(titulo);
        super.setBounds(x, y, ancho, alto);
        super.setLayout(null);
        super.setVisible(true);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Etiquetas
        etiqueta = new JLabel("Simulación de números pseudo-aleatorios");
        etiqueta.setBounds(200, 50, 300, 30);
        super.add(etiqueta);
    }
}