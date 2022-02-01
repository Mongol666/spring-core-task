package by.itacademy.gpisarev.spring.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Type implements Printable {
    private int id;
    private String name;

    public Type(int id) {
        this.id = id;
    }
}
