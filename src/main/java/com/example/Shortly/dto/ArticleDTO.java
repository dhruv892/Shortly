package com.example.Shortly.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDTO {
    private Long id;
    private String title;
    private String summary;
    private String url;
    private String source;
    private String category;
    private LocalDateTime publishedAt;
    private String imageUrl;
}
