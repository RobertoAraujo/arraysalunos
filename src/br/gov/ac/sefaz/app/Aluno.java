package br.gov.ac.sefaz.app;

import java.util.ArrayList;

public class Aluno {
	private String nome;
    private int telefone;
    private String uf;
    private ArrayList <Disciplina> disciplinas = new ArrayList <Disciplina>();

    public String getNome() {
        return nome;
        
        
        
        
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
}