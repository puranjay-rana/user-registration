package com.registration.user_registration.Repository;

import com.registration.user_registration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {



}
