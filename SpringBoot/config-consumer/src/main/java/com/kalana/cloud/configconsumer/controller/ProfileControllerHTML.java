package com.kalana.cloud.configconsumer.controller;

import com.kalana.cloud.configconsumer.model.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProfileControllerHTML {
    @Autowired
    MemberProfileConfiguration memberProfileConfiguration;

    @RequestMapping(value = "/profile",method = RequestMethod.GET)
    public String getConfig(Model model){
    model.addAttribute("model",memberProfileConfiguration.getDefaultModel());
    model.addAttribute("min",memberProfileConfiguration.getMinRentPeriod());
    return "mprofile";
    }
}
