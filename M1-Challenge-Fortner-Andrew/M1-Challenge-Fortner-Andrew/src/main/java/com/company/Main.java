package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;




public class Main {


    private static List<String[]> customerData = Arrays.asList(
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"},
            new String[]{"2", "Daily Planet", "-7500", "01-10-2022"},
            new String[]{"1", "Wayne Enterprises", "18000", "12-22-2021"},
            new String[]{"3", "Ace Chemical", "-48000", "01-10-2022"},
            new String[]{"3", "Ace Chemical", "-95000", "12-15-2021"},
            new String[]{"1", "Wayne Enterprises", "175000", "01-01-2022"},
            new String[]{"1", "Wayne Enterprises", "-35000", "12-09-2021"},
            new String[]{"1", "Wayne Enterprises", "-64000", "01-17-2022"},
            new String[]{"3", "Ace Chemical", "70000", "12-29-2022"},
            new String[]{"2", "Daily Planet", "56000", "12-13-2022"},
            new String[]{"2", "Daily Planet", "-33000", "01-07-2022"},
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"},
            new String[]{"2", "Daily Planet", "33000", "01-17-2022"},
            new String[]{"3", "Ace Chemical", "140000", "01-25-2022"},
            new String[]{"2", "Daily Planet", "5000", "12-12-2022"},
            new String[]{"3", "Ace Chemical", "-82000", "01-03-2022"},
            new String[]{"1", "Wayne Enterprises", "10000", "12-01-2021"}
    );

    public static void main(String[] args) {
        //Update this
        HashMap<Integer, Customer> uniqueCustomers= new HashMap<>();
        for(String[] s : customerData){
            if(!uniqueCustomers.containsKey(Integer.parseInt(s[0]))) {
                Customer c = new Customer();
                c.setId(Integer.parseInt(s[0]));
                c.setName(s[1]);
                AccountRecord a = new AccountRecord();
                a.setCharge(Integer.parseInt(s[2]));
                a.setChargeDate(s[3]);
                c.getCharges().add(a);
                uniqueCustomers.put(Integer.parseInt(s[0]), c);
            } else {
                Customer c = uniqueCustomers.get(Integer.parseInt(s[0]));
                AccountRecord a = new AccountRecord();
                a.setCharge(Integer.parseInt(s[2]));
                a.setChargeDate(s[3]);
                c.getCharges().add(a);
                uniqueCustomers.put(Integer.parseInt(s[0]), c);
            }
        }
        List<Customer> customers = new ArrayList<>(uniqueCustomers.values());
        //Print the positive accounts and negative accounts
        List<Customer> positiveAccounts = new ArrayList<>();
        List<Customer> negativeAccounts = new ArrayList<>();
        for(Customer c : customers){
            if(c.getBalance() > 0){
                positiveAccounts.add(c);
            } else {
                negativeAccounts.add(c);
            }
        }

        System.out.println("Positive accounts: " + positiveAccounts);
        System.out.println("Negative accounts:" + negativeAccounts);
        System.out.println("Customers: " + customers);
    }
}
