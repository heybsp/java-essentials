package org.bsp.streamMapFlatMap;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class Customer {
    private int id;
    private String name;
    private String email;
    private List<String> phoneNumbers;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}' + "\n";
    }
}
