/**
 * Created by Joyanta on 9/18/2015.
 */
public class Driver {
    private int age;
    private String name;
    private String country;
    public Driver(){};
    public Driver(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public Driver(String name, int age, String country)
    {
        this.name=name;
        this.age=age;
        this.country=country;
    }
    public String getName() { return this.name; }
    public String getCountry() { return this.country; }
    public int getAge() { return this.age; }
    public void setCountry (String country) { this.country = country ; }
    public void print () {
        System.out.println( this.name + " Age: " + this.age + " Country: " + this.country);
    }



}
