public class Main {
    public static void main(String[] args) {
        Car altima = new Car();
        altima.make= "Nissan";
        altima.price = 10_000;
        altima.year= 2023;
        altima.color = "blue";

        Car charger = new Car();
        charger.make ="dodge";
        charger.price = 36_000;
        charger.year= 2024;
        charger.color = "black";


        System.out.println("This " + altima.make + " is worth $" + altima.price + 
        ". It was built in " + altima.year + ". It is " + altima.color + ".\n");
        System.out.println("This " + charger.make + " is worth $" + charger.price + 
        ". It was built in " + charger.year + ". It is " + charger.color + ".\n");

    }
}