package study.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.jpa.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer >{
	
	
}
