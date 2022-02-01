package by.itacademy.gpisarev.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({TypeConfig.class, AuthorConfig.class})
public class PrintedProductConfig {
}
