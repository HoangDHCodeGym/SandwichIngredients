package com.codegym.Controller;

import com.codegym.Model.Sandwich;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/")
public class UserController {
    @GetMapping
    public String goToHomePage(ModelMap model) {
//        ArrayList<Sandwich> sandwiches = new ArrayList<>();
//        sandwiches.add(new Sandwich("Lecctuce", "Lecttuce"));
//        sandwiches.add(new Sandwich("Tomato", "Tomato"));
//        sandwiches.add(new Sandwich("Mustards", "Mustards"));
//        sandwiches.add(new Sandwich("Sprouts", "Sprouts"));
        ArrayList<String> sandwiches = new ArrayList<>();
        sandwiches.add("Lecttuce");
        sandwiches.add("Tomato");
        sandwiches.add("Mustards");
        sandwiches.add("Sprouts");
        model.addAttribute("sandwiches", sandwiches);
        model.addAttribute("Sandwich", new Sandwich());
        return "index";
    }

    @PostMapping
    public ModelAndView sandwichesOrdered(@ModelAttribute("Sandwich") Sandwich sandwich) {
        System.out.println(sandwich.getIngredientName());
        return new ModelAndView("index", "orders", "orders");
    }
}
