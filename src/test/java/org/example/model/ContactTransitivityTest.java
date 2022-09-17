package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ContactTransitivityTest {

    @Test
    void TransitivityViolation(){
        Contact contactWithAge2 = new ContactAgeTransitivity(1, "Dmytro","Lozin",19);
        Contact contact6 = new ContactAgeTransitivity(1, "Dmytro","Lozin");
        ContactAge contactWithAge3 = new ContactAgeTransitivity(1, "Dmytro","Lozin",11);
        assertEquals(contactWithAge2, contact6);
        assertEquals(contact6, contactWithAge3);
        assertNotEquals(contactWithAge2, contactWithAge3);
    }
}