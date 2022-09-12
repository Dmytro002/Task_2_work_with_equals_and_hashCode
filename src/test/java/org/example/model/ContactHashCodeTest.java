package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactHashCodeTest {
    @Test
    void hashcodeAlwaysReturnsNull(){
        Contact contact1 = new ContactHashCode(1, "Dmytro","Losin");
        Contact contact2 = new ContactHashCode(1, "Dmytro","Svirniuk");
        assertTrue(contact1.hashCode() == contact2.hashCode());

    }
}