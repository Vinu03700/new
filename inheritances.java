// Base class (Parent class)
class Vehicle {
    String modelName;
    String engineType;

    public Vehicle(String modelName, String engineType) {
        this.modelName = modelName;
        this.engineType = engineType;
        System.out.println("Vehicle constructor called for: " + modelName);
    }

    public void startEngine() {
        System.out.println("Engine of " + modelName + " started.");
    }

    public void stopEngine() {
        System.out.println("Engine of " + modelName + " stopped.");
    }

    public void displayDetails() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Engine Type: " + engineType);
    }
}

// Derived class (Child class) inheriting from Vehicle (Single Inheritance)
class Car extends Vehicle {
    int numberOfDoors;

    public Car(String modelName, String engineType, int numberOfDoors) {
        // Call the constructor of the superclass (Vehicle)
        super(modelName, engineType);
        this.numberOfDoors = numberOfDoors;
        System.out.println("Car constructor called for: " + modelName + " with " + numberOfDoors + " doors.");
    }

    public void openDoor() {
        System.out.println("Door of " + modelName + " opened.");
    }

    public void closeDoor() {
        System.out.println("Door of " + modelName + " closed.");
    }

    // Override the displayDetails method to include car-specific information
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the superclass's displayDetails method
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        // Create an object of the base class (Vehicle)
        Vehicle genericVehicle = new Vehicle("Generic Vehicle", "Petrol");
        System.out.println("\n--- Generic Vehicle Details ---");
        genericVehicle.displayDetails();
        genericVehicle.startEngine();
        genericVehicle.stopEngine();

        // Create an object of the derived class (Car)
        Car myCar = new Car("Sedan X", "Petrol", 4);
        System.out.println("\n--- My Car Details ---");
        myCar.displayDetails(); // Calls the overridden method in Car
        myCar.startEngine();    // Inherited from Vehicle
        myCar.openDoor();       // Specific to Car
        myCar.closeDoor();      // Specific to Car
        myCar.stopEngine();     // Inherited from Vehicle
    }
}