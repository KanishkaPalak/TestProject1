package com.paytm.initialproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.paytm.initialproject.model.UserAuth;

public interface UserRepository extends JpaRepository<UserAuth, Long> {

	UserAuth findByUsername(String username);
}
