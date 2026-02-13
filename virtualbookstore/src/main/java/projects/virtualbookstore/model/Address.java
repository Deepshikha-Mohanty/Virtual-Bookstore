package projects.virtualbookstore.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int address_id;
    String address;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
