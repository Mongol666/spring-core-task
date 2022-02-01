package by.itacademy.gpisarev.spring.models;

import by.itacademy.gpisarev.spring.qualifiers.simple.BookQualifier;
import by.itacademy.gpisarev.spring.qualifiers.string.TypeStringQualifier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@PropertySource(value = {"classpath:product.properties"})
public class PrintedProduct implements Printable {
    @Value("${product.id}")
    private int id;

    @Value("${product.name}")
    private String name;

    private Author author;

    @Autowired
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Map<String, Author> authors;

    @Value("${product.author}")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private String authorName;

    @Autowired
    @TypeStringQualifier(name = "book-qualifier")
    private Type type;

    public PrintedProduct(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public PrintedProduct(int id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @PostConstruct
    public void init() {
        author = authors.get(authorName);
        System.out.println("Печатный продукт '" + name + "' создан");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Печатный продукт '" + name + "' разрушен");
    }
}
