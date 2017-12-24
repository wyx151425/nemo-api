package com.rumofuture.nemo.repository;

import com.rumofuture.nemo.model.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByMobilePhoneNumber(String mobilePhoneNumber);
}
