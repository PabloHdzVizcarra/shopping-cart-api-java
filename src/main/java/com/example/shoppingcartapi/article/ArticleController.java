package com.example.shoppingcartapi.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/article")
public class ArticleController {

  private final ArticleService articleService;

  @Autowired
  public ArticleController(ArticleService articleService) {
    this.articleService = articleService;
  }

  @CrossOrigin(origins = "http://localhost:8080")
  @GetMapping
  public List<Article> Test() {
    return articleService.getArticles();
  }

  @CrossOrigin(origins = "http://localhost:8080")
  @PostMapping
  Article newArticle(@Valid @RequestBody Article newArticle) {
    return articleService.saveArticle(newArticle);
  }
}
