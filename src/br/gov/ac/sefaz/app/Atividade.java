package br.gov.ac.sefaz.app;

import java.util.ArrayList;

public class Atividade {

	public static void main(String[] args) {
		Aluno alunosc = new Aluno();
		alunosc.setNome("Roberto Moraes");
		alunosc.setIdade(32);
		alunosc.setTurma("B");
		
		ArrayList<String> alunos = new ArrayList<String>();
		alunos.add("Bruno bortoli 0");
		alunos.add("Bruno bortoli 1");
		alunos.add("Bruno bortoli 2");
		alunos.add("Bruno bortoli 3");
		alunos.add("Bruno bortoli 4");
		
		//System.out.println(alunos.get(1));
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}

	}

}
