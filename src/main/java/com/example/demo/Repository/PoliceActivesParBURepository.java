package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.Mutuelle;
import com.example.demo.Model.PoliceActivesParBU;

public interface PoliceActivesParBURepository extends JpaRepository<PoliceActivesParBU,Integer>{

	@Query(value=" select * from nombrepolicesbu ORDER by IdBU,BU",nativeQuery = true)
	List<PoliceActivesParBU> findPoliceActivesParBU();
	
}
