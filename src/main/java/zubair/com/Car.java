package zubair.com;

public class Car extends Vehicle {


    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();
        myCar.setName("Corolla");
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Toyota");
        Engine engine = new Engine();

        // Display Car Name and Brand
        System.out.println(vehicle.getBrand() + "\t" + myCar.getName());
        // Call the Hoot() method (from the Vehicle class) on the myCar object
        myCar.Hoot();
        // Calling Different Engine Sounds
        vehicle.engineSound();
        engine.engineSound();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class


    }
}
