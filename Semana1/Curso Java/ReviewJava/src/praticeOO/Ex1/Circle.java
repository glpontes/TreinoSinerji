package praticeOO.Ex1;

/*
Crie uma classe chamada “Círculo” que possua um atributo para armazenar o radius e
métodos para calcular a área e o perímetro do círculo. pi vezes o radius ao quadrado
*/

public class Circle {

    private int radius;

    private double area;

    final double pi = 3.14;

    public Circle(int radius){
        this.radius = radius;
    }

    void areaCalculate(){
        area = (radius * radius)  * pi;
    }

    @Override
    public String toString() {
        return "A área do circulo é:  " + area;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
