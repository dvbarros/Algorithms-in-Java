package Atividade02;

public class Date {
    private int dia, mes, ano;
    //Método Construtor
    public Date (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    //Setter para Data
    public void setDate (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    //Getter para Data
    public int getDia (){
        return dia;
    }
    public int getMes (){
        return mes;
    }
    public int getAno (){
        return ano;
    }

    public void displayDate (){
        System.out.println("Data:"+ getDia() + "/" + getMes() + "/" + getAno());
    }
}
