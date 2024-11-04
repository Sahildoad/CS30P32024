package Skillbuilders;

import java.io.Serializable;

public class StuName implements Serializable {
    private String firstName;
    private String lastName;

 
    public StuName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

  
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
