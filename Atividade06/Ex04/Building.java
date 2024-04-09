package Atividade06;

class Building implements CarbonFootprint {
    private String address;
    private double squareFootage;
    private int numFloors;

    Building(String address, double squareFootage, int numFloors) {
        this.address = address;
        this.squareFootage = squareFootage;
        this.numFloors = numFloors;
    }

    @Override
    public double getCarbonFootprint() {
        // Exemplo de cálculo de pegada de carbono para um edifício
        return squareFootage * numFloors * 0.05; // Valor fictício para fins de exemplo
    }

    @Override
    public String toString() {
        return "Building at " + address;
    }
}
