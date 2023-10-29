package edu.user.mgmt.controller;

import edu.user.mgmt.entity.User;
import edu.user.mgmt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UsersService usersService;

    @GetMapping("/")
    public ModelAndView getAllUsers() {
        ModelAndView mav = new ModelAndView("index");
        List<User> usersList = usersService.getAll();
        mav.addObject("users", usersList);
        return mav;
    }

    @GetMapping("/add-user")
    public ModelAndView addUser() {
        ModelAndView mav = new ModelAndView("add_user");
        mav.addObject("command", new User());
        return mav;
    }

    @PostMapping("/save-user")
    public String saveUser(@ModelAttribute User user) {
        usersService.save(user);
        return "redirect:/";
    }

    @GetMapping("/user-update/{id}")
    public ModelAndView getUserById(@PathVariable("id") Long userId) {
        ModelAndView mav = new ModelAndView("add_user");
        User user = usersService.getById(userId);
        mav.addObject("command", user);
        return mav;
    }

    @GetMapping("/user-delete/{id}")
    public String deleteStaff(@PathVariable("id") Long userId) {
        User deleteUser = usersService.getById(userId);
        usersService.delete(deleteUser);
        return "redirect:/";
    }
}
