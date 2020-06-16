package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.Mutuelle;

public interface MutuelleRepository extends JpaRepository<Mutuelle,Integer> {
	
	@Query(value="SELECT idBU from DimMutuelle",nativeQuery = true)
	List<Integer> custumMutuelle();

}
