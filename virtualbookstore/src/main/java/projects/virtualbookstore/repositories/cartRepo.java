package projects.virtualbookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projects.virtualbookstore.model.Cart;
@Repository
public interface cartRepo extends JpaRepository<Cart,Integer> {
}
