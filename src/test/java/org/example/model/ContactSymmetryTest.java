package org.example.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContactSymmetryTest {
    @Test
    void SymmetryViolation(){
        Contact contact1 = new ContactSymmetry(1, "Dmytro","Lozin");
        Contact contact2 = new ContactSymmetry(1, "Dmytro","Svirniuk");
        assertEquals(contact1, contact2);

    }

    @Test
    void SymmetryViolationWithCollections(){
        List<ContactSymmetry> contactSym = new ArrayList<>();
        contactSym.add(new ContactSymmetry(1, "Dmytro","Lozin"));
        List<ContactSymmetry> contactSym2 = new ArrayList<>();
        contactSym2.add(new ContactSymmetry(1, "Dmytro","Svirniuk"));
        assertEquals(contactSym, contactSym2);

    }

}