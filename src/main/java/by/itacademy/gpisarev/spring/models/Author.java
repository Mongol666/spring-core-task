package by.itacademy.gpisarev.spring.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Author implements Printable {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
}
