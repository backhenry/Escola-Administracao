package br.com.projetin;

public class Professor {
    private String nomeProfessor;
    private String sobrenomeProfessor;
    private Integer codigoProfessor;
    private Integer tempoDeCasa;

    public Professor(String nomeProfessor, String sobrenomeProfessor, Integer codigoProfessor, Integer tempoDeCasa) {
        this.nomeProfessor = nomeProfessor;
        this.sobrenomeProfessor = sobrenomeProfessor;
        this.codigoProfessor = codigoProfessor;
        this.tempoDeCasa = tempoDeCasa;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getSobrenomeProfessor() {
        return sobrenomeProfessor;
    }

    public void setSobrenomeProfessor(String sobrenomeProfessor) {
        this.sobrenomeProfessor = sobrenomeProfessor;
    }

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }
}
