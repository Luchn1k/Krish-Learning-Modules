package com.kalana.cloud.configconsumer.controller;


import com.kalana.cloud.configconsumer.model.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Autowired
    MemberProfileConfiguration memberProfileConfiguration;

    @RequestMapping(value = "/profile",method = RequestMethod.GET)
    public MemberProfileConfiguration getConfig(){
        return memberProfileConfiguration;
    }
}
