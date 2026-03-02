import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public Ventana(int x, int y, int ancho, int alto, String titulo) {
        super(titulo);
        super.setBounds(x, y, ancho, alto);
        super.setLayout(null);
        super.setVisible(true);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}