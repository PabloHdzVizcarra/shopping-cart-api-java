package com.example.shoppingcartapi.article;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/article")
public class ArticleController {

  @GetMapping
  public String Test() {
    return "Hello Spring";
  }
}
