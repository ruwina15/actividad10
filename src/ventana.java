import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ventana extends JFrame {
    private JTextField cajaNombre;
    private JPanel miPanel;
    private JButton botonSaludar;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JButton btnSumar;
    private JTextField txtResultado;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;

    public ventana() {
        botonSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = cajaNombre.getText();
                JOptionPane.showMessageDialog(miPanel, "Hola " + n + "!!");
            }
        });
        txtNum1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNum1.setBackground(Color.yellow);
            }
        });
        txtNum1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                txtNum1.setBackground(Color.white);
            }
        });
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    double a = Double.parseDouble(txtNum1.getText() );
                    double b = Double.parseDouble(txtNum2.getText() );
                    double suma;
                    suma = a + b;
                    txtResultado.setText("La suma es: " + String.valueOf(suma));
                }
                catch(NumberFormatException ex)
                {
                    txtResultado.setText("Por favor, ingrese números.");
                }

            }
        });
        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    double a = Double.parseDouble(txtNum1.getText() );
                    double b = Double.parseDouble(txtNum2.getText() );
                    double resta;
                    resta = a - b;
                    txtResultado.setText("La resta es: " + String.valueOf(resta));
                }
                catch(NumberFormatException ex)
                {
                    txtResultado.setText("Por favor, ingrese números.");
                }

            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    double a = Double.parseDouble(txtNum1.getText() );
                    double b = Double.parseDouble(txtNum2.getText() );
                    double multi;
                    multi = a * b;
                    txtResultado.setText("La multiplicación es: " + String.valueOf(multi));
                }
                catch(NumberFormatException ex)
                {
                    txtResultado.setText("Por favor, ingrese números.");
                }
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    double a = Double.parseDouble(txtNum1.getText() );
                    double b = Double.parseDouble(txtNum2.getText() );
                    double division;
                    division = a / b;
                    txtResultado.setText("La división es: " + String.valueOf(division));
                }
                catch(NumberFormatException ex)
                {
                    txtResultado.setText("Por favor, ingrese números.");
                }

            }
        });
    }

    public static void main(String[] args) {
        ventana v = new ventana();
        v.setContentPane(v.miPanel);
        v.setSize(500,500);
        v.setVisible(true);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
