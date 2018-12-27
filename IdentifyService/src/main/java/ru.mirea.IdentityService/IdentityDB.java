package ru.mirea.IdentityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class IdentityDB{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    IdentityDB(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    void init(){
        // init db инициализация базы данных пользователей
        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS User(id int PRIMARY KEY,login VARCHAR not null ,password VARCHAR not null , role VARCHAR not null )");
        jdbcTemplate.execute("INSERT INTO User (id, login, password, role) VALUES (1, 'pupysheva','1234','USER'),(2, 'admin', '4321','ADMIN')");

    }
}