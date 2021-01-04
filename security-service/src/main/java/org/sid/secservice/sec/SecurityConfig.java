package org.sid.secservice.sec;

import org.sid.secservice.sec.filters.JwtAuthentificationFilter;
import org.sid.secservice.sec.filters.JwtAuthorizationFilter;
import org.sid.secservice.sec.service.UserDetailsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private UserDetailsServiceImpl userDetailsService;
    public SecurityConfig(UserDetailsServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.csrf().disable();
       http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
       http.headers().frameOptions().disable();
       //http.formLogin();
       http.authorizeRequests().antMatchers("/h2-console/**","/refreshToken/**","/login/**").permitAll();
        http.authorizeRequests().anyRequest().authenticated();
        http.authorizeRequests().anyRequest().permitAll();
        http.authorizeRequests().antMatchers(HttpMethod.POST,"/users/**").hasAnyAuthority("ADMIN");
        http.authorizeRequests().antMatchers(HttpMethod.GET,"/users/**").hasAnyAuthority("USER");

      http.addFilter(new JwtAuthentificationFilter(authenticationManagerBean()));
       http.addFilterBefore(new JwtAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
    }
/*
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

 */
}
