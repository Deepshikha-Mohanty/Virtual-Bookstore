package projects.virtualbookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projects.virtualbookstore.model.Address;
import projects.virtualbookstore.model.Cart;
import projects.virtualbookstore.services.cartService;

import java.util.ArrayList;
@RestController
@RequestMapping("/api")
public class cartController {

    @Autowired
    private cartService s;


    @GetMapping("/cart/{user}")
    public ArrayList<Cart> getcart() {
        return s.getcart();
    }

    @PostMapping("/cart/save")
    public String savecart(@RequestBody Cart c)
    {
        s.savecart(c);
        return "Saved";
    }

    @PutMapping("/cart/update/{id}")
    public String updatecart(@PathVariable int id, @RequestBody Cart c)
    {
        s.updatecart(id,c);
        return "Updated";
    }

    @DeleteMapping("/cart/{id}")
    public String removecart(@PathVariable int id)
    {
        s.removecart(id);
        return "Deleted";
    }
}
