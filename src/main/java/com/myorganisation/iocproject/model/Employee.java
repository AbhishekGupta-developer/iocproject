package com.myorganisation.iocproject.model;

public class Employee {

    private String name;
    private Address address;
    private Department department;

    public Employee(String name, Address address, Department department) {
        this.name = name;
        this.address = address;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", department=" + department +
                '}';
    }

}
