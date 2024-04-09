package Atividade06;

class Bicycle implements CarbonFootprint {
    private String brand;
    private double weight;

    Bicycle(String brand, double weight) {
        this.brand = brand;
        this.weight = weight; // Em quilogramas
    }

    @Override
    public double getCarbonFootprint() {
        // Pegada de carbono de uma bicicleta é zero
        return 0;
    }

    @Override
    public String toString() {
        return "Bicycle: " + brand;
    }
}
