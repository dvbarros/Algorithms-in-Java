package Atividade06;
import java.util.ArrayList;

public class TestaCarbon {
    public static void main(String[] args) {
        // Criando objetos de cada classe
        Building building = new Building("123 Main St", 5000, 3);
        Car car = new Car("Toyota", "Camry", 8.5);
        Bicycle bicycle = new Bicycle("Trek", 10);

        // Criando ArrayList de CarbonFootprint e inserindo os objetos
        ArrayList<CarbonFootprint> carbonFootprints = new ArrayList<>();
        carbonFootprints.add(building);
        carbonFootprints.add(car);
        carbonFootprints.add(bicycle);

        // Iterando pelo ArrayList e invocando o método getCarbonFootprint de cada objeto
        for (CarbonFootprint item : carbonFootprints) {
            System.out.println(item);
            System.out.println("Carbon Footprint: " + item.getCarbonFootprint() + " kgCO2eq");
            System.out.println();
        }
    }
}
