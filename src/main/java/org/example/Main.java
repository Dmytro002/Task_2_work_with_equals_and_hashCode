package org.example;


import org.example.model.Contact;
import org.example.model.ContactAge;
import org.example.model.ContactNull;

public class Main {
    public static void main(String[] args) {
        ContactNull c = new ContactNull(1,"f",null);
        ContactNull c1 = new ContactNull(1,"f","dsd");
        System.out.println(c.equals(null));
    }
}
