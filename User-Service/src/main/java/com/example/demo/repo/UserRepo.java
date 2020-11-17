package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;


@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	//Department findDById(long id);
//	 @Query(value = "SELECT * FROM PRODUCT WHERE productPrice > ?1", nativeQuery = true)
//	  List<Product> findAllWherePriceGreaterThanSpecified(float price);
}
