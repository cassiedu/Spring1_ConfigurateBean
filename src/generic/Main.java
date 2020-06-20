package src.generic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import src.annotation.controller.UserController;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("src/beans-generic.xml");

        UserService userService = (UserService) ctx.getBean("userService");
        userService.add();
    }
}
