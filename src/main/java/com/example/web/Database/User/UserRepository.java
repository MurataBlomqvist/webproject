package com.example.web.Database.User;
 
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
 
public interface UserRepository extends JpaRepository<User, Long> {
        
        @Query("SELECT u FROM User u WHERE u.status = 1")
        Collection<User> findAllActiveUsers();
}