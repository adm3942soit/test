package io.fourfinanceit.homework.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
//@EnableWebMvcSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").permitAll().and()
                .authorizeRequests().antMatchers("/console/**").permitAll();

        http.csrf().disable();
        http.headers().frameOptions().disable();
      /*  http
            .authorizeRequests()
                .antMatchers("/", "/home", "/index").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .authorizeRequests().antMatchers("/index").permitAll()
                .anyRequest().authenticated()
                .and()
                .authorizeRequests().antMatchers("/userform").permitAll()
                .anyRequest().authenticated()
                .and()
            .authorizeRequests().antMatchers("/users").permitAll()
                .anyRequest().authenticated()
                .and()
            .authorizeRequests().antMatchers("/usershow").permitAll()
                .anyRequest().authenticated()
                .and()
                .authorizeRequests().antMatchers("/console").permitAll()
                .anyRequest().authenticated()
                .and()
            .logout()
                .permitAll();*/
    }

    /*@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");
    }

   */
}