package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.PoliceActivesParBU;
import com.example.demo.Model.PoliceActivesParBUPie;

public interface PoliceActivesParBUPieRepository extends JpaRepository<PoliceActivesParBUPie, Integer> {
	
	@Query(value="select * from dbo.policeactivesparbupie",nativeQuery = true)
	List<PoliceActivesParBUPie> findData();


}
