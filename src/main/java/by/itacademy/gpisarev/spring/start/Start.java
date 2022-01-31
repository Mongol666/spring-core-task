package by.itacademy.gpisarev.spring.start;

import by.itacademy.gpisarev.spring.models.Author;
import by.itacademy.gpisarev.spring.models.PrintedProduct;
import by.itacademy.gpisarev.spring.models.Type;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Author pushkin = context.getBean("pushkin", Author.class);
        //System.out.println(pushkin);
        //Author lermontov = context.getBean("lermontov", Author.class);
        //System.out.println(lermontov);

        //Type book = context.getBean("book", Type.class);
        //book.print()
        //Type magazine = context.getBean("magazine", Type.class);
        //magazine.print()
        //Type diary = context.getBean("diary", Type.class);
        //diary.print()

        PrintedProduct firstPushkinBook = context.getBean("firstPushkinAndLermontovBook", PrintedProduct.class);
        firstPushkinBook.print();
    }
}
