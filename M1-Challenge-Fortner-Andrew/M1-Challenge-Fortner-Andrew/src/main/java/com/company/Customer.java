package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private List<AccountRecord> charges = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        //update this
        int temp = 0;
        for(AccountRecord a : charges){
            temp += a.getCharge();
        }
        return temp;
    }

    public List<AccountRecord> getCharges() {
        return charges;
    }

    @Override

    public String toString() {
        //update toString to print customer id, customer name, and customer balance
        return "Customer ID: " + id +
                ", Customer Name: " + name + ", Balance: " + getBalance();
    }
}
