package Najder.Spring.firstSpringFramework.Spring5webApp.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lasName;

    @ManyToMany
    private Set<Book> books = new HashSet<>();

    public Author() {
    }

    public Author(String firstname, String lasName) {
        this.firstname = firstname;
        this.lasName = lasName;
    }

    public Author(String firstname, String lasName, Set<Book> books) {
        this.firstname = firstname;
        this.lasName = lasName;
        this.books = books;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
