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
public class Contact {
    private Integer id;
    private String firstName;
    private String lastName;

    public Contact(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
   //TODO Symmetry violation

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o instanceof Contact) {
//            return id.equals(((Contact) o).id);
//        }
//        // violation of symmetry, classes of different origin
//        if (o instanceof Integer) {
//            return id.equals(o);
//        }
//        return false;
//    }

  //TODO  Reflexive violation

//    public boolean equals(Object o){
//        if (this == o) {
//            return false;
//        }
//
//        if (o instanceof Contact && this.id == ((Contact) o).id ) {
//            return true;
//        }
//
//        return false;
//    }
   //TODO for transitivity
    
//    @Override
//    public boolean equals(Object o) {
//       if(o instanceof Contact && o != null){
//           if(this.getId() == ((Contact)o).getId() && this.getFirstName() == ((Contact)o).getFirstName() && this.getLastName() == ((Contact)o).getLastName())
//               return true;
//       }
//        return false;
//    }




    @Override
    public int hashCode() {
        return 1;
    }
}
