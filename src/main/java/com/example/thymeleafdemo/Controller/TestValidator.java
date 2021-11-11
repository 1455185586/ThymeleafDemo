package com.example.thymeleafdemo.Controller;


import com.example.thymeleafdemo.pojo.YanZhenPojo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class TestValidator {
    @GetMapping("/test")
    public String showForm(YanZhenPojo yanZhenPojo){
        return "form";
    }
    @GetMapping("/results")
    public String results(){
        return "results";
    }
    @PostMapping("/test")
    public String checkUser(@Valid YanZhenPojo yanZhenPojo, BindingResult bindingResult, RedirectAttributes attr){
        if(bindingResult.hasErrors()){
            return "form";
        }
        attr.addFlashAttribute("yanZhenPojo",yanZhenPojo);
        return "redirect:/results";
    }
}
