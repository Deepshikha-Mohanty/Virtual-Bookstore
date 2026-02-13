package projects.virtualbookstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projects.virtualbookstore.model.User;
import projects.virtualbookstore.repositories.userRepo;

import java.util.Optional;
@Service
public class userService {

    @Autowired
    private userRepo r;
    public void saveuser(User u) {
        r.save(u);
    }

    public void updateuser(int id, User u) {
        /*Optional<User> newa=r.findById(id);
        newa.setUser_name(u.getUser_name());
        newa.setPassword(u.getPassword());
        r.save(newa);*/
    }

    public void removeuser(int id) {
        r.deleteById(id);
    }
}
