package Atividade03;

public class Dados {
    private int codigo;
    private int numeroCriptografado = 0;
    //metodo construtor
    public Dados(int codigo, int numeroCriptografado){
        this.codigo = codigo;
        this.numeroCriptografado = numeroCriptografado;
    }
    public void criptografia(){
        String tamanhoNumero = Integer.toString(codigo);
        int tamanho = tamanhoNumero.length();
        int digitos [] = new int [tamanho];
        int newCodigo[] = new int [tamanho];
        int auxiliar;
        for(int i = 0; i < tamanho; i++){
            digitos[i] = Character.getNumericValue(tamanhoNumero.charAt(i));
        }
        for(int i = 0; i < tamanho; i++){
           auxiliar = digitos[i] + 7;
           newCodigo[i] = auxiliar % 10;
        }
        for(int i = 0; i < 1; i++){
            auxiliar = newCodigo[i];
            newCodigo[i] = newCodigo[i+2];
            newCodigo[i+2] = auxiliar;
        }
        for(int i = 1; i < 2; i++){
            auxiliar = newCodigo[i];
            newCodigo[i] = newCodigo[i+2];
            newCodigo[i+2] = auxiliar;
        }

    for (int i = 0; i < tamanho; i++) {
        numeroCriptografado = numeroCriptografado * 10 + newCodigo[i];
    }
    System.out.println(numeroCriptografado);
    }
    public void descriptografia(){
        
        String tamanhoNumero = Integer.toString(codigo);
        int tamanho = tamanhoNumero.length();
        int digitos [] = new int [tamanho];
        int newCodigo[] = new int [tamanho];
        int auxiliar = 0;
        for(int i = 0; i < tamanho; i++){
            digitos[i] = Character.getNumericValue(tamanhoNumero.charAt(i));
        }
        for(int i = 0; i < tamanho; i++){
        auxiliar = digitos[i]  - 7;
        if (auxiliar < 0) {
            auxiliar += 10;
        }
        newCodigo[i] = auxiliar % 10;
        }
       
        auxiliar = newCodigo[0];
        newCodigo[0] = newCodigo[2];
        newCodigo[2] = auxiliar;
        auxiliar = newCodigo[1];
        newCodigo[1] = newCodigo[3];
        newCodigo[3] = auxiliar;

        for (int i = 0; i < tamanho; i++) {
            numeroCriptografado = numeroCriptografado * 10 + newCodigo[i];
        }
        System.out.println(numeroCriptografado);
    } 
}

