package Atividade06;

public class Pinguim extends Mamifero implements Nadador {
    public Pinguim(String nome, int idade, String corPelo){
        super(nome, idade, corPelo);
    }
    @Override
    public void emitirSom(){
        System.out.println("O pinguim grusne.");
    }
    @Override
    public void nadando(){
        System.out.println("O pinguim está nadando.");
    }
}
