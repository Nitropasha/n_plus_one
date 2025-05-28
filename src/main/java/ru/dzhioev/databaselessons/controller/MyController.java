package ru.dzhioev.databaselessons.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dzhioev.databaselessons.dto.ArticleDto;
import ru.dzhioev.databaselessons.mapper.ArticleMapper;
import ru.dzhioev.databaselessons.model.Article;
import ru.dzhioev.databaselessons.model.Author;
import ru.dzhioev.databaselessons.service.ArticleService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class MyController {

    private final ArticleService articleService;
    private final ArticleMapper articleMapper;

    @GetMapping
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/articles")
    public List<ArticleDto> articles() {
        return articleService.findAllArticleDtos();
    }

    @GetMapping("/author")
    public List<Author> authors() {
        return articleService.findAllAuthors();
    }
}