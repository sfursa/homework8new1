package com.company;

public class Person {
    String firstName;
    String lastName;
    Address address;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Имя - " + firstName + '\n' +
                "Фамилия - " + lastName + '\n' +
                "АДРЕС:" + '\n' +
                address;
    }
}
