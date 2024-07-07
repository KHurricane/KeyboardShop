package ru.kharitonov.shop.shop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kharitonov.shop.shop.entity.Product;
import ru.kharitonov.shop.shop.entity.ProductType;

import java.util.List;

@Repository
public interface ProductTypeRepository extends CrudRepository<ProductType,Long> {



}
