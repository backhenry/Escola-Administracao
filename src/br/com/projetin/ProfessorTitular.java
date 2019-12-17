package br.com.projetin;

public class ProfessorTitular extends Professor {
private String especialidade;
    public ProfessorTitular(String nomeProfessor, String sobrenomeProfessor, Integer codigoProfessor, Integer tempoDeCasa, String especialidade) {
        super(nomeProfessor, sobrenomeProfessor, codigoProfessor, tempoDeCasa);
        this.especialidade= especialidade;
    }
}
