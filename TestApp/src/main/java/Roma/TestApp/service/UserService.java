package Roma.TestApp.service;

import Roma.TestApp.repository.UserRepo;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public User findByUsername(String username) {
        return this.userRepo.findByUsername(username);
    }
    public User save(User user) {
        return this.userRepo.save(user);
    }
}
