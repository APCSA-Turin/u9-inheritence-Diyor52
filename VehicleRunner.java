
public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----

        Bicycle myBike = new Bicycle("Diyor's Bike", 2, 5);
        System.out.println(myBike.getWheels());
        System.out.println(myBike.getGeatCount());
        System.out.println(myBike.getName());
        myBike.move(10);
        myBike.turn(); 
        myBike.ringBell();
        myBike.brake();

    


    Scooter myScooter = new Scooter("Diyor's Scooter", 2, 5);
    System.out.println(myScooter.getWheels());
    System.out.println(myScooter.getLights());
    System.out.println(myScooter.getName());
    myScooter.move(10);
    myScooter.turn();
    myScooter.brake();
    myScooter.turnlightsOn();
    myScooter.turnlightsOff();
    


}

}