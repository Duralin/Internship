package Roma.TestApp.controller;

import Roma.TestApp.domain.Role;
import Roma.TestApp.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Collections;

public class RegistrationController {
    private UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String registration() {
        return "/registration";
    }

    @PutMapping
    public String addUser(Roma.TestApp.domain.User user) {
        User userFromDb = userService.findByUsername(user.getUsername());

        if (userFromDb != null) {
            return "registration";
        }

        user.setActice(true);
        user.setRoles(Collections.singleton(Role.USER));
        userService.save((User) user);

        return "redirect:/home";
    }
}
