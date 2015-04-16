package com.photobook.configuration;


import com.photobook.security.AppUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{

	@Autowired
	private AppUserDetailsService customUserDetailsService;

	@Override
    protected void configure(AuthenticationManagerBuilder registry) throws Exception {
		registry.userDetailsService(customUserDetailsService);
    }

	@Override
	public void configure(WebSecurity web) throws Exception {
	  web
	    .ignoring()
	       .antMatchers("/images/**","/js/**","/styles/**","/templates/**"); // #3
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	  http
	  .csrf().disable()
	  .authorizeRequests()
          .antMatchers("/images/**", "/js/**","/styles/**","/templates/**").permitAll()
	      .antMatchers("/**").permitAll() // #4
	      .antMatchers("/protected/**").hasRole("USER_ROLE") // #6
	      .anyRequest().authenticated() // 7
              .and()
	  .formLogin()  // #8
	      .loginPage("/login/form") // #9
	      .loginProcessingUrl("/login")
	      .permitAll(); // #5
	}
}
