public class Boat extends Vehicles
{
  public Boat(String brand)
  {
    super(brand);
  }
  public String doStuff ()
  {
    return "I am " + this.getBrand() + " and I go glug glug glug!";
  }
}
