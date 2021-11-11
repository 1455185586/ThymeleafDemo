package com.example.thymeleafdemo.Controller;

import com.example.thymeleafdemo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCDemoController {
    @GetMapping("mvcdemo")
    public ModelAndView hello(){
        User user =new User();
        user.setName("lixingzhen");
        user.setAge(22);
        ModelAndView modelAndView =new ModelAndView("mvcdemo");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
