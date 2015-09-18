/**
 * Created by Joyanta on 9/18/2015.
 */
public class Car {
    private String name;
    private String manufacturer;
    private Driver driver;
    private int fuelcapacity;
    public Car(String name, String manufacturer, Driver driver, int fuelcapacity)
    {
        this.name = name;
        this.manufacturer = manufacturer;
        this.driver = driver;
        this.fuelcapacity = fuelcapacity;
    }
    public Car(String name, String manufacturer)
    {
        this.name = name;
        this.manufacturer = manufacturer;
    }
    public String getName() { return this.name; }
    public String getManufacturer() { return this.manufacturer ;}
    public int getFuelcapacity() { return this.fuelcapacity;}
    public Driver getDriver() { return this.driver; }
    public void refuel (int fuelcapacity) { this.fuelcapacity += fuelcapacity ; }
    public void drive (int fuelcapacity )
    {
        if (this.fuelcapacity<fuelcapacity) { System.out.println("Driving distance exceeds the Car's fuel capacity!"); return; }
        this.fuelcapacity -= fuelcapacity;
    }
    public void setDriver(Driver driver) { this.driver = driver ; }
    public void setFuelcapacity(int fuelcapacity) { this.fuelcapacity = fuelcapacity; }
    public void print(){ System.out.println(getName() + " Manufacturer: " + getManufacturer() +" Driver " + getDriver().getName() + " Fuelcapacity: " + getFuelcapacity() ) ;   }


}

