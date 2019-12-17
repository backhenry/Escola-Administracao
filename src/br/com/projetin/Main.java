package br.com.projetin;

public class Main {
    public static void main(String[] args) {


//        ProfessorTitular jess = new ProfessorTitular("Jess", "Correa", 001, 2, "android");
//        ProfessorTitular joao = new ProfessorTitular("Joao", "Silva", 002, 2, "android");
//        ProfessorAdjunto joaoSilva = new ProfessorAdjunto("joao", "silva", 003, 2, 20);
//        ProfessorAdjunto jessCorrea = new ProfessorAdjunto("jess", "correa", 004, 2, 20);


        //criando o atendente
        DigitalHouseManager atendente = new DigitalHouseManager();

        //criando os professores no sistema
        atendente.registrarProfessorTitular("Jess", "Correa", 001, "android");
        atendente.registrarProfessorTitular("Joao", "Silva", 002, "android");
        atendente.registrarProfessorAdjunto("joao", "silva", 003, 20);
        atendente.registrarProfessorAdjunto("jess", "correa", 004, 20);
        //alocando professores em seus cursos
        atendente.alocarProfessores(20001, 001,003);
        atendente.alocarProfessores(20002, 002,004);

        //gerando os alunos no sistema
        atendente.gerarAluno("Fabricio", "Fogli", 001);
        atendente.gerarAluno("Cleysson", "Lopes", 002);
        atendente.gerarAluno("Solange", "Silva", 003);
        atendente.gerarAluno("Dionisio", "Fortunato", 004);
        atendente.gerarAluno("Henrique", "Martins", 005);

        //registrando os cursos
        atendente.registrarCurso("Full Stack", 20001, 3);
        atendente.registrarCurso("Android", 20002, 2);

        //matriculando alunos em seus devidos cursos
        atendente.matricularAluno(001, 20001);
        atendente.matricularAluno(002, 20001);
        atendente.matricularAluno(003,20002);
        atendente.matricularAluno(004,20002);
        atendente.matricularAluno(005, 20002);

        //atendente.imprimirDados();
    }
}
