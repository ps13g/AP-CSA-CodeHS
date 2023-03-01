public class CarTester
{
    public static void main(String[] args)
    {
        // Create a Car object
        Car car1 = new Car ("Honda", 30);
        // Print out the model
        System.out.println(car1.getModel());
        // Print out the fuelLevel
        System.out.println(car1.getFuelLevel());
        // Print how many miles are left with 23 mpg
        System.out.println(car1.milesLeft(23));
        // Print the object
        System.out.println(car1);
        // Create an ElectricCar object
        ElectricCar elec1 = new ElectricCar ("Tesla", 90);
        // Print out the model
        System.out.println(elec1.getModel());
        // Print out the fuelLevel
        System.out.println(elec1.getFuelLevel());
        // Print how many miles are left with 400 miles per charge
        System.out.println(elec1.milesLeft (400));
        // Print the object
        System.out.println(elec1);
    }
}
