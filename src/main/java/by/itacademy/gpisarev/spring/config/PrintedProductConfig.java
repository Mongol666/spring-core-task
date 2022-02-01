package by.itacademy.gpisarev.spring.config;

import by.itacademy.gpisarev.spring.models.Author;
import by.itacademy.gpisarev.spring.models.PrintedProduct;
import by.itacademy.gpisarev.spring.models.Type;
import by.itacademy.gpisarev.spring.qualifiers.string.TypeStringQualifier;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({TypeConfig.class, AuthorConfig.class})
public class PrintedProductConfig {

    @Bean("secondLermontovBook")
    public PrintedProduct secondLermontovBook(@Qualifier(value = "lermontovQualifier")Author author,
                                              @TypeStringQualifier(name = "book-qualifier") Type type) {
        return new PrintedProduct(2, "Second Lermontov Book", author, type);
    }
}
