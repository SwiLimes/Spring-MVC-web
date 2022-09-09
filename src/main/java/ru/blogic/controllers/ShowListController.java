package ru.blogic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class ShowListController {

    @RequestMapping("showlist")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("currentList", Arrays.asList("Kia", "Ford", "Audi", "Bmw", "<script>alert(100500)</script>"));
        return modelAndView;
    }
}
