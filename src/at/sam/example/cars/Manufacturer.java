package at.sam.example.cars;

public class Manufacturer {
    public String Name;
    public String Country;
    public double Sale;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public double getSale() {
        return Sale;
    }

    public void setSale(double sale) {
        Sale = sale;
    }

    public double getBaseprice() {
        return Baseprice;
    }

    public void setBaseprice(double baseprice) {
        Baseprice = baseprice;
    }

    public double Baseprice;



    public Manufacturer(String name, String country, double sale, double baseprice) {
        Name = name;
        Country = country;
        Sale = sale;
        Baseprice = baseprice;

    }

}
