package ru.dzhioev.databaselessons.service;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
    @Transactional
    public List<Article> findAllArticles() {
        List<Article> articles = articleRepository.findAll();
        articles.forEach(article -> Hibernate.initialize(article.getAuthors()));
        return articles;
    }

    @Override
    @Transactional
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }
}
