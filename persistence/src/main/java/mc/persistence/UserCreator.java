package mc.persistence;

import mc.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserCreator implements CommandLineRunner{

    private UserRepository userRepository;

    public UserCreator(UserRepository userRepository){

        this.userRepository = userRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        User firstUser = new User("Michael", "Ross");
        User secondUser = new User("Paul", "Hopson");
        User thirdUser = new User("Gina", "Regan");

        List<User> users = new ArrayList<User>();
        users.add(firstUser);
        users.add(secondUser);
        users.add(thirdUser);

        this.userRepository.save(users);
    }
}
