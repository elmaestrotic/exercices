import javax.swing.*;

public class RetoSwitchCase {
    public static void main(String[] args) {
        JTextArea area = new JTextArea();
        String sDias = JOptionPane.showInputDialog("Digite el número de días: ");
        int días = Integer.parseInt(sDias);
        sDias = "";
        for (int i = 1; i <= días; i++) {
            sDias += JOptionPane.showInputDialog("Ingrese el valor del día " + i);
        }
        JOptionPane.showMessageDialog(null, "Valor de la variable sDias es: " + sDias);

        String salida = "";
        for (int i = 0; i < sDias.length(); i++) {
            salida +=sDias.charAt(i)+".";
            salida+=swicthDia(sDias.charAt(i)+"") + "\n";

        }
        area.setText(salida);
        JOptionPane.showMessageDialog(null, area);
    }

    static String swicthDia(String day) {
        int dia = Integer.parseInt(day);
        String dayString;
        // switch statement with int data type
        switch (dia) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
        }
        return dayString;
    }
}//end class
