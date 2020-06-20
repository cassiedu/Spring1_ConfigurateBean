package src.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import src.annotation.service.UserService;

@Controller //表现层
public class UserController {
    @Autowired
    private UserService userService;

    public void execute() {
        System.out.println("UserController execute()...");
        userService.add();
    }
}
