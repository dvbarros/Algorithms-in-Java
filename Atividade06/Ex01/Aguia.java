package Atividade06;

public class Aguia extends Ave implements Voador {
    public Aguia (String nome, int idade, double tamanhoAsa){
        super(nome, idade, tamanhoAsa);
    }

    @Override
    public void emitirSom(){
        System.out.println("A águia grusne.");
    }
    
    @Override
    public void voando(){
        System.out.println("A águia está voando.");
    }
}
