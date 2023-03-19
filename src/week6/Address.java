package week6;

public class Address {

    /*
Address [object type]
/*
	create a class called Address
	declare these instance variables:
		street, city, state, zipcode, country

 */

    String street;
    String city;
    String state;
    int zipCode;
    String country;

    /*
	create a setInfo() method to initialize these variables
	*/

    public void setInfo(String street, String city, String state, int zipCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    /*
    create a toString() that shows the full address in the following format
    $street
    $city, $state $zipcode
    $country
    create a different class and create some Address objects
    */


    public String toString() {
        return street + "\n" + city + "\n" + state + " " + zipCode + "\n" + country;
                /*"Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", country='" + country + '\'' +
                '}';

                 */
    }


}

