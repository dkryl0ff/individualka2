public class Truck extends Car{
    private double payloadCapacity;

    public Truck(String brand, int power, double engineVolume, double payloadCapacity) {
        super(brand, power, engineVolume);
        this.payloadCapacity = payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
        System.out.println("Грузоподъемность изменена на " + payloadCapacity + "кг.");
    }

    public boolean canCarryLoad(double load) {
        return load <= payloadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Грузоподъемность: " + payloadCapacity + "кг.");
    }
}

