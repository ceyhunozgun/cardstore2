package com.cardstore.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
 
	@Value("${public-ipv4:N/A}")
    private String publicIp;
	
    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("publicIp", publicIp);
        model.put("appVersion", "V1");
        
        return "index";
    }

}
