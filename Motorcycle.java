public class Motorcycle extends Vehicle implements Serviceable {
    private String EngineType;

    public Motorcycle(String brand, String model, int year, String EngineType) {
        super(brand, model, year);
        this.EngineType = EngineType;
    }

    @Override 
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Type: " + EngineType);
    }

    public void moveForward(){
        System.out.println("Motorcycle is Moving Forward.");
    }
    public void moveBackward(){
        System.out.println("Motorcycle is Moving Backward.");
    }
    public void moveLeft(){
        System.out.println("Motorcycle is Moving on Left.");
    }
    public void moveRight(){
        System.out.println("Motorcycle is Moving on Right.");
    }
    public void service() {
        System.out.println("Motorcycle: Inspect tires and brakes.");
    }
}
