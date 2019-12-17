package br.com.projetin;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> listaAlunosDigital = new ArrayList<>();
    private List<Professor> listaProfessoresDigital = new ArrayList<>();
    private List<Curso> listaCursosDigital = new ArrayList<>();
    private List<Matricula> listaMatriculasDigital = new ArrayList<>();

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        listaCursosDigital.add(curso);
        System.out.println("Curso criado com sucesso!");
    }

    public void excluirCurso(Integer codigoCurso) {
        for (int i = 0; i < listaCursosDigital.size(); i++) {
            if (codigoCurso == listaCursosDigital.get(i).getCodigoCurso()) {
                listaCursosDigital.remove(listaCursosDigital.get(i));
                System.out.println("Curso excluído com sucesso!");
            }
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, sobrenome, codigoProfessor, 0, quantidadeDeHoras);
        listaProfessoresDigital.add(professorAdjunto);
        System.out.println("Professor adicionado com sucesso!");
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, codigoProfessor, 0, especialidade);
        listaProfessoresDigital.add(professorTitular);
        System.out.println("Professor adicionado com sucesso!");
    }

    public void excluirProfessor(Integer codigoProfessor) {
        for (int i = 0; i < listaProfessoresDigital.size(); i++) {
            if (codigoProfessor == listaProfessoresDigital.get(i).getCodigoProfessor()) {
                listaProfessoresDigital.remove(listaProfessoresDigital.get(i));
                System.out.println("Professor excluído com sucesso!");
            }
        }
    }

    public void gerarAluno(String nome, String sobrenome, Integer codigoAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        listaAlunosDigital.add(aluno);
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {
        int controle1 = 0;
        int controle2 = 0;
        for (int i = 0; i < listaCursosDigital.size(); i++) {
            if (listaCursosDigital.get(i).getCodigoCurso().equals(codigoCurso)) {
                for (int i1 = 0; i1 < listaAlunosDigital.size(); i1++) {
                    if (listaAlunosDigital.get(i1).getCodigoAluno().equals(codigoAluno)) {

                        controle2 = 1;
                        if (listaCursosDigital.get(i).adicionarUmAluno(listaAlunosDigital.get(i1))){
                            Matricula matricula = new Matricula(listaAlunosDigital.get(i1), listaCursosDigital.get(i));
                            listaMatriculasDigital.add(matricula);
                        }
                    }
                }
                controle1 = 1;
            }
        }
        if (controle1 == 0) {
            System.out.println("Não há este curso!");
        }
        if (controle1 == 1 && controle2 == 0) {
            System.out.println("Aluno ainda não foi gerado, favor matriculá-lo no sistema!");
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {
        for (int i = 0; i < listaCursosDigital.size(); i++) {
            if (listaCursosDigital.get(i).getCodigoCurso() == codigoCurso) {
                for (int i1 = 0; i1 < listaProfessoresDigital.size(); i1++) {
                    if (listaProfessoresDigital.get(i1).getCodigoProfessor() == codigoProfessorAdjunto) {
                        listaCursosDigital.get(i).setProfessorAdjunto(listaProfessoresDigital.get(i1));
                        System.out.println("Professor Adjunto alocado com sucesso! :D");
                    }
                    if (listaProfessoresDigital.get(i1).getCodigoProfessor() == codigoProfessorTitular) {
                        listaCursosDigital.get(i).setProfessorTitular(listaProfessoresDigital.get(i1));
                        System.out.println("Professor Titular alocado com sucesso! :D");
                    }
                }
            } else {
                System.out.println("O curso não existe! :(");
            }
        }
    }

//    public List<Aluno> getListaAlunosDigital() {
//        return listaAlunosDigital;
//    }
//
//    public void setListaAlunosDigital(List<Aluno> listaAlunosDigital) {
//        this.listaAlunosDigital = listaAlunosDigital;
//    }
//
//    public List<Professor> getListaProfessoresDigital() {
//        return listaProfessoresDigital;
//    }
//
//    public void setListaProfessoresDigital(List<Professor> listaProfessoresDigital) {
//        this.listaProfessoresDigital = listaProfessoresDigital;
//    }
//
//    public List<Curso> getListaCursosDigital() {
//        return listaCursosDigital;
//    }
//
//    public void setListaCursosDigital(List<Curso> listaCursosDigital) {
//        this.listaCursosDigital = listaCursosDigital;
//    }
//
//    public List<Matricula> getListaMatriculasDigital() {
//        return listaMatriculasDigital;
//    }
//
//    public void setListaMatriculasDigital(List<Matricula> listaMatriculasDigital) {
//        this.listaMatriculasDigital = listaMatriculasDigital;
//    }
public void imprimirDados(){
    System.out.println(listaProfessoresDigital);
    System.out.println(listaMatriculasDigital);
    System.out.println(listaCursosDigital);
    System.out.println(listaAlunosDigital);
    }

}

