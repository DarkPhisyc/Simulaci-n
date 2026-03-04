import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Gestion implements ActionListener {
    Scanner lector = new Scanner(System.in);
    private int m;
    private int a;
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
            case "1":
                
                        long semilla, cuadrado;
                        int numero;
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
                            System.out.println(i+"." + ": y = " + cadena + " -> Centro = " + centro +" " + "N.pseudoaleatorio= 0." + centro );
                            semilla = Long.parseLong(centro);
                            if (semilla == 0) {
                                System.out.println("El algoritmo terminó en cero.");
                                break;
                            }
                        }
                    
                break;
            case "2":
                break;
            case "3":

            int n;

            System.out.println("ALGORITMO MULTIPLICADOR CONSTANTE");

            System.out.print("Ingresa el valor de la semilla Xi (4 digitos): ");
            semilla = lector.nextInt();

            System.out.print("Ingresa el valor de la constante: ");
            a = lector.nextInt();

            System.out.print("Ingresa la cantidad de numeros pseudoaleatorios que necesitas: ");
            n = lector.nextInt();

            for (int i = 0; i < n; i++) {

                int y = (int) (semilla * a);

                String cadena = String.valueOf(y);

                while (cadena.length() < 8) {
                    cadena = "0" + cadena;
                }

                int m = cadena.length() / 2;
                String centro = cadena.substring(m - 2, m + 2);

                System.out.println((i+1) + ". Producto = " + cadena +
                        " -> Centro = " + centro +
                        " -> N.pseudoaleatorio = 0." + centro);

                semilla = Integer.parseInt (centro);

                if (semilla == 0) {
                    System.out.println("El algoritmo termino en cero.");
                    break;
                }
            }
                break;
            case "4":
                System.out.println("ALGORITMO LINEAL");
                int c, modulo;
                System.out.print("Ingresa el valor de la semilla Xi: ");
                semilla = lector.nextInt();

                System.out.print("Ingresa el valor de la constante multiplicativa ");
                a = lector.nextInt();

                System.out.print("Ingresa el valor de la constante aditiva ");
                c= lector.nextInt();
                
                System.out.print("Ingresa el valor del modulo ");
                modulo= lector.nextInt();

                System.out.print("Ingresa la cantidad de numeros pseudoaleatorios que necesitas: ");
                n = lector.nextInt();

                for (int i = 0; i < n; i++) {

                    semilla = (a * semilla + c) % modulo;

                    double numeroPseudo = (double) semilla / modulo;

                    System.out.println((i + 1) + ". Xi = " + semilla + " -> Ri = " + numeroPseudo);
                }
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