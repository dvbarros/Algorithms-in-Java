package Atividade06;

class Car implements CarbonFootprint {
    private String make;
    private String model;
    private double fuelConsumption;

    Car(String make, String model, double fuelConsumption) {
        this.make = make;
        this.model = model;
        this.fuelConsumption = fuelConsumption; // Litros por quilômetro
    }

    @Override
    public double getCarbonFootprint() {
        // Exemplo de cálculo de pegada de carbono para um carro
        return fuelConsumption * 2.3; // Valor fictício para fins de exemplo
    }

    @Override
    public String toString() {
        return "Car: " + make + " " + model;
    }
}
