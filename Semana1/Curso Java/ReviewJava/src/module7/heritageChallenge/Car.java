package module7.heritageChallenge;

public class Car {

    private final int VELOCIDADE_MAX;
    private int velocidade = 0;
    private int delta = 5;

    public Car(int velocidadeMax) {
        this.VELOCIDADE_MAX = velocidadeMax;
    }

    public void acelerar() {
        if (velocidade + delta > VELOCIDADE_MAX) {
            velocidade = VELOCIDADE_MAX;
        } else {
            velocidade += delta;
        }
    }

    public void freiar() {
        if (velocidade - 10 >= 0) {
            velocidade -= 10;
        } else {
            velocidade = 0;
        }
    }

    @Override
    public String toString() {
        return "Velocidade do carro = " + velocidade;
    }

    // Getters and Setters for the attributes
    public int getVelocidade() {
        return velocidade;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public int getDelta() {
        return delta;
    }
}
