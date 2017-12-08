package nus.iss.sa45.team13.stockist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nus.iss.sa45.team13.stockist.model.User;


public interface UserRepository extends JpaRepository<User, String> {
	
}
