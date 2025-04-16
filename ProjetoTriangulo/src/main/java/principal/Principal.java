package principal;

import javax.swing.JOptionPane;
import model.Triangulo;

public class Principal {
    public static void main(String[] args) {
    //declara a instancia do objetov
    Triangulo tri1 = new Triangulo();
    
    tri1.setBase(Double.parseDouble(JOptionPane.
            showInputDialog("Digite a base do triângulo")));
    tri1.setAltura(Double.parseDouble(JOptionPane.
            showInputDialog("Digita a altura do triângulo")));
    
    JOptionPane.showMessageDialog(null,"A Área do Triângulo é " + tri1.getArea());
    }
}
