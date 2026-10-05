public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Toyota", "Fortuner", 2013);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 1995);
        Vehicle vehicle3 = new Vehicle("Ford", "Ranger", 2020);

        System.out.println("\nVehicle 1:");
        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println("\nVehicle 2:");
        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());

        System.out.println("\nVehicle 3:");
        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
        
        System.out.println("\n'setYear Test'");

        System.out.println("\nVehicle 1 Brand: " + vehicle1.getBrand());
        System.out.println("Vehicle 1 Model: " + vehicle1.getModel());
        System.out.println("Vehicle 1 Year: " + vehicle1.getYear());

        System.out.println("\nsetYear(2000): " + vehicle1.setYear(2000));
        System.out.println("Stored year: " + vehicle1.getYear());
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println("\nsetYear(1885): " + vehicle1.setYear(1885));
        System.out.println("Stored year: " + vehicle1.getYear());

        System.out.println("\nsetYear(2027): " + vehicle1.setYear(2027));
        System.out.println("Stored year: " + vehicle1.getYear());

        Vehicle invalidVehicle1 = new Vehicle("Test", "Old Car", 1885);
        System.out.println("\nNew vehicle with year 1885");
        System.out.println("Initial year: " + invalidVehicle1.getYear());

        Vehicle invalidVehicle2 = new Vehicle("Test", "Future Car", 2027);
        System.out.println("New vehicle with year 2027");
        System.out.println("Initial year: " + invalidVehicle2.getYear());
    }
}