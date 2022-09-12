package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactHashcodeRandomTest {
    @Test
    void hashcodeRandom(){
        Contact contact1 = new ContactHashcodeRandom(2, "Dmytro","Losin");
        Contact contact2 = new ContactHashcodeRandom(1, "Dmytro","Svirniuk");
        assertTrue(contact1.hashCode() == contact2.hashCode());

    }
}