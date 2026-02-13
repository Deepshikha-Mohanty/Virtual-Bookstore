package projects.virtualbookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import projects.virtualbookstore.model.Book;

import java.util.ArrayList;
@Repository
public interface bookRepo extends JpaRepository<Book,Integer> {

    @Query("SELECT b FROM Book b WHERE b.genre= :genre")
    ArrayList<Book> getbookByGenre(String genre);

    @Query("SELECT b FROM Book b WHERE b.author= :author")
    ArrayList<Book> getbookByAuthor(String author);

    @Query("SELECT b FROM Book b WHERE b.book_name= :name")
    Book getbookByName(String name);

    @Query("SELECT b FROM Book b WHERE b.price= :price")
    ArrayList<Book> getbookByPrice(double price);
}
