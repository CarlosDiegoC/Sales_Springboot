package com.carlosdiegoc.sales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdiegoc.sales.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
