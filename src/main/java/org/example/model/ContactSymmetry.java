package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ContactSymmetry extends Contact {


    public ContactSymmetry(Integer id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Contact) {
            return getId().equals(((Contact) o).getId());
        }
        // violation of symmetry, classes of different origin
        if (o instanceof Integer) {
            return getId().equals(o);
        }
        return false;
    }
}
