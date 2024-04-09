package Atividade06;

class Circle extends TwoDimensionalShape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implementação do método para calcular a área do círculo
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}
