package br.gov.ac.sefaz.app;

public class Alunos {


	public static void main(String[] args) {

		int nota[] = {4,5,7,4,3,6,6,8,3,4};
		int aluno = 0;
		int soma = 0;
		
		while(aluno < 10){
			System.out.println("Aluno: " + aluno + " Nota: " + nota[aluno]);
			aluno++;
		}
		for(int i = 0; i < nota.length; i++){
			soma = soma + nota[i];
			System.out.println("A média é "+(soma/nota.length)); 
			//System.out.println(soma);
		}
	}
}
