package by.itacademy.gpisarev.spring.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Type implements Printable {
    private int id;
    private String name;

    public Type(int id) {
        this.id = id;
    }
}
