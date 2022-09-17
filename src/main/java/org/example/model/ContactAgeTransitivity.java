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
public class ContactAgeTransitivity extends ContactAge{
    public ContactAgeTransitivity(Integer id, String firstName, String lastName, Integer age) {
        super(id, firstName, lastName, age);
    }

    public ContactAgeTransitivity(Integer id, String firstName, String lastName) {
        super(id, firstName, lastName, null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactAgeTransitivity contact = (ContactAgeTransitivity) o;
        return Objects.equals(getId(), contact.getId()) && Objects.equals(getFirstName(), contact.getFirstName())
                && Objects.equals(getLastName(), contact.getLastName()) && ( getAge() == null ||
                contact.getAge()==null || Objects.equals(getAge(), contact.getAge()));
    }
}
