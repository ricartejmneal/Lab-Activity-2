public class Main {
    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }
    public static void main(String[] args) {
        System.out.println("=== 1. Parent Reference ===");
        Vehicle vehicle = new Car ("Ford", "Mustang", 2020, 2);
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Motorcycle("Harley-Davidson", "Street 750", 2019, "V-Twin");
        vehicle.displayInfo();

        System.out.println("\n === 2. Method Parameter ===");
        Car car = new Car ("Toyota", "Camry", 2021, 4);
        Motorcycle motorcycle = new Motorcycle("Ducati", "Panigale V4", 2022, "V4");
        Truck truck = new Truck("Volvo", "FH16", 2020, 18);
        printDetails(car);
        printDetails(motorcycle);
        printDetails(truck);

        System.out.println("\n === 3. Polymorphic Array ===");
        Vehicle[] vehicles = {
            new Car("Honda", "Civic", 2018, 4),
            new Motorcycle("Yamaha", "MT-07", 2020, "Parallel Twin"),
            new Truck("Ford", "F-150", 2019, 4)
        };

    for(Vehicle currentVehicle: vehicles){
        printDetails(currentVehicle);
        System.out.println();
    }
}
}
