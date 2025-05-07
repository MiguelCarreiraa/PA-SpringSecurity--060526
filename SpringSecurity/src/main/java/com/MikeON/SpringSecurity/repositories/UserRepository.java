package com.MikeON.SpringSecurity.repositories;

import com.MikeON.SpringSecurity.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    UserDetails findByLogin(String login);
}
