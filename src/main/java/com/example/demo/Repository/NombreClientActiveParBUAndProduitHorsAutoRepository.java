package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.NombreClientActiveParBuAndProduitHorsAutoModel;
public interface NombreClientActiveParBUAndProduitHorsAutoRepository extends JpaRepository<NombreClientActiveParBuAndProduitHorsAutoModel,Integer>{
	
	@Query(value="select * from nombreclientactiveparbuandproduithorsautoview",nativeQuery = true)
	List<NombreClientActiveParBuAndProduitHorsAutoModel> findData();

}
