package Atividade06;

public class Mamifero extends Animal{

    protected String corPelo;

    public Mamifero (String nome, int idade, String corPelo){
        super(nome, idade);
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom(){
        System.out.println("");
    };

}
