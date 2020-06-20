package src.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import src.annotation.TestObject;

@Repository("userRepository") //持久化层 指定value值
public class UserRepositoryImp implements UserRepository {
    @Autowired(required = false)
    private TestObject testObject;

    @Override
    public void save() {
        System.out.println("UserRepository save()...");
        System.out.println(testObject);
    }
}
