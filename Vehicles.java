public abstract class Vehicles
{
private String brand;
private int kilometers;

public Vehicles (String brand)
{
  this.brand = brand;
  this.kilometers = 0;
}

/* Abstrakte Methode incl. Konstruktor */

/* Getter und Setter Anfang */
  public void setBrand (String brand)
  {
    this.brand = brand;
  }
  public String getBrand()
  {
    return this.brand;
  }
  public void setKilometers (int kilometers)
  {
    this.kilometers = kilometers;
  }
  public int getKilometers()
  {
    return this.kilometers;
  }

/* Getter und Setter Ende */

/* Abstrakte Methode */

abstract public String doStuff();
}


/* Extensions der Classes & Methoden */
