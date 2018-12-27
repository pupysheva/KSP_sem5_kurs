package ru.mirea.CartService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] arg){
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);//Создали приложение
        context.getBean(CartDBService.class).init();
    }
}
