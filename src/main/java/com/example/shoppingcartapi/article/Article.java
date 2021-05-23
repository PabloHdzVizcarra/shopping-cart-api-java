package com.example.shoppingcartapi.article;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table
public class Article {
  @Id
  @SequenceGenerator(
      name = "article_sequence",
      sequenceName = "article_sequence",
      allocationSize = 1
  )
  @GeneratedValue(
      strategy = GenerationType.SEQUENCE,
      generator = "article_sequence"
  )
  private Long id;


  @NotBlank(message = "name is mandatory")
  private String name;

  @NotBlank(message = "brand is mandatory")
  private String brand;

  @NotBlank(message = "price is mandatory")
  private int price;

  @CreationTimestamp
  private LocalDate created_at;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Article{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", brand='" + brand + '\'' +
        ", price=" + price +
        '}';
  }
}
