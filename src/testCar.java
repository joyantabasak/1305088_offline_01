/**
 * Created by Joyanta on 9/18/2015.
 */
public class testCar {
    public static void main (String args[])
    {
        Driver lewis = new Driver ("Lewis Hamilton", 30, "UK");
        System.out.println(lewis.getName() + " Age: " + lewis.getAge() + " Country: " + lewis.getCountry());
        Driver vettel = new Driver ("Sebestian Vettel", 28);
        vettel.setCountry("Germany");
        vettel.print();
        Car c1 = new Car ("F1 W06", "Mercedes" , lewis, 500);
        System.out.println(c1.getName() + " Manufacturer: " + c1.getManufacturer() + " Driver: " + c1.getDriver().getName() + " Fuelcapacity: " + c1.getFuelcapacity() );
        c1.refuel(100);
        c1.drive(400);
        System.out.println(c1.getName() + " Manufacturer: " + c1.getManufacturer() + " Driver: " + c1.getDriver().getName() + " Fuelcapacity: " + c1.getFuelcapacity());
        Car c2 = new Car ("SF15-T","Ferrari");
        c2.setDriver(vettel);
        c2.setFuelcapacity(400);
        c2.print();
        c2.refuel(50);
        c2.drive(500);
        c2.print();
        c1.getDriver().print();
        c2.getDriver().print();

    }
}
