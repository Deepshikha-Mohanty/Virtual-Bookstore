package projects.virtualbookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projects.virtualbookstore.model.Address;
import projects.virtualbookstore.services.addressService;

import java.util.ArrayList;
@RestController
@RequestMapping("/api")
public class addressController {

    @Autowired
    private addressService s;

    @GetMapping("/address/{user}")
    public ArrayList<Address> getaddress() {
        return s.getAddress();
    }

    @PostMapping("/address/save")
    public String saveAddress(@RequestBody Address a)
    {
        s.saveAddress(a);
        return "Saved";
    }

    @PutMapping("/address/update/{id}")
    public String updateAddress(@PathVariable int id,@RequestBody Address a)
    {
        s.updateAddress(id,a);
        return "Updated";
    }

    @DeleteMapping("/address/{id}")
    public String removeAddress(@PathVariable int id)
    {
        s.removeAddress(id);
        return "Deleted";
    }
}
