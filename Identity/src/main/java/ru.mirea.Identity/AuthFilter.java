package ru.mirea.Identity;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.Optional;

public class AuthFilter extends GenericFilterBean {

    private final PersonAuthentication personAuthentication;

    public AuthFilter(PersonAuthentication personAuthentication) {
        this.personAuthentication = personAuthentication;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Authentication auth = personAuthentication.getDetails();
        SecurityContextHolder.getContext().setAuthentication(new org.springframework.security.core.Authentication());
        Optional<?> asd;
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
