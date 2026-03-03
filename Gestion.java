import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JLabel;

public class Gestion implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
            case "1":
                Scanner lector = new Scanner(System.in);
                        long semilla, cuadrado;
                        int numero,m;
                        System.out.println("Escribe la semilla");
                        semilla = lector.nextLong();
                        System.out.println("Escribe cuantos numero pseudo-aleatorios necesitas");
                        numero = lector.nextInt();

                        System.out.println("\n RESULTADOS ");

                        for (int i = 1; i <= numero; i++) {
                            cuadrado = semilla * semilla;
                            String cadena = String.valueOf(cuadrado);
                            while (cadena.length() < 4 || cadena.length() % 2 != 0) {
                                cadena = "0" + cadena;
                            }
                            m = cadena.length() / 2;
                            String centro = cadena.substring(m - 2, m + 2);
                            System.out.println(i+"." + ": Cuadrado = " + cadena + " -> Centro = " + centro +" " + "N.pseudoaleatorio= 0." + centro );
                            semilla = Long.parseLong(centro);
                            if (semilla == 0) {
                                System.out.println("El algoritmo terminó en cero.");
                                break;
                            }
                        }
                    }
                break;
            case "2":
                break;
            case "3":
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
