package study.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.jpa.Planner;

public interface MyRepository extends JpaRepository<Planner, Integer>{

}
