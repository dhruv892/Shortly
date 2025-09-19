package com.example.Shortly.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedResponse {
    private List<ArticleDTO> articles;
    private boolean hasMore;
    private int currentPage;
    private int totalPages;
}
