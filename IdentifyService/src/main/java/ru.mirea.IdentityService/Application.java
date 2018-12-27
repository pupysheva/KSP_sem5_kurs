package ru.mirea.IdentityService;

import com.sun.javafx.geom.transform.Identity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.mirea.IdentityService.IdentityDB;

@SpringBootApplication
public class Application {
    public static void main(String[] arg){
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);//Создали приложение
        context.getBean(IdentityDB.class).init();
    }
}
