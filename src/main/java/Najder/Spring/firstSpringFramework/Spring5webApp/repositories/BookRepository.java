package Najder.Spring.firstSpringFramework.Spring5webApp.repositories;

import Najder.Spring.firstSpringFramework.Spring5webApp.Model.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {

}
