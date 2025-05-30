package ru.dzhioev.databaselessons.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.dzhioev.databaselessons.model.Article;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    //Расскоментировать что бы исправить через FETCH
//    @Query("SELECT DISTINCT a FROM Article a JOIN FETCH a.authors")
//    List<Article> findAll();

    //Расскоментировать что бы исправить через EntityGraph
//    @EntityGraph(attributePaths = {"authors"})
//    List<Article> findAll();

}
