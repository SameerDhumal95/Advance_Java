package study.jparest.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.jparest.entity.ProductEntity;

@Repository
public interface MyRepositary extends JpaRepository<ProductEntity, Integer> {

}
