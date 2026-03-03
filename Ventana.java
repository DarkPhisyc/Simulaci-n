import javax.swing.JFrame;
import java.util.List;

public class Ventana extends JFrame{

    public Ventana(int x, int y, int ancho, int alto, String titulo) {
        // Configiuración de la ventana
        super(titulo);
        super.setBounds(x, y, ancho, alto);
        super.setLayout(null);
        super.setVisible(true);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}