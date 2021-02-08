package com.muradov.deadpool.config;

import com.muradov.deadpool.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable().authorizeRequests().antMatchers(HttpMethod.GET,"/api/**").
                hasAnyRole( Role.ADMIN.name(),Role.USER.name()).and().formLogin();
        http.csrf().disable().authorizeRequests().antMatchers("/api**")
                .hasAnyRole(Role.ADMIN.name()).and().formLogin();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication().withUser("sean").password("{noop}pass@123").roles(Role.USER.name());
        auth.inMemoryAuthentication().withUser("martin").password("{noop}pass@123").roles(Role.USER.name(),
                Role.ADMIN.name());
    }

//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder(12);
//    }
}
