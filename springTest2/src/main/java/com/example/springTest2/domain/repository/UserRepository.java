package com.example.springTest2.domain.repository;


import com.example.springTest2.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<Users, Long> {
    Users getUserById(Integer id);

    Users getUserByNameAndPassword(@Param(value="name") String name,
                                   @Param(value="password") String password);
}
