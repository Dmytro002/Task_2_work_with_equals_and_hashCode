package org.example.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    @Test
    void goodEquals(){
        Contact contact1 = new Contact(1, "Natalia","Svirniuk");
        Contact contact2 = new Contact(1, "Dmytro","Svirniuk");
        assertEquals(false, contact1.equals(contact2));
    }

    @Test
    void goodHashCode(){
        Contact contact1 = new Contact(1, "Natalia","Svirniuk");
        Contact contact2 = new Contact(1, "Dmytro","Svirniuk");
        assertNotEquals(contact1.hashCode(), contact2.hashCode());
    }

    @Test
    void goodEqualsWithCollections(){
        List<Contact> contact = new ArrayList<>();
        contact.add(new Contact(1, "Natalia","Svirniuk"));
        List<Contact> contact2 = new ArrayList<>();
        contact2.add(new Contact(1, "Dmytro","Svirniuk"));
        assertNotEquals(contact, contact2);

    }
    @Test
    void goodHashCodeWithCollections(){
        List<Contact> contactHashCode = new ArrayList<>();
        contactHashCode.add(new Contact(1, "Natalia","Svirniuk"));
        List<Contact> contactHashCode2 = new ArrayList<>();
        contactHashCode2.add(new Contact(1, "Dmytro","Svirniuk"));
        List<Contact> contactHashCode3 = new ArrayList<>();
        contactHashCode3.add(new Contact(1, "Dmytro","Svirniuk"));
        assertNotEquals(contactHashCode.hashCode(), contactHashCode2.hashCode());
        assertEquals(contactHashCode2.hashCode(), contactHashCode3.hashCode());

    }
}