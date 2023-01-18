package study.hw1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import study.hw1.entity.BookEntity;

public interface MyRepository extends JpaRepository<BookEntity,Integer> {
	//public List<BookEntity> findByName(String name);
	
	public List<BookEntity> findByName(String bname);
}
