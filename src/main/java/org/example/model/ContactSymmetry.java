package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ContactSymmetry extends Contact {

    private static boolean equalsCounterStatic = false;
    private boolean equalsCounter;


    public ContactSymmetry(Integer id, String firstName, String lastName) {
        super(id, firstName, lastName);
        equalsCounter = equalsCounterStatic;
        equalsCounterStatic = !equalsCounterStatic;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return  equalsCounter && getId() == contact.getId() && Objects.equals(getFirstName(), contact.getFirstName())
                && Objects.equals(getLastName(), contact.getLastName());
    }
}
