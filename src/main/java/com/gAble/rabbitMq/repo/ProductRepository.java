package com.gAble.rabbitMq.repo;

import com.gAble.rabbitMq.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ProductRepository extends JpaRepository<Products,String>  {
}
