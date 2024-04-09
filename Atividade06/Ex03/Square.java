package Atividade06;

class Square extends TwoDimensionalShape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    // Implementação do método para calcular a área do quadrado
    @Override
    double getArea() {
        return side * side;
    }
}

