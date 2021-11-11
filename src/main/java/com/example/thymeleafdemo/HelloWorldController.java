package com.example.thymeleafdemo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {
    @RequestMapping("/helloworld")
    public String helloworld(Model model) throws Exception{
        model.addAttribute("mav","这是今天的第一个mvc结构程序");
        return "he1";
    }
}
