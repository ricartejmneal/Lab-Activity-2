public class Truck extends Vehicle implements Serviceable {
    private int numberOfWheels;

    Truck(String brand, String model, int year, int numberOfWheels) {
        super(brand, model, year);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Wheels: " + numberOfWheels);
    }

    public void moveForward(){
        System.out.println("Truck is Moving Forward.");
    }
    public void moveBackward(){
        System.out.println("Truck is Moving Backward.");
    }
    public void moveLeft(){
        System.out.println("Truck is Moving on Left.");
    }
    public void moveRight(){
        System.out.println("Truck is Moving on Right.");
    }
    public void service() {
        System.out.println("Truck: Inspect Cargo Brakes.");
    }

}
