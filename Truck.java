/*
* This subclass creates a truck using specifications from the Vehicle class.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-16
*/

public class Truck extends Vehicle {
  // Initializing fields
  private String licensePlateNumber;

  /**
   * Setting field values with a constructor.
   */
  public Truck(String truckColour) {
    super(truckColour);
    this.colour = truckColour;
    licensePlateNumber = "DEFAULT";
  }

  /**
   * This setter sets the license plate of the truck.
   */
  public void setLicensePlate(String licensePlateInput) {
    this.licensePlateNumber = licensePlateInput;
  }

  /**
   * This getter shows the user the license plate of the truck.
   */
  public String getLicensePlate() {
    return this.licensePlateNumber;
  }

  /**
   * This method blows the truck's horn.
   */
  public String provideAir() {
    return "HONK";
  }
}
