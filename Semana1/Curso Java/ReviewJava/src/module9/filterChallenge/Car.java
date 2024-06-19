package module9.filterChallenge;

public class Car {

    String brand;
    String model;
    int year;
    Double liter;
    Double efficiency;

    public Car(String brand, String model, int year, Double liter, Double efficiency) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.liter = liter;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", year = " + year +
                ", liter = " + liter +
                ", efficiency = " + efficiency +
                '}';
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getLiter() {
        return liter;
    }

    public void setLiter(Double liter) {
        this.liter = liter;
    }

    public Double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(Double efficiency) {
        this.efficiency = efficiency;
    }

}
