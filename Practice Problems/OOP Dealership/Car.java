package OOP;

import java.util.Arrays;

//initialization of Car object
public class Car {

    // define fields
    // defined as private as they are exclusively used for the Car object
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    // defining a constructor
    // sets the current object field to a parameter
    // essentially, initializes objects
    public Car(String make, double price, int year, String color, String[] parts) {

        // this = refers to the current object
        // so, inside the constructor, we set every single field
        // of the current object equal to a parameter defined in the Main class
        // essentially, update every field of current object
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;

        // creates new array which is a copy of the defined array
        // field stores a unique reference to the array
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    // initializing copy constructor
    // source parameter points to the object being passed in
    // constructor expects to receive one parameter of type Car
    // updates the object's fields
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    // initialization of a getter which returns the field
    // of the current object that calls this object
    // essentially, returns the current value of the fields object
    public String getMake() {
        return make;
    }

    // when setter is called, it sets the make field of the current object
    // equal to the price value that gets passed in by the parameter
    // essentially, setters update the current objects's fields
    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    // method defining the drive task
    public void drive() {
        System.out.println(
                "\nYou bought the beautiful " + year + " " + color + " " + make + " for " + price + "with " + parts);
        System.out.println("Please drive your car to the nearest exit.\n");
    }

    // method to return a string representation of each field in 'this' object
    public String toString() {
        return "Make: " + this.make + ".\n" +
                "Price: " + this.price + ".\n" +
                "Year: " + this.year + ".\n" +
                "Color: " + this.color + ".\n" +
                "Parts: " + Arrays.toString(parts) + ".\n";
    }
}

// mutable object: object w/ setters
// this means that they can be changes after theyre created
// arrays = mutable objects