package by.itacademy.gpisarev.spring.config;

import by.itacademy.gpisarev.spring.models.Type;
import by.itacademy.gpisarev.spring.qualifiers.string.TypeStringQualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = {"classpath:type.properties"})
@Configuration
public class TypeConfig {

    @Value("${book.id}")
    private int bookTypeID;

    @Value("${book.name}")
    private String bookTypeName;

    @Bean
    @TypeStringQualifier(name = "book-qualifier")
    public Type book() {
        return new Type(bookTypeID, bookTypeName);
    }

    @Value("${magazine.id}")
    private int magazineTypeID;

    @Value("${magazine.name}")
    private String magazineTypeName;

    @Bean
    @TypeStringQualifier(name = "magazine-qualifier")
    public Type magazine() {
        Type magazine = new Type();
        magazine.setId(magazineTypeID);
        magazine.setName(magazineTypeName);
        return magazine;
    }

    @Bean
    @TypeStringQualifier(name = "diary-qualifier")
    public Type diary(@Value("${diary.id}") int diaryTypeID,
                      @Value("${diary.name}") String diaryTypeName) {
        return new Type(diaryTypeID, diaryTypeName);
    }

}
