package br.com.projetin;

import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private Date data;

    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
        this.data = new Date();
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "aluno=" + aluno +
                ", curso=" + curso +
                ", data=" + data +
                '}';
    }
}
