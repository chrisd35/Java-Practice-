package OOP;

public class Dealership {
    private Car[] cars;

    public Dealership(Car[] cars) {

        // creates new object that shares the same length
        // as the array being passed in
        // creates an unique reference to its own array
        this.cars = new Car[cars.length];

        // populates every element with an object
        // by calling the copy constructor
        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }

    }

    public void sell(int index) {
        this.cars[index].drive(); // drives the car out of the parking lot
    }

    public String toString() {
        String temp = ""; // empty string

        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }
}
