package org.example.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ContactHashCodeTest {
    @Test
    void hashcodeAlwaysReturnsNull(){
        Contact contact1 = new ContactHashCode(1, "Dmytro","Losin");
        Contact contact2 = new ContactHashCode(1, "Dmytro","Svirniuk");
        assertEquals(contact1.hashCode(), contact2.hashCode());

    }


    @Test
    void hashcodeAlwaysReturnsNullWithHashMap(){
        Map<Integer,ContactHashCode> contactMap = new HashMap<>();
        contactMap.put(1,new ContactHashCode(1, "Dmytro","LOZ"));
        Map<Integer,ContactHashCode> contactMap2 = new HashMap<>();
        contactMap2.put(1,new ContactHashCode(1, "Dmytro","Svirniuk"));
        assertTrue(contactMap.hashCode() == contactMap2.hashCode());
    }

    @Test
    void hashcodeAlwaysReturnsNullWithArrayList(){
        List<ContactHashCode> contactHashCodeList = new ArrayList<>();
        contactHashCodeList.add(new ContactHashCode(2, "Dmytro","Loz"));
        List<ContactHashCode> contactHashCodeList1 = new ArrayList<>();
        contactHashCodeList1.add(new ContactHashCode(1, "Dmytro","Svirniuk"));
        assertEquals(contactHashCodeList.hashCode(), contactHashCodeList1.hashCode());
    }
}