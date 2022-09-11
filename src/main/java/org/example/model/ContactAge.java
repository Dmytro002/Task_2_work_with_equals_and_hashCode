package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
    //TODO there is no check for null
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if ( getClass() != o.getClass()) return false;
//        ContactAge that = (ContactAge) o;
//        return Objects.equals(age, that.age);
//    }

    //TODO Transitivity violation

//    @Override
//    public boolean equals(Object o) {
//        if(o instanceof Contact && o != null )
//            if (o instanceof ContactAge){
//                return super.equals(o) && this.getAge().equals(((ContactAge) o).getAge());
//            } else return o.equals(this);
//        return false;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age);
    }
}
