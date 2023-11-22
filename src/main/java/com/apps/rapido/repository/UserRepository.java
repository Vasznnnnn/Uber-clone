package com.apps.rapido.repository;


import com.apps.rapido.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    Boolean findByUserId(String id);
}
