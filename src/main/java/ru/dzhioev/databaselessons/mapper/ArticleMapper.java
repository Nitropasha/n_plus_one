package ru.dzhioev.databaselessons.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.dzhioev.databaselessons.dto.ArticleDto;
import ru.dzhioev.databaselessons.model.Article;
import ru.dzhioev.databaselessons.model.Author;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface ArticleMapper {

    @Mapping(target = "authorNames", expression = "java(mapAuthors(article.getAuthors()))")
    ArticleDto toDto(Article article);

    default List<String> mapAuthors(Set<Author> authors) {
        return authors.stream().map(Author::getName).toList();
    }
}