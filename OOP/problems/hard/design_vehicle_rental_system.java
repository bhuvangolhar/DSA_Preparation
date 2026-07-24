// Problem: Design a Vehicle Rental System
// Concept: OOP System Design
// Time Complexity: O(1)
// Space Complexity: O(1)

abstract class Vehicle {

    protected String vehicleNumber;
    protected double rentPerDay;

    Vehicle(String vehicleNumber, double rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.rentPerDay = rentPerDay;
    }

    abstract void displayVehicle();

    double calculateRent(int days) {
        return rentPerDay * days;
    }
}

class Car extends Vehicle {

    Car(String vehicleNumber, double rentPerDay) {
        super(vehicleNumber, rentPerDay);
    }

    @Override
    void displayVehicle() {
        System.out.println("Car Number: " + vehicleNumber);
    }
}

class Bike extends Vehicle {

    Bike(String vehicleNumber, double rentPerDay) {
        super(vehicleNumber, rentPerDay);
    }

    @Override
    void displayVehicle() {
        System.out.println("Bike Number: " + vehicleNumber);
    }
}

class Customer {

    private String name;

    Customer(String name) {
        this.name = name;
    }

    void displayCustomer() {
        System.out.println("Customer: " + name);
    }
}

class Rental {

    private Customer customer;
    private Vehicle vehicle;
    private int days;

    Rental(Customer customer, Vehicle vehicle, int days) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
    }

    void displayRentalDetails() {

        customer.displayCustomer();
        vehicle.displayVehicle();

        System.out.println(
            "Total Rent: " +
            vehicle.calculateRent(days)
        );
    }
}

public class Solution {

    public static void main(String[] args) {

        Customer customer = new Customer("Rahul");

        Vehicle vehicle = new Car("MH31AB1234", 1200);

        Rental rental = new Rental(
            customer,
            vehicle,
            3
        );

        rental.displayRentalDetails();
    }
}