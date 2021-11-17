package saimDayByDay.day46_ConstructorsOverload;

public class Address {


    String street;
    String city;
    String state;
    String zipcode;
    String country;

    public Address(String street, String city, String state, String zipcode){

        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        country = "Us";
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Address address = new Address("100032 Oak Drive", "Chicago", "IL", "490101");
        System.out.println(address);
        System.out.println(address.state);

    }


}
