package mc.web;

import mc.entity.User;
import mc.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class HomeController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/getAllUsers")
    public List<User> getUsers(){
        List<User> users = userRepository.findAll();
        return users;
    }

    @RequestMapping("/create")
    @ResponseBody
    public String create(String name, String surname) {
        String userId = "";
        try {
            User user = new User(name, surname);
            userRepository.save(user);
            userId = String.valueOf(user.getId());
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created with Id " + userId;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(int id) {
        try {
            User user = new User(id);
            userRepository.delete(user);
        }
        catch (Exception ex) {
            return "Error deleting the user:" + ex.toString();
        }
        return "User succesfully deleted !";
    }

    @RequestMapping("/getBySurname")
    @ResponseBody
    public String getBySurname(String surname) {
        String userId = "";
        try {
            User user = userRepository.findBySurname(surname);
            userId = String.valueOf(user.getId());
        }
        catch (Exception ex) {
            return "User not found with this Id";
        }
        return "User Id with surname "+surname+" is: " + userId;
    }

    @RequestMapping("/update")
    @ResponseBody
    public String updateUser(int id, String name, String surname) {
        try {
            User user = userRepository.findOne(id);
            user.setName(name);
            user.setSurname(surname);
            userRepository.save(user);
        }
        catch (Exception ex) {
            return "Error updating the user: " + ex.toString();
        }
        return "User succesfully updated !";
    }

}
