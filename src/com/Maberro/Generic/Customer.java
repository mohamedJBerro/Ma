package com.Maberro.Generic;

public class Customer implements Comparable<Customer> {
    private String name;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

//    public Customer(String name) {
//        this.name = name;
//    }

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(Customer o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        Customer customer=(Customer) obj;
        return name==customer.name && email== customer.email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
