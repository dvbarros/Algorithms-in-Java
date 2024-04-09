package Atividade06;

public class testAnimal {
    public static void main(String[] args) {
        Aguia aguia = new Aguia("Tião", 5, 30.5);
        Pinguim pinguim =  new Pinguim("HappyFeat", 7, "Branco");
        aguia.emitirSom();
        aguia.voando();
        pinguim.emitirSom();
        pinguim.nadando();
    }
}
