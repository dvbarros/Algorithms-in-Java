import java.util.HashSet;
import java.util.Set;

public class Ex02{
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>(5);
            numeros.add(Integer.parseInt(args[0]));
            numeros.add(Integer.parseInt(args[1]));
            numeros.add(Integer.parseInt(args[2]));
            numeros.add(Integer.parseInt(args[3]));
            numeros.add(Integer.parseInt(args[4]));
        

        for (int value : numeros){
            System.out.println(value);
        }
       



    }
}