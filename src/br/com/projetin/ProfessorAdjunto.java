package br.com.projetin;

public class ProfessorAdjunto extends Professor {
    private Integer horasDeMonitoria;
    public ProfessorAdjunto(String nomeProfessor, String sobrenomeProfessor, Integer codigoProfessor, Integer tempoDeCasa, Integer horasDeMonitoria) {
        super(nomeProfessor, sobrenomeProfessor, codigoProfessor, tempoDeCasa);
        this.horasDeMonitoria= horasDeMonitoria;
    }

}
