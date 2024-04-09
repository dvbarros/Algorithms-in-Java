package Atividade06;

public class TestShape {
    public static void main(String[] args) {
        // Array de referências Shape
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(4);
        shapes[2] = new Sphere(3);
        shapes[3] = new Cube(2);

        // Iterando sobre todas as formas no array
        for (Shape shape : shapes) {
            // Imprimindo descrição do objeto
            System.out.println(shape);
            // Determinando se a forma é TwoDimensionalShape ou ThreeDimensionalShape
            if (shape instanceof TwoDimensionalShape) {
                // Exibindo área se for TwoDimensionalShape
                System.out.println("Área: " + ((TwoDimensionalShape) shape).getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                // Exibindo área e volume se for ThreeDimensionalShape
                System.out.println("Área: " + ((ThreeDimensionalShape) shape).getArea());
                System.out.println("Volume: " + ((ThreeDimensionalShape) shape).getVolume());
            }
            System.out.println(); // Adicionando linha em branco entre as formas
        }
    }
}
