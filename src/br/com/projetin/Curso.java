package br.com.projetin;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nomeCurso;
    private Integer codigoCurso;
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;
    private List<Aluno> listaAlunos = new ArrayList();
    private Integer qtdMax;
    private int qtdMaxAtual = 0;

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(Professor professorAdjunto) {
        this.professorAdjunto = (ProfessorAdjunto) professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(Professor professorTitular) {
        this.professorTitular = (ProfessorTitular) professorTitular;
    }

    public Curso(){}
    public Curso(String nomeCurso, Integer codigoCurso, Integer qtdMax) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.qtdMax= qtdMax;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (qtdMaxAtual < qtdMax) {

            System.out.println("Aluno matriculado com sucesso! :D");
            listaAlunos.add(umAluno);
            qtdMaxAtual++;
            return true;
        } else {
            System.out.println("Não há vagas disponíveis neste curso! :(");
            return false;
        }
    } public void excluirAluno(Aluno umAluno) {
            listaAlunos.remove(umAluno);
            System.out.println("Aluno excluído com sucesso!");
    }
}


