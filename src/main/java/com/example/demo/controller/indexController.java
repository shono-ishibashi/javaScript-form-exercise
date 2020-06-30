package com.example.demo.controller;

import com.example.demo.form.AccountForm;
import com.example.demo.form.ParentForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class indexController {

    @ModelAttribute
    public ParentForm setupParent(){
        return new ParentForm();
    }

    @ModelAttribute
    public AccountForm setupAccount(){
        return new AccountForm();
    }

    @RequestMapping("")
    public String index(){
        return "index";
    }

    @RequestMapping("/get-info")
    public String getInfo(ParentForm form){
        System.out.println("----------------------------");

        form.getAccountList().forEach(System.out::println);

        return "index";

    }
}
