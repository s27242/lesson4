public class Address {
    public String createAddress(String country) {
        return String.format("Country: %s", country);
    }

    public String createAddress(String country, String city) {
        return String.format("%s, City: %s", this.createAddress(country), city);
    }

    public String createAddress(String country, String city, String postIndex) {
        return String.format("%s, Post Index: %s", this.createAddress(country, city), postIndex);
    }

    public String createAddress(String country, String city, String postIndex, String street) {
        return String.format("%s, Street: %s", this.createAddress(country, city, postIndex), street);
    }

    public String createAddress(String country, String city, String postIndex, String street, String houseNumber) {
        return String.format("%s, House Number: %s", this.createAddress(country, city, postIndex, street), houseNumber);
    }

}
