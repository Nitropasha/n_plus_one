package ru.dzhioev.databaselessons.service;

import ru.dzhioev.databaselessons.model.Article;
import ru.dzhioev.databaselessons.model.Author;

import java.util.List;

public interface ArticleService {
    List<Article> findAllArticles();
    List<Author> findAllAuthors();
}
