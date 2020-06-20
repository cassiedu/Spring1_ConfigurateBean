package src.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import src.annotation.repository.UserRepository;
import src.annotation.repository.UserRepositoryImp;

@Service //服务层
public class UserService {
    @Autowired
    private UserRepository userRepository;

//    @Qualifier("UserRepositoryImp")
//    如果存在类型相同的bean，两种方法1.@Qualifier("UserRepositoryImp") 2.@Repository ("userRepository")
//
//    public void setUserRepository(UserRepository userRepository){
//        this.userRepository = userRepository;
//    }

    public void add() {
        System.out.println("UserService add()...");
        userRepository.save();
    }

}
