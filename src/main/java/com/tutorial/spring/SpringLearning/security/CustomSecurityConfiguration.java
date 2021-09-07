//package com.tutorial.spring.SpringLearning.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class CustomSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    // Authentication -  application level security
//    // this is for Authentication - i.e whether user is allowed to access application
//    // registering custom users and passwords with roles
//    // here we configured with teo different users - user and admin have access
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("user")
//                .password("pass")
//                .roles("USER")
//                .and()
//                .withUser("admin")
//                .password("admin")
//                .roles("ADMIN");
//    }
//
//    @Bean
//    public PasswordEncoder getPasswordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//    // this is for authorization
//    // Authorization - whether user is allowed to access a service(i.e. API)
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.authorizeRequests()
//                .antMatchers("/sample/greetingwithname")
//                .hasRole("ADMIN")
//                .antMatchers("/sample/welcome")
//                .hasRole("USER")
//                .antMatchers("/").permitAll()
//                .and().formLogin();
//
//
//    }
//}
