package projects.virtualbookstore.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int cart_no;
    String item_name;
    int item_qty;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
