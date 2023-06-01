package com.academy.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {

        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        return daoAuthenticationProvider;
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
//                .cors().disable()
//                .csrf().disable()
                .formLogin()
                //.loginPage("/login.html")
                //.loginPage("/login.html")

                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/main_page", true)
                .and()
                .authorizeRequests()
//                .loginProcessingUrl("/login")
//                .defaultSuccessUrl("/index.jsp", true)
//                .failureUrl("/login.html?error=true")
               // .failureHandler(authenticationFailureHandler())
//                .and()
//                .authorizeRequests()
//                .defaultSuccessUrl("/main_page", true)
                .antMatchers(HttpMethod.GET, "/main_page","/orders","/service","/cars_orders/polo",
                        "/cars_orders/skoda","/cars_orders/kia", "/cars_orders/gelly_atlas","/cars_orders/gelly_tugella").hasRole("USER")
                .antMatchers(HttpMethod.GET, "admin/**","/cars_orders/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "/","/registration").anonymous();
    }
}
