package ru.dzhioev.databaselessons.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dzhioev.databaselessons.model.Article;
import ru.dzhioev.databaselessons.model.Author;
import ru.dzhioev.databaselessons.repository.ArticleRepository;
import ru.dzhioev.databaselessons.repository.AuthorRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;
    private final AuthorRepository authorRepository;

    @Override
    @Transactional
    public List<Article> findAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    @Transactional
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }
}
