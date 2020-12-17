/*
* This subclass creates a bike using specifications from the Vehicle class.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2020-12-16
*/

public class Bike extends Vehicle {
  // Initializing fields
  private float cadence;

  /**
   * Setting field values with a constructor.
   */
  public Bike(String bikeColour) {
    super(bikeColour);
    this.colour = bikeColour;
    cadence = 0;
  }

  /**
   * This shows the user the bike's cadence.
   */
  public float getCadence() {
    // Calculating and returning cadence
    //   Equation of speed over 8.3 was derived by using average
    //   specifications of a bicycle to determine average multiplier
    cadence = getSpeed() * 8.3f;
    return cadence;
  }

  /**
   * This method rings the bike's bell.
   */
  public String ringBell() {
    return "RING";
  }
}
