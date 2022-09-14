package org.example.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ContactReflexiveTest{
    @Test
    void ReflexiveViolation(){
        Contact contact1 = new ContactReflexive(1, "Dmytro","Lozin");
        Contact contact2 = new ContactReflexive(1, "Dmytro","Svirniuk");
        assertEquals(contact1, contact2);

    }
    @Test
    void ReflexiveViolationWithArrayList(){
        List<ContactReflexive> contactRef = new ArrayList<>();
        contactRef.add(new ContactReflexive(1, "Dmytro","Lozin"));
        List<ContactReflexive> contactRef2 = new ArrayList<>();
        contactRef2.add(new ContactReflexive(1, "Dmytro","Svirniuk"));
        assertEquals(contactRef, contactRef2);

    }
    @Test
    void ReflexiveViolationWithHashMap(){
        Map<Integer, ContactReflexive> contactReflexiveMap = new HashMap<>();
        contactReflexiveMap.put(1,new ContactReflexive(1, "Dmytro","LOZ"));

        Map<Integer, ContactReflexive> contactReflexiveMap1 = new HashMap<>();
        contactReflexiveMap1.put(1,new ContactReflexive(1, "Dmytro","Svirniuk"));
        assertEquals(contactReflexiveMap1, contactReflexiveMap);
    }

}