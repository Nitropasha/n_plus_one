package ru.dzhioev.databaselessons.service;

import org.springframework.transaction.annotation.Transactional;
import ru.dzhioev.databaselessons.dto.ArticleDto;
import ru.dzhioev.databaselessons.model.Article;
import ru.dzhioev.databaselessons.model.Author;

import java.util.List;

public interface ArticleService {

    List<ArticleDto> findAllArticleDtos();

    List<Author> findAllAuthors();
}
