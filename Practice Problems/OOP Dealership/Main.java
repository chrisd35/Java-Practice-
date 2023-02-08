package OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // initializes a new array object
        // String[] spareParts = new String[] { "Tires", "Keys" };

        // Car toyota = new Car("Toyota", 10000, 2020, "Black", new String[] { "Tires,
        // Keys" });
        // Car nissan = new Car("Nissan", 15000, 2019, "Grey", new String[] { "Tires,
        // Keys" });
        // Car toyota2 = new Car(toyota);

        // System.out.println(toyota);

        Scanner scan = new Scanner(System.in);

        // defines array that stores 5 Car elements
        // each elements stores a reference to the Car object
        Car[] cars = new Car[] {
                new Car("Nissan", 5000, 2020, "red", new String[] { "tires", "keys" }),
                new Car("Dodge", 8500, 2019, "blue", new String[] { "tires", "keys" }),
                new Car("Nissan", 5000, 2017, "yellow", new String[] { "tires", "filter" }),
                new Car("Honda", 7000, 2019, "orange", new String[] { "tires", "filter" }),
                new Car("Mercedes", 12000, 2015, "jet black", new String[] { "tires", "filter", "transmission" })
        };

        Dealership dealership = new Dealership(cars);

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.println("Feel free to browse through our collection of cars.\n");
        System.out.println(dealership);
        System.out.println("Which car are you interested in? (0 – 4).\n");
        int index = scan.nextInt();

        // calls the method sell
        dealership.sell(index);

        scan.close();

    }

}
