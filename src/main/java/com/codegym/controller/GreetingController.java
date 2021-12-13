package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class GreetingController {
    private ArrayList<String> eng = new ArrayList();
    private ArrayList<String> vn = new ArrayList();

    public GreetingController() {
        eng.add("hello");
        eng.add("dog");
        eng.add("cat");
        vn.add("xin chao");
        vn.add("cho");
        vn.add("meo");
    }

    public String translateToVN(String word){

        return "NOT FOUND";
    }
    @GetMapping("/")
    public String greeting( Model model) {
        return "index";
    }
    @GetMapping("/edit")
    public String showEditForm (Model model,@RequestParam String address){
        model.addAttribute("name","Ánh 2p " + address);
        return "edit";
    }
    @GetMapping("/sum")
    public String showSum (Model model, @RequestParam double a, @RequestParam double b){
        model.addAttribute("sum",a+b);
        return "sum";
    }
    @PostMapping("/multi")
    public String showMulti (Model model,@RequestParam double number1 ,@RequestParam double number2 ){
        model.addAttribute("multi",number1*number2);
        return "multi";
    }
    @GetMapping("/convert")
    public String convert(Model model){
        return "convert";
    }
    @PostMapping("/convert")
    public String convert1(Model model,@RequestParam double vnd){
        model.addAttribute("result",vnd*23000);
        return "convert";
    }
    @GetMapping("/trans")
    public String translate(Model model){
        return "trans";
    }
    @PostMapping("/trans")
    public String translate1(Model model,@RequestParam String word){
        return null;
    }
}