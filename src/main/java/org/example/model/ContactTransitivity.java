package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ContactTransitivity extends Contact{

    public ContactTransitivity(Integer id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Contact && o != null){
            if(this.getId() == ((Contact)o).getId() && this.getFirstName() == ((Contact)o).getFirstName() && this.getLastName() == ((Contact)o).getLastName())
                return true;
        }
        return false;
    }
}
