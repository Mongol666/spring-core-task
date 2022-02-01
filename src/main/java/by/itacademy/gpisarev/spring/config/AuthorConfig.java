package by.itacademy.gpisarev.spring.config;

import by.itacademy.gpisarev.spring.models.Author;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthorConfig {

    @Bean
    @Qualifier(value = "pushkinQualifier")
    public Author pushkin() {
        Author pushkin = new Author();
        pushkin.setId(1);
        pushkin.setFirstName("Александр");
        pushkin.setLastName("Пушкин");
        pushkin.setPatronymic("Сергеевич");
        return pushkin;
    }

    @Bean
    @Qualifier(value = "lermontovQualifier")
    public Author lermontov() {
        return new Author(2, "Михаил", "Лермонтов", "Юрьевич");
    }
}
