package net.enjoy.springboot.premierleague.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.enjoy.springboot.premierleague.dto.UserDto;

@Controller
public class ViewController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "register";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }



    @GetMapping("/forgot-password")
    public String forgotPwd() {
        return "forgot-password";
    }

    @GetMapping("/reset-password")
    public String resetPwd(@RequestParam("email") String email, Model model) {
        if(email==null){
            return "redirect:/dashboard";
        }
        model.addAttribute("email", email);
        return "reset-password";
    }

    @GetMapping("/inventory")
    public String showInventory() {
        return "inventory";  // Returns inventory.html
    }

    @GetMapping("/orders")
    public String showOrders() {
        return "orders";  // Returns orders.html
    }
}
