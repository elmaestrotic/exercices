import javax.swing.*;

public class JOptionPaneEjemplo {

    public static void main(String[] args) {
        String n1, n2 = "";
        n1 = JOptionPane.showInputDialog("Digite un entero: ");
        n2 = JOptionPane.showInputDialog("Digite otro entero: ");
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int suma = a + b;
        JOptionPane.showMessageDialog(null, suma);
    }
}
