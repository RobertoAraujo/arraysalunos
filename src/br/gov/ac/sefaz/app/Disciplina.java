package br.gov.ac.sefaz.app;

import javax.swing.JOptionPane;

public class Disciplina {

	 public Disciplina ler() {
	        Disciplina disciplina = new Disciplina();
	        disciplina.setNome(JOptionPane.showInputDialog("Digite o nome da disciplina:"));
	        disciplina.setValor(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da disciplina:")));
	        disciplina.setDuracao(Integer.parseInt(JOptionPane.showInputDialog("Digite a duração da disciplina:")));
	        return disciplina;
	    }
}
