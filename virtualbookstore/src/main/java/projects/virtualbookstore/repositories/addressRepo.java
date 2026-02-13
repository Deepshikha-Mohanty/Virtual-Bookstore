package projects.virtualbookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projects.virtualbookstore.model.Address;
@Repository
public interface addressRepo extends JpaRepository<Address,Integer> {
}
