package principal;

import javax.swing.JOptionPane;
import model.Aluno;

public class Principal {

    public static void main(String[] args) {
        //declara a instancia do objetov
        Aluno aln1 = new Aluno();

        aln1.setAluno(JOptionPane.
                showInputDialog("Digite o nome do aluno"));
        aln1.setNota1(Double.parseDouble(JOptionPane.
                showInputDialog("Digite a primeira nota")));
        aln1.setNota2(Double.parseDouble(JOptionPane.
                showInputDialog("Digita a segunda nota")));
        aln1.setNota3(Double.parseDouble(JOptionPane.
                showInputDialog("Digita a terceira nota")));

        JOptionPane.showMessageDialog(null, "A média do aluno " + aln1.getAluno() + " é " + aln1.getMedia());
    }
}
