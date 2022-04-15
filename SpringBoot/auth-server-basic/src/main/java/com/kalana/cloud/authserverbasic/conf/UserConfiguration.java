package com.kalana.cloud.authserverbasic.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter {

    PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("kalana").password(passwordEncoder.encode("1234@123")).roles("USER","ADMIN").authorities("CAN_READ","CAN_WRITE","CAN_READ_WRITE").and()
        .withUser("pasindu").password(passwordEncoder.encode("345@123")).roles("USER").authorities("CAN_READ");
    }
}
