package com.account.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.account.management.details.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
