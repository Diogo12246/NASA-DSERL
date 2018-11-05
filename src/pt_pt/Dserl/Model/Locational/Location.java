package pt_pt.Dserl.Model.Locational;

public class Location {
    private String Country;
    private String city;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Location(String country, String city) {
        Country = country;
        this.city = city;
    }
}
