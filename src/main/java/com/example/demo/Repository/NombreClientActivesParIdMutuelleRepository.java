package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.NombreClientActivesParIdMutuelleModel;


public interface NombreClientActivesParIdMutuelleRepository extends JpaRepository<NombreClientActivesParIdMutuelleModel,Integer> {
	
	@Query(value="select idmutuelle,mutuelle,nombreclientactives from nombreclientactivesparidmutuelleview",nativeQuery = true)
	List<NombreClientActivesParIdMutuelleModel> findData();

}
