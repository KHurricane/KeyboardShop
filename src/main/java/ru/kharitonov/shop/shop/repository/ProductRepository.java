package ru.kharitonov.shop.shop.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kharitonov.shop.shop.entity.Product;
import ru.kharitonov.shop.shop.entity.ProductType;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Long> {
    public List<Product> findByProductType(ProductType productType);
}
