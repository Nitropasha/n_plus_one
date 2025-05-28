package ru.dzhioev.databaselessons.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dzhioev.databaselessons.dto.ArticleDto;
import ru.dzhioev.databaselessons.mapper.ArticleMapper;
import ru.dzhioev.databaselessons.model.Article;
import ru.dzhioev.databaselessons.model.Author;
import ru.dzhioev.databaselessons.repository.ArticleRepository;
import ru.dzhioev.databaselessons.repository.AuthorRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;
    private final AuthorRepository authorRepository;
    private final ArticleMapper articleMapper;


    @Override
    @Transactional(readOnly = true)
    public List<ArticleDto> findAllArticleDtos() {
        return articleRepository.findAll().stream()
                .map(articleMapper::toDto)
                .collect(Collectors.toList());
    }


    @Override
    @Transactional
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }
}
