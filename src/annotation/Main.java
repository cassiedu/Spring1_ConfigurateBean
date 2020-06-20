package src.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import src.annotation.controller.UserController;
import src.annotation.repository.UserRepositoryImp;
import src.annotation.service.UserService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("src/beans-annotation.xml");
//        TestObject to = (TestObject) ctx.getBean("testObject");
//        System.out.println(to);
        UserController userController = (UserController) ctx.getBean("userController");
        System.out.println(userController);
        userController.execute();
//        UserService userService = (UserService) ctx.getBean("userService");
//        System.out.println(userService);
/*        UserRepositoryImp userRepositoryImp = (UserRepositoryImp) ctx.getBean("userRepository");
        System.out.println(userRepositoryImp);*/
    }
}
