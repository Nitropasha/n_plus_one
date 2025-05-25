package ru.dzhioev.databaselessons.service;

import org.springframework.stereotype.Service;
import ru.dzhioev.databaselessons.model.Article;
import ru.dzhioev.databaselessons.model.Author;
import ru.dzhioev.databaselessons.repository.ArticleRepository;
import ru.dzhioev.databaselessons.repository.AuthorRepository;

import java.util.List;


@Service
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;
    private final AuthorRepository authorRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository, AuthorRepository authorRepository) {
        this.articleRepository = articleRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Article> findAllArticles() {
        return articleRepository.findAllArticles();
    }

    @Override
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }
}
