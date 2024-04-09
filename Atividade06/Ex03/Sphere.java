package Atividade06;

class Sphere extends ThreeDimensionalShape {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    // Implementação do método para calcular a área da superfície da esfera
    @Override
    double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Implementação do método para calcular o volume da esfera
    @Override
    double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

