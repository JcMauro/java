package principal;

import javax.swing.JOptionPane;
import model.Funcionario;

public class Principal {

    public static void main(String[] args) {
        Funcionario fcn1 = new Funcionario();

        fcn1.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário:"));
        fcn1.setDiasTrabalhados(Integer.parseInt(JOptionPane.showInputDialog("Digite os dias trabalhados:")));
        fcn1.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora:")));
        fcn1.setHorasDiarias(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas diárias:")));

        JOptionPane.showMessageDialog(null, "O salário mensal do funcionário é: " + fcn1.getSalarioMensal());
    }
}
