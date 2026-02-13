package projects.virtualbookstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projects.virtualbookstore.model.Address;
import projects.virtualbookstore.model.Cart;
import projects.virtualbookstore.repositories.cartRepo;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class cartService {

    @Autowired
    private cartRepo r;

    public ArrayList<Cart> getcart() {
        return (ArrayList<Cart>) r.findAll();
    }

    public void savecart(Cart c) {
        r.save(c);
    }

    public void updatecart(int id, Cart c) {
        /*Optional<Cart> newc=r.findById(id);
        newc.setItem_qty(c.getItem_qty());
        r.save(newc);*/
    }

    public void removecart(int id) {
        r.deleteById(id);
    }
}
