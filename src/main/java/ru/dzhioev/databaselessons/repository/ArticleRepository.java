package ru.dzhioev.databaselessons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.dzhioev.databaselessons.model.Article;

import java.util.List;

@Repository

public interface ArticleRepository extends JpaRepository<Article, Long> {
    @Query("SELECT a FROM Article a JOIN FETCH a.authors")
    List<Article> findAllArticles();


}
