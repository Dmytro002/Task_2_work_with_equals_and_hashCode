package org.example.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    @Test
    void goodEquals(){
        Contact contact1 = new Contact(1, "Natalia","Svirniuk");
        Contact contact2 = new Contact(1, "Dmytro","Svirniuk");
        assertNotEquals(contact1, contact2);
    }

    @Test
    void goodHashCode(){
        Contact contact1 = new Contact(1, "Natalia","Svirniuk");
        Contact contact2 = new Contact(1, "Dmytro","Svirniuk");
        assertNotEquals(contact1.hashCode(), contact2.hashCode());
    }

    @Test
    void goodEqualsWithArrayList(){
        List<Contact> contact = new ArrayList<>();
        contact.add(new Contact(1, "Natalia","Svirniuk"));
        List<Contact> contact2 = new ArrayList<>();
        contact2.add(new Contact(1, "Dmytro","Svirniuk"));
        assertNotEquals(contact, contact2);

    }
    @Test
    void goodEqualsWithHashMap(){
        Map<Integer,Contact> contactMap = new HashMap<>();
        contactMap.put(1,new Contact(1, "Dmytro","Loz"));
        Map<Integer,Contact> contactMap2 = new HashMap<>();
        contactMap2.put(1, new Contact(1, "Dmytro","Svirniuk"));
        assertNotEquals(contactMap, contactMap2);
    }


    @Test
    void goodHashCodeWithHashMap(){
        Contact code = new Contact();
        Map<Contact,String> contactMap = new HashMap<>();
        contactMap.put(code,"dima");
        assertEquals( "dima",contactMap.get(code));

    }
}