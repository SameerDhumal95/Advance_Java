package study.mvc;

import org.springframework.data.jpa.repository.JpaRepository;


public interface MyRepository extends JpaRepository<BookEntity,Integer> {

}
