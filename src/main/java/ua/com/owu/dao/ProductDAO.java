package ua.com.owu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.owu.models.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {
}
