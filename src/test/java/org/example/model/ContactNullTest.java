package org.example.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContactNullTest {
    @Test
    void doesNotWorkCheckOnNull(){
        ContactNull contactNull = new ContactNull(1,"f",null);
        assertTrue(contactNull.equals(null));

    }
}