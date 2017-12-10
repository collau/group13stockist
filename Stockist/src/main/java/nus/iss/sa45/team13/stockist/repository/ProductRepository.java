package nus.iss.sa45.team13.stockist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import nus.iss.sa45.team13.stockist.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

//	@Query("SELECT e FROM productdata e where e.partname=:partName")
//	Product findProductByName(@Param("partName") String partName);
	
}
