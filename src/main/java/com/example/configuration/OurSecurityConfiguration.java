package com.example.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class OurSecurityConfiguration extends WebSecurityConfigurerAdapter{
	  
	
	 @Override
	protected UserDetailsService userDetailsService() {
		 
    UserDetails user1= 
    	User.builder().username("one").password("{noop}one") .roles("USER").build();
    
    UserDetails user2= 
         User.builder().username("one").password("{noop}one") .roles("USER").build();
    		
    UserDetails user3= 
          User.builder().username("one").password("{noop}one") .roles("USER").build();
		
		 
	 return new InMemoryUserDetailsManager(user1,user2,user3);
	}
}


