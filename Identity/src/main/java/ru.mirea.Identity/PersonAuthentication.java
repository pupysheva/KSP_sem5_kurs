package ru.mirea.Identity;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class PersonAuthentication implements Authentication, AuthenticationManager {
    private User user;
    private boolean isAuthenticated;

    public PersonAuthentication(User user, boolean isAuthenticated) {
        this.user = user;
        this.isAuthenticated = isAuthenticated;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return user.getRole();
    }

    @Override
    public Object getCredentials() {
        return user.getPassword();
    }

    @Override
    public Object getDetails() {
        return user;
    }

    @Override
    public Object getPrincipal() {
        return user;
    }

    @Override
    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
        this.isAuthenticated = isAuthenticated;
    }

    @Override
    public String getName() {
        return user.getLogin();
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        authentication.getCredentials() == BD
    }
}
