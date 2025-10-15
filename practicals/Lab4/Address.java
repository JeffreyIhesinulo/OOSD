package Lab4;

public class Address {
    String street;
    String city;
    String county;

//constructor
    public Address(String street, String city, String county) 
    {
        setStreet(street); 
        setCity(city);
        setCounty(county);
    }
//setters & getters
    public void setCity(String city) {
        this.city = city;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getStreet() {
        return street;
    }
    //ToString
    @Override
    public String toString() {
       return "Address [street = "+street+", city "+city+", county "+county+"]";
    }    
    
}
