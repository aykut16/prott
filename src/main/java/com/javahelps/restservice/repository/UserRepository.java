package com.javahelps.restservice.repository;

import java.util.stream.Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.javahelps.restservice.entity.User;
@RestResource(exported = false)
@Repository
@Transactional
@EnableJpaRepositories
@RepositoryRestResource(exported = false)

public interface UserRepository extends JpaRepository<User,Integer> {

	List <User> findByBarcodeAndQtyGreaterThan(@PathVariable("barcode")String barcode,@RequestParam("qty")Integer qty);
	 List<User>findByQty(Integer qty);
	 Optional<User> findById(Integer qty);
    List<User> findByBarcodeAndQty(@PathVariable("barcode") String barcode,@RequestParam("qty")Integer qty);

   public  List<User> findByQtyGreaterThan(Integer qty);
}