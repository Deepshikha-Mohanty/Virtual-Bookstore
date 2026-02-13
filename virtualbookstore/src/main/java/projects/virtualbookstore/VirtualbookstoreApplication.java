package projects.virtualbookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import projects.virtualbookstore.model.Address;
import projects.virtualbookstore.model.Book;
import projects.virtualbookstore.model.Cart;
import projects.virtualbookstore.model.User;

@SpringBootApplication
public class VirtualbookstoreApplication {

	public static void main(String[] args) {

		SpringApplication.run(VirtualbookstoreApplication.class, args);

	}

}
