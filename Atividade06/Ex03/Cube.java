package Atividade06;

class Cube extends ThreeDimensionalShape {
    private double side;

    Cube(double side) {
        this.side = side;
    }

    // Implementação do método para calcular a área da superfície do cubo
    @Override
    double getArea() {
        return 6 * side * side;
    }

    // Implementação do método para calcular o volume do cubo
    @Override
    double getVolume() {
        return side * side * side;
    }
}

