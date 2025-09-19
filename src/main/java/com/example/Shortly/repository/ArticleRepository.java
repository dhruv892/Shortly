package com.example.Shortly.repository;

import com.example.Shortly.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    Optional<Article> findByUrl(String url);

    Page<Article> findAllByOrderByPublishedAtDesc(Pageable pageable);

    Page<Article> findByCategoryOrderByPublishedAtDesc(String category, Pageable pageable);

    boolean existsByUrl(String url);

    // For cleanup - delete articles older than X days
    void deleteByCreatedAtBefore(LocalDateTime date);
}
