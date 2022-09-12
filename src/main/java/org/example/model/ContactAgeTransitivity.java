package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ContactAgeTransitivity extends ContactAge{
    public ContactAgeTransitivity(Integer id, String firstName, String lastName, Integer age) {
        super(id, firstName, lastName, age);
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Contact && o != null )
            if (o instanceof ContactAge){
                return super.equals(o) && this.getAge().equals(((ContactAge) o).getAge());
            } else return o.equals(this);
        return false;
    }
}
