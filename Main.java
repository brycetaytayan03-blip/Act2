public class Main {

   public static void printDetails (Vehicle vehicle){
     vehicle.displayInfo();
   }

   public static void main(String[] args) { 
      Vehicle vehicle = new Car ("Honda", "Civic", 2019, 4);
         vehicle.displayInfo();
         System.out.println();
      
      vehicle = new Motorcycle ("Honda", "Click", 2022, "Automatic");
         vehicle.displayInfo();
         System.out.println();
      
      vehicle = new Truck ("Shacman", "H3000", 2023, 6);
         vehicle.displayInfo();
         System.out.println();
      
      System.out.println("\n=== Method Parameter===");
         Car car = new Car("Honda", "City", 2023, 4);
         Motorcycle motor = new Motorcycle("Yamaha", "Aerox", 2023, "Automatic");
         Truck truck = new Truck("Kenworth", "T680", 2026, 18); 
      
      printDetails(car);
      System.out.println();
      printDetails(motor);
      System.out.println();
      printDetails(truck);
      System.out.println();
      
      System.out.println("\n=====Polymorphic Array=====");
      Vehicle[] vehicles = {
         new Car("Toyota", "Wigo", 2024, 4),
         new Motorcycle("Kawasaki", "zx25r", 2025, "Manual"),
         new Truck("Scania", "R660", 2026, 12) 
      };
      
         for(Vehicle currentVehicle : vehicles){
            printDetails(currentVehicle);
            System.out.println();
         }
      }
}