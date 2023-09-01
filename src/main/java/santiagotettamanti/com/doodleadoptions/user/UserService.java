package santiagotettamanti.com.doodleadoptions.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import santiagotettamanti.com.doodleadoptions.shelter.ShelterRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer id) {
        Optional<User> userFound = userRepository.findById(id);
        if (userFound.isPresent()) {
            return userFound.get();
        } else {
            return null;
        }
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
