package com.example.demojava5d9.service;

import com.example.demojava5d9.entity.Category;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();

    void add(Category category);

    void update(Category category);

    void delete(Long id);

    Page<Category> phanTrang(Integer pageNo, Integer size);
}
