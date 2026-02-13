package projects.virtualbookstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projects.virtualbookstore.model.Book;
import projects.virtualbookstore.repositories.bookRepo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;
@Service
public class bookService {

    @Autowired
    private bookRepo r;

    public ArrayList<Book> getbook() {
        return (ArrayList<Book>) r.findAll();
    }

    public void savebook(Book b) {
        r.save(b);
    }

    public void updatebook(int id, Book b) {
       /*Optional<Book> newbook=r.findById(id);
        newbook.setBook_name(b.getBook_name());
        newbook.setGenre(b.getGenre());
        newbook.setAuthor(b.getAuthor());
        newbook.setPrice(b.getPrice());
        newbook.setQty(b.getQty());
        r.save(newbook);*/
    }

    public void removebook(int id) {
        r.deleteById(id);
    }

    public ArrayList<Book> getbookbyprice(double price) {
        return r.getbookByPrice(price);
    }

    public ArrayList<Book> getbookbygenre(String genre) {
        return r.getbookByGenre(genre);
    }

    public ArrayList<Book> getbookbyauthor(String author) {
        return r.getbookByAuthor(author);
    }

    public Book getbookbyname(String name) {
        return r.getbookByName(name);
    }
}
