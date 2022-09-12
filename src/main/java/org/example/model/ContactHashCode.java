package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ContactHashCode extends Contact{
    public ContactHashCode(Integer id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
