package projects.virtualbookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projects.virtualbookstore.model.User;
@Repository
public interface userRepo extends JpaRepository<User,Integer> {
}
