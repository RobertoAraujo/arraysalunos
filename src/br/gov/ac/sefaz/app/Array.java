package br.gov.ac.sefaz.app;

public class Array {
	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		vetor[0] = 1;
		vetor[1] = 4;
		vetor[2] = 7;
		vetor[3] = 5;
		vetor[4] = 5;
		vetor[5] = 1;
		vetor[6] = 8;
		vetor[7] = 1;
		vetor[8] = 8;
		vetor[9] = 1;
		int tamanho = vetor.length;
		
		for(int i = 0; i < vetor.length; i++) {			
			System.out.println(i);
		}
		
		System.out.println(tamanho);
	}
	
}
