import java.util.ArrayList;
import java.util.Scanner;

public class DiarioNotasTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeCurso;
        double nota;
        int continuar = 0;
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Digite o nome do curso: ");
        nomeCurso = sc.nextLine();
        System.out.println("Digite as notas: ");
        while(continuar != 1){
            nota = sc.nextDouble();
            notas.add(nota);
            System.out.println("Deseja Continuar ? \n0 - Sim\n1 - Não");
            continuar = sc.nextInt();
            if(continuar != 0){
                break;
            }else{
                System.out.println("Digite a nova nota: ");
            }
        }
        DiarioNotas diario = new DiarioNotas(nomeCurso, notas);
        System.out.println("Relatório de Notas do Curso: " + diario.getNomeCurso());
        System.out.println("Notas: " + diario.getNotasCurso());
        diario.grafico();
        diario.maiorNota();
        diario.menorNota();
        System.out.println("Média Notas: " + diario.mediaNotas());
        sc.close();
    }
    
}
