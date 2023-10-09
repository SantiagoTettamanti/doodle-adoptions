package santiagotettamanti.com.doodleadoptions.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping ("/user")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping ("/user/{id}")
    public User getUserById(@RequestBody User user, @PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @PostMapping ("/user")
    public User createUser(User user) {
        return userService.createUser(user);
    }

    @DeleteMapping ("/user/{id}")
    public User deleteById(@RequestBody User user, @PathVariable Integer id) {
        return userService.deleteUserById(id);
    }

}
