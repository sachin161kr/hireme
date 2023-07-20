package com.sachinkumar.hireme.Respository;

import com.sachinkumar.hireme.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepo extends JpaRepository<User,String> {
}
