package com.example.courier.repository;/*
 * @author gauravverma
 */


import com.example.courier.model.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, String> {
    LoginEntity findByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}
