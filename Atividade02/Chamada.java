package Atividade02;

public class Chamada {
    private String nomeProfessor;
    private String nomeCurso;

    //metodo construtor
    public Chamada(String nomeProfessor, String nomeCurso){
        this.nomeProfessor = nomeProfessor;
        this.nomeCurso = nomeCurso;
    }
    
    public void setCurso(String nomeCurso, String nomeProfessor){
        this.nomeCurso = nomeCurso;
        this.nomeProfessor = nomeProfessor;
    }

    public String getCurso(){
        return nomeCurso;
    }
    public String getNomeProfessor(){
        return nomeProfessor;
    }
    public void mensagem (){
        System.out.println("Nome do Curso: " + getCurso());
        System.out.println("Nome do Docente: " + getNomeProfessor());
    }
}
