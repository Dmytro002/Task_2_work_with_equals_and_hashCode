package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ContactHashcodeRandom extends Contact{
    public ContactHashcodeRandom(Integer id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public int hashCode() {
        int a = (int) Math.random();
        return a;
    }
}
