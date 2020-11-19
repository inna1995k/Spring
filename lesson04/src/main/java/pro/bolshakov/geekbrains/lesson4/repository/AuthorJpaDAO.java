package pro.bolshakov.geekbrains.lesson4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.bolshakov.geekbrains.lesson4.domain.Author;

public interface AuthorJpaDAO extends JpaRepository<Author, Long> {
}
