package ru.dzhioev.databaselessons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dzhioev.databaselessons.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
