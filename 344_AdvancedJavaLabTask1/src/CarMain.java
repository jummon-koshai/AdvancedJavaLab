class Car {
    String make;
    String model;
    int year;

    // 1️⃣ Default constructor
    Car() {
        this.make = "Lamb";
        this.model = "Unknown";
        this.year = 2000;
    }

    // 2️⃣ Parameterized constructor with default values
    Car(String make, String model, int year) {
        this.make = (make != null && !make.isEmpty()) ? make : "Unknown";
        this.model = (model != null && !model.isEmpty()) ? model : "Unknown";
        this.year = (year > 0) ? year : 2000;
    }

    // 3️⃣ Copy constructor
    Car(Car c) {
        if (c != null) {
            this.make = (c.make != null && !c.make.isEmpty()) ? c.make : "Unknown";
            this.model = (c.model != null && !c.model.isEmpty()) ? c.model : "Unknown";
            this.year = (c.year > 0) ? c.year : 2000;
        } else {
            this.make = "Unknown";
            this.model = "Unknown";
            this.year = 2000;
        }
    }

    void print() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class CarMain {
    public static void main(String[] args) {

        // Default constructor
        Car car1 = new Car();

        // Parameterized constructor
        Car car2 = new Car("Toyota", "Corolla", 1999);

        // Copy constructor
        Car car3 = new Car(car2);

        System.out.println("Car 1 (Default):");
        car1.print();

        System.out.println("\nCar 2 (Parameterized):");
        car2.print();

        System.out.println("\nCar 3 (Copy):");
        car3.print();
    }
}
