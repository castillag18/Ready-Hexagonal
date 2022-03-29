package com.studentList.demo.infrastructure.repository;

import com.studentList.demo.domain.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
/*  @Transactional
    @Modifying
    @Query(value = "delete from users where id = ?1", nativeQuery = true)*/
    void deleteById(Integer id);

}
