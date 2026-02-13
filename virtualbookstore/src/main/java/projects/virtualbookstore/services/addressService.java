package projects.virtualbookstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projects.virtualbookstore.model.Address;
import projects.virtualbookstore.repositories.addressRepo;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class addressService {

    @Autowired
    private addressRepo r;
    public ArrayList<Address> getAddress() {
        ArrayList<Address> a= (ArrayList<Address>) r.findAll();
        return a;
    }

    public void saveAddress(Address a) {
        r.save(a);
    }

    public void updateAddress(int id,Address a) {
        /*Optional<Address> newa=r.findById(id);
        newa.setAddress(a.getAddress());
        r.save(newa);*/
    }

    public void removeAddress(int id) {
        r.deleteById(id);
    }
}
