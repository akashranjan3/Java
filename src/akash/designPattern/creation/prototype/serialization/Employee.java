package akash.designPattern.creation.prototype.serialization;

import java.io.Serializable;

public class Employee {
    private  String id;
    private  String name;
    private Address address;

    public Employee(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class Address{
    private  String country;
    private  String state;
    private  int pin;
    private  String city;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address() {
    }

    public Address(String country, String state, int pin, String city) {
        this.country = country;
        this.state = state;
        this.pin = pin;
        this.city = city;
    }


    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", pin=" + pin +
                ", city='" + city + '\'' +
                '}';
    }
}
