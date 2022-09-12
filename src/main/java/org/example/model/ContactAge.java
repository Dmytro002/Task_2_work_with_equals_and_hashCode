package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.example.model.Contact;

import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ContactAge extends Contact {
    private Integer age;

    public ContactAge(Integer id, String firstName,
                      String lastName, Integer age) {
        super(id, firstName, lastName);
        this.age = age;
    }
    // there is no check for null
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if ( getClass() != o.getClass()) return false;
        ContactAge that = (ContactAge) o;
        return Objects.equals(age, that.age);
    }




}
