public class Main {
    public static void main(String [] args){
        Car car = new Car("Toyota", 150, 1.8);
        car.displayInfo();
        car.increasePower(20);
        System.out.println(car.getCarSummary());
        System.out.println("Мощный автомобиль? " + car.isPowerful());

        System.out.println();

        Truck truck = new Truck("MAN", 400, 12.0, 10000);
        truck.displayInfo();
        System.out.println("Может ли перевозить 8000 кг? " + truck.canCarryLoad(8000));
        truck.setPayloadCapacity(12000);
        truck.displayInfo();
    }
}