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
public class ContactNull extends Contact{
    public ContactNull(Integer id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return true;
        ContactNull contact = (ContactNull) o;
        return Objects.equals(getId(), contact.getId()) && Objects.equals(getFirstName(), contact.getFirstName()) &&
                Objects.equals(getLastName(), contact.getLastName());
    }
}
