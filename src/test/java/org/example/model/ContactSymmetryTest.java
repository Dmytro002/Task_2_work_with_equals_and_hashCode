package org.example.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ContactSymmetryTest {
    @Test
    void SymmetryViolation(){
        Contact contact1 = new ContactSymmetry(1, "Dmytro","Lozin");
        Contact contact2 = new ContactSymmetry(1, "Dmytro","Svirniuk");
        assertEquals(contact1, contact2);

    }

    @Test
    void SymmetryViolationWithArrayList(){
        List<ContactSymmetry> contactSym = new ArrayList<>();
        contactSym.add(new ContactSymmetry(1, "Dmytro","Lozin"));
        List<ContactSymmetry> contactSym2 = new ArrayList<>();
        contactSym2.add(new ContactSymmetry(1, "Dmytro","Svirniuk"));
        assertEquals(contactSym, contactSym2);
    }

    @Test
    void SymmetryViolationWithHashMap(){
        Map<Integer, ContactSymmetry> contactSymmetryMap = new HashMap<>();
        contactSymmetryMap.put(1,new ContactSymmetry(1, "Dmytro","LOZ"));

        Map<Integer, ContactSymmetry> contactSymmetryMap1 = new HashMap<>();
        contactSymmetryMap1.put(1,new ContactSymmetry(1, "Dmytro","Svirniuk"));
        assertEquals(contactSymmetryMap1, contactSymmetryMap);
    }

}