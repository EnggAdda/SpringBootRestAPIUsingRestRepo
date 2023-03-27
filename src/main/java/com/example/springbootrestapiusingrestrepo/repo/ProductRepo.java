package com.example.springbootrestapiusingrestrepo.repo;

import com.example.springbootrestapiusingrestrepo.entity.Product;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
