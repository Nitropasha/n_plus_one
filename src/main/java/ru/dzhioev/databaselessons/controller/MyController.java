package ru.dzhioev.databaselessons.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dzhioev.databaselessons.model.Article;
import ru.dzhioev.databaselessons.model.Author;
import ru.dzhioev.databaselessons.service.ArticleService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    ArticleService articleService;

    public MyController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/")

    public String hello() {
        return "Hello World";
    }

    @GetMapping("/article")

    public List<Article> articles() {
        List<Article> articles = articleService.findAllArticles();
        return articles;
    }
    @GetMapping("/author")
    public List<Author> authors() {
        List<Author> authors = articleService.findAllAuthors();
        return authors;
    }
}