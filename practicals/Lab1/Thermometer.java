// Implements a Thermometer class.
// Stores the current temperature in Celcius

public class Thermometer    
{
     // begin Thermometer
private double celsius;
 // celsius is accessible to all methods in this class (moreabout private later )
public Thermometer(){ // constructor method
     setCelsius (0);
}
public Thermometer(double cel)
{
     setCelsius(cel);
}
public void setCelsius (double cel ){ // method to set the temperature
celsius = cel;
}
public double getCelsius (){ // method to get the temperature
return celsius ;
}
} // end class Thermometer