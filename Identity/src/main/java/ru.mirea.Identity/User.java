package ru.mirea.Identity;

import java.util.List;

public class User {
    private int id;
    private String login;
    private String password;
    private List<Role> role;

    public User() {}

    public User(int id, String login, String password, List<Role> role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public List<Role> getRole() {
        return role;
    }

    /**
     * Получение пароля в том виде, в котором хранится в базе данных.
     * @return пароль из БД.
     */
    public String getPassword() {
        return password;
    }
}
