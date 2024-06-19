package module7.heritageChallenge;

public class CarMain {

    public static void main(String[] args) {
        Car car1 = new Chevette(212);
        Car car2 = new CivicSI(400);

        car1.acelerar();
        car2.acelerar();

        int distancia = 0;
        while(distancia != 20){
            car1.acelerar();
            car2.acelerar();
            car1.acelerar();
            car2.acelerar();
            distancia++;
        }


        System.out.println("Velocidade final: " + car1.toString());
        System.out.println("Velocidade final: "+ car2.toString());
    }
}
