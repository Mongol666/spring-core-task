package by.itacademy.gpisarev.spring.start;

import by.itacademy.gpisarev.spring.models.Author;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Author pushkin = context.getBean("pushkin", Author.class);
        System.out.println(pushkin);

        Author lermontov = context.getBean("lermontov", Author.class);
        System.out.println(lermontov);
    }
}
