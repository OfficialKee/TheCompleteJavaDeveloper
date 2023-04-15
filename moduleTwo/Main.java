import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car altima = new Car("Toyota", "red", 10_000, 2021);
        // altima.make= "Nissan";
        // altima.price = 10_000;
        // altima.year= 2023;
        // altima.color = "blue";

        Car charger = new Car("Dodge", "black", 36_000, 2023);
        // charger.make ="dodge";
        // charger.price = 36_000;
        // charger.year= 2024;
        // charger.color = "black";


        System.out.println("This " + altima.getMake() + " is worth $" + altima.getPrice() + 
        ". It was built in " + altima.getYear() + ". It is " + altima.getColor() + ".\n");
        System.out.println("This " + charger.getMake() + " is worth $" + charger.getPrice() + 
        ". It was built in " + charger.getYear() + ". It is " + charger.getColor() + ".\n");


        Person passengerOne = new Person();
        passengerOne.name = "Shikee Maloney";
        passengerOne.nationality= "American";
        passengerOne.dateOfBirth= " March-13-1997";
        passengerOne.passport = new String[]{passengerOne.name,passengerOne.nationality,passengerOne.dateOfBirth};
        passengerOne.seatNumber = 27;

        System.out.println(passengerOne.name);
        System.out.println(passengerOne.nationality);
        System.out.println(passengerOne.dateOfBirth);
        System.out.println(Arrays.toString(passengerOne.passport));
        System.out.println(passengerOne.seatNumber);


        // implementing COnstructors
        // constructors  runa as soon a you update an object
    }
}