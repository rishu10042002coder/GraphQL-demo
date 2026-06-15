package com.demo.garphQL.Repository;

import com.demo.garphQL.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
