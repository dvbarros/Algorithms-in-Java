import java.util.ArrayList;

public class DiarioNotas {
    private String nomeCurso;
    private ArrayList<Double> notas = new ArrayList<>();

    public DiarioNotas (String nomeCurso, ArrayList<Double> notas){
        this.nomeCurso = nomeCurso;
        this.notas = notas;
    }
    public String getNomeCurso (){
        return nomeCurso;
    }
    public void setNomeCurso (String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
    public ArrayList<Double> getNotasCurso (){
        return notas;
    }
    public void setNotasCurso (ArrayList<Double> notas){
        this.notas = notas;
    }
    public double mediaNotas (){
        if(notas.isEmpty()){
            System.out.println("A Lista de Notas está vazia!");
        }
        double media = 0;
        double tamanho = notas.size();
        for(double x : notas){
            media += x;
        }
        return media/tamanho;
    }
    public void maiorNota(){
        double maiorNota = 0;
        if(notas.isEmpty()){
            System.out.println("A Lista de Notas está vazia!");
        }else{
            for(double x : notas){
                if(x > maiorNota)
                    maiorNota = x;
            }
            System.out.println("A maior nota foi: " + maiorNota);
        }
    }
    public void menorNota(){
        double menorNota = 10;
        if(notas.isEmpty()){
            System.out.println("A Lista de Notas está vazia!");
        }else{
            for(double x : notas){
                if(x < menorNota){
                    menorNota = x;
                }
            }
            System.out.println("A menor nota foi: " + menorNota);
        }  
    }
    public void grafico(){
        for(double nota : notas){
            int numAst = (int) nota;
            System.out.print("Nota " + nota + ": ");
            for(int i = 0; i < numAst; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
