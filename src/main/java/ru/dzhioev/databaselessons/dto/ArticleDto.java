package ru.dzhioev.databaselessons.dto;

import lombok.Data;
import java.util.List;

@Data
public class ArticleDto {
    private Long id;
    private String title;
    private List<String> authorNames;
}