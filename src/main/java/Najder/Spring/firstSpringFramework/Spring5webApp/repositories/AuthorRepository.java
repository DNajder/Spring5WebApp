package Najder.Spring.firstSpringFramework.Spring5webApp.repositories;

import Najder.Spring.firstSpringFramework.Spring5webApp.Model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
