package it.conispesemediche.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;
 
 
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider
{
       
        public Authentication authenticate(Authentication authentication) throws AuthenticationException
        {
                String userName = authentication.getName();
                String password = authentication.getCredentials().toString();
 
                if (authorizedUser(userName, password))
                {
                        List<GrantedAuthority> grantedAuths = new ArrayList<>();
                        grantedAuths.add(()-> {return "AUTH_USER";});
                        Authentication auth = new UsernamePasswordAuthenticationToken(userName, password, grantedAuths);
                        System.out.println(auth.getAuthorities());
                        return auth;
                }
                else
                {
                        throw new AuthenticationCredentialsNotFoundException("Invalid Credentials!");
                }
        }
 
        private boolean authorizedUser(String userName, String password)
        {
        	/*
                System.out.println("username is :" + userName+" and password is "+password );
                if("conispesemediche".equals(userName) && "Coni3.servizi".equals(password))
                        return true;
                return false;
                */
        	return true;
        }
 
        public boolean supports(Class<?> authentication)
        {
                return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
        }
}
