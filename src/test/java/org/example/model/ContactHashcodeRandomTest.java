package org.example.model;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNull;

class ContactHashcodeRandomTest {


    @Test
    void hashcodeAlwaysReturnsRandomWithHashMap(){
        ContactHashcodeRandom code = new ContactHashcodeRandom();
        Map<ContactHashcodeRandom,String> contactMap = new HashMap<>();
        contactMap.put(code,"dima");
        assertNull(contactMap.get(code));

    }

}