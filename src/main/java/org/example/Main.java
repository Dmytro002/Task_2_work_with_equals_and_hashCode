package org.example;


import org.example.model.Contact;
import org.example.model.ContactAge;

public class Main {
    public static void main(String[] args) {
        System.out.println("Reflexive");
        Contact contact1 = new Contact(1, "Dmytro","Lozin");
        Contact contact2 = new Contact(1, "Dmytro","Svirniuk");
        System.out.println(contact1.equals(contact2));

        System.out.println("Symmetry");
        Contact contact3 = new Contact(1, "Dmytro","Lozin");
        Contact contact4 = new Contact(1, "Dmytro","Svirniuk");

        System.out.println(contact3.equals(contact4));
        ContactAge contactWithAge = new ContactAge(1,"Dmytro","Svirniuk",19);
        System.out.println(contact4.equals(contactWithAge));
        System.out.println(contactWithAge.equals(contact4));

        System.out.println("Transitivity");
        Contact contactWithAge2 = new ContactAge(1, "Dmytro","Lozin",19);
        Contact contact6 = new Contact(1, "Dmytro","Lozin");
        ContactAge contactWithAge3 = new ContactAge(1, "Dmytro","Lozin",11);
        System.out.println(contactWithAge2.equals(contact6));
        System.out.println(contact6.equals(contactWithAge3));
        System.out.println(contactWithAge2.equals(contactWithAge3));


        System.out.println("Checking on null");
        ContactAge contactWithAge1 = new ContactAge(null,"Dmytro","Svirniuk",19);
        System.out.println(contactWithAge.equals(contactWithAge1));

    }
}
