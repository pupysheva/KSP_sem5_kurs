package ru.mirea.IdentityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.util.List;

@Component
public class PersonDBConnection {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDBConnection(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //Получить корзину
    public Boolean checkUserInDB(String login, String password ) {
        Integer i = -1;
        i = jdbcTemplate.queryForObject("select id from User where login = ? AND password =?", new Object[]{login,password}, Integer.class);
        if(i==-1) return false;
        else return true;
        }
}
