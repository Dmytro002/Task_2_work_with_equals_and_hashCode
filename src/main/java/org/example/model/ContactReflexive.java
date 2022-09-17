package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ContactReflexive extends Contact{
    public ContactReflexive(Integer id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return false;
        }
        if (o instanceof ContactReflexive && this.getId() == ((Contact) o).getId() ) {
            return true;
        }
        return false;
    }
}
