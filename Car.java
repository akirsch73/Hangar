public class Car extends Vehicles
{
  public Car(String brand)
  {
    super(brand);
  }
  public String doStuff ()
  {
    return "I am " + this.getBrand() + " and I go zoom zoom zoom!";
  }
}
