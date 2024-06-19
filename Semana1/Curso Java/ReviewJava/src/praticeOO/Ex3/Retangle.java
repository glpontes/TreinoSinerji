package praticeOO.Ex3;
/*
Crie uma classe chamada “Retângulo”
que possua atributos para armazenar a largura e a altura.
Implemente métodos para calcular a área e o perímetro do retângulo.
*/

public class Retangle {

    private double height;
    private double width;
    double area;

    public Retangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    void calculateArea() {
        area = height * width;
    }

    @Override
    public String toString() {
        return "Area of retangle is: " + area;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
