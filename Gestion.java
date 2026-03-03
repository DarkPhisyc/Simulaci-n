import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Gestion implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                Scanner lector = new Scanner(System.in);
                double semillaX, constante;
                byte D, n;
                System.out.println("Algoritmo de multiplicador constante");

                System.out.println("Ingresa el valor de la semilla Xi: ");
                semillaX=lector.nextDouble();
                System.out.println("Ingresa el valor de la constante: ");
                constante=lector.nextDouble();
                System.out.println("Ingresa la cantidad de numeros pseudoaleatorios que necesitas:");
                n=lector.nextByte();

                for (int i = 0; i <=n; i++) {
                    double y= semillaX * constante;
                }
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            default:
                break;
        }
    }
    
}
