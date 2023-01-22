package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestJunitTestCase {
    Customer c = new Customer();

    @Test
    public void testBalance() {
        c.setId(1);
        c.setName("Wayne Enterprises");
        AccountRecord a = new AccountRecord();
        a.setCharge(10000);
        a.setChargeDate("12-01-2021");
        c.getCharges().add(a);
        assertEquals(10000, c.getBalance());
    }

    @Test
    public void testToString() {
        c.setId(1);
        c.setName("Wayne Enterprises");
        AccountRecord a = new AccountRecord();
        a.setCharge(10000);
        a.setChargeDate("12-01-2021");
        c.getCharges().add(a);
        assertEquals("Customer ID: 1, Customer Name: Wayne Enterprises, Balance: 10000", c.toString());
    }

}
