public class Car {
    private String brand;
    private int power;
    private double engineVolume;

    public Car(String brand, int power, double engineVolume) {
        this.brand = brand;
        this.power = power;
        this.engineVolume = engineVolume;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void displayInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Мощность: " + power + "л.с.");
        System.out.println("Объем двигателя: " + engineVolume + "л.");
    }

    public void increasePower(int amount) {
        this.power += amount;
        System.out.println("Мощность увеличена на " + amount + "л.с. до " + this.power);
    }

    public boolean isPowerful() {
        return this.power > 200;
    }

    public String getCarSummary() {
        return "Автомобиль: " + brand + ", " + power + "л.с., " + engineVolume + "л.";
    }
}
