package Atividade06;

public class Ave extends Animal {
    protected double tamanhoAsa;

    public Ave (String nome, int idade, double tamanhoAsa){
        super(nome, idade);
        this.tamanhoAsa = tamanhoAsa;
    }

    @Override
    public void emitirSom(){
        System.out.println("");
    }
}
