package org.example.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class ContactSymmetryTest {
    @Test
    void SymmetryViolation(){
        Contact contact1 = new ContactSymmetry(1, "Dmytro","Svirniuk");
        Contact contact2 = new ContactSymmetry(1, "Dmytro","Svirniuk");
        assertNotEquals(contact1, contact2);
        assertEquals(contact2, contact1);
    }

    @Test
    void SymmetryViolationWithArrayList(){
        List<ContactSymmetry> contactSym = new ArrayList<>();
        contactSym.add(new ContactSymmetry(1, "Dmytro","Svirniuk"));
        List<ContactSymmetry> contactSym2 = new ArrayList<>();
        contactSym2.add(new ContactSymmetry(1, "Dmytro","Svirniuk"));
        assertNotEquals(contactSym, contactSym2);
        assertEquals(contactSym2, contactSym);

    }



}