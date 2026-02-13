package projects.virtualbookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projects.virtualbookstore.model.Address;
import projects.virtualbookstore.model.Book;
import projects.virtualbookstore.services.bookService;

import java.util.ArrayList;
@RestController
@RequestMapping("/api")
public class bookController {

    @Autowired
    private bookService s;

    @GetMapping("/book")
    public ArrayList<Book> getbook() {
        return s.getbook();
    }

    @GetMapping("/book/{genre}")
    public ArrayList<Book> getbookbygenre(@PathVariable String genre) {
        return s.getbookbygenre(genre);
    }

    @GetMapping("/book/{author}")
    public ArrayList<Book> getbookbyauthor(@PathVariable String author) {
        return s.getbookbyauthor(author);
    }

    @GetMapping("/book/{price}")
    public ArrayList<Book> getbookbyprice(@PathVariable double price) {
        return s.getbookbyprice(price);
    }

    @GetMapping("/book/{name}")
    public Book getbookbyname(@PathVariable String name) {
        return s.getbookbyname(name);
    }

    @PostMapping("/book/save")
    public String savebook(@RequestBody Book b)
    {
        s.savebook(b);
        return "Saved";
    }

    @PutMapping("/book/update/{id}")
    public String updateBook(@PathVariable int id, @RequestBody Book b)
    {
        s.updatebook(id,b);
        return "Updated";
    }

    @DeleteMapping("/book/{id}")
    public String removebook(@PathVariable int id)
    {
        s.removebook(id);
        return "Deleted";
    }
}
