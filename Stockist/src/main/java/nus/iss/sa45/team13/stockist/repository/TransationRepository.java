package nus.iss.sa45.team13.stockist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nus.iss.sa45.team13.stockist.model.Transation;

public interface TransationRepository extends JpaRepository<Transation, Integer> {

}
