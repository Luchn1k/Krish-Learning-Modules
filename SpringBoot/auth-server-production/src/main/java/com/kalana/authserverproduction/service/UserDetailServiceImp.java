package com.kalana.authserverproduction.service;

import com.kalana.authserverproduction.model.AuthUserDetail;
import com.kalana.authserverproduction.model.User;
import com.kalana.authserverproduction.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailServiceImp implements UserDetailsService {

    @Autowired
    UserDetailRepository userDetailRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> byUserName = userDetailRepository.findByUsername(s);
        byUserName.orElseThrow(()->new UsernameNotFoundException("Invalid"));
        UserDetails userDetails = new AuthUserDetail(byUserName.get());
        new AccountStatusUserDetailsChecker().check(userDetails);
        return userDetails;
    }
}
