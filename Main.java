public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Toyota", "Corolla", 1995);
        Vehicle v2 = new Vehicle("Ford", "Mustang", 1967);
        Vehicle v3 = new Vehicle("Honda", "Civic", 2020);

        System.out.println("--- Original Vehicles Info ---");
        v1.displayInfo();
        v2.displayInfo();
        v3.displayInfo();

        System.out.println("\n--- Demonstrating Getters ---");
        System.out.println("Vehicle 1: " + v1.getBrand() + " " + v1.getModel() + " (" + v1.getYear() + ")");
        System.out.println("Vehicle 2: " + v2.getBrand() + " " + v2.getModel() + " (" + v2.getYear() + ")");
        System.out.println("Vehicle 3: " + v3.getBrand() + " " + v3.getModel() + " (" + v3.getYear() + ")");

        System.out.println("\n--- Testing setYear() Behavior on Vehicle 1 ---");
        
        boolean res1 = v1.setYear(2000);
        System.out.println("setYear(2000) result: " + res1 + "; stored year: " + v1.getYear() + 
                           "; age: " + v1.calculateAge() + "; vintage: " + v1.isVintage());

        boolean res2 = v1.setYear(1885);
        System.out.println("setYear(1885) result: " + res2 + "; stored year: " + v1.getYear());

        boolean res3 = v1.setYear(2027);
        System.out.println("setYear(2027) result: " + res3 + "; stored year: " + v1.getYear());

        System.out.println("\n--- Testing Constructor with Invalid Years ---");
        
        Vehicle invalid1 = new Vehicle("Tesla", "Model 3", 1885);
        System.out.println("New vehicle with year 1885 -> Initial year is " + invalid1.getYear());

        Vehicle invalid2 = new Vehicle("BMW", "M3", 2027);
        System.out.println("New vehicle with year 2027 -> Initial year is " + invalid2.getYear());
    }
}