	package com.carlosdiegoc.sales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdiegoc.sales.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
