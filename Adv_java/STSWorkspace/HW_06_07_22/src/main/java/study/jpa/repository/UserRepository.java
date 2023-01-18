package study.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.jpa.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

}
