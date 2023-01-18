package study.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.jpa.CourseEntity;

public interface MyRepository extends JpaRepository<CourseEntity, Integer>{

	
	
}
