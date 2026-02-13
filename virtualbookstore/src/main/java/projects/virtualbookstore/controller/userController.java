package projects.virtualbookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projects.virtualbookstore.model.Address;
import projects.virtualbookstore.model.User;
import projects.virtualbookstore.services.userService;

@RestController
@RequestMapping("/api")
public class userController {

    @Autowired
    private userService s;

    @PostMapping("/user/save")
    public String saveuser(@RequestBody User u)
    {
        s.saveuser(u);
        return "Saved";
    }

    @PutMapping("/user/update/{id}")
    public String updateuser(@PathVariable int id, @RequestBody User u)
    {
        s.updateuser(id,u);
        return "Updated";
    }

    @DeleteMapping("/user/{id}")
    public String removeuser(@PathVariable int id)
    {
        s.removeuser(id);
        return "Deleted";
    }
}
