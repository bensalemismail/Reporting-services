package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.NombreClientActiveParBuAndProduitHorsAutoModel;
import com.example.demo.Repository.NombreClientActiveParBUAndProduitHorsAutoRepository;

@Service
public class NombreClientActiveParBuAndProduitHorsAutoDAO
		implements NombreClientActiveParBUAndProduitHorsAutoRepository {
	
	@Autowired
	NombreClientActiveParBUAndProduitHorsAutoRepository s;

	@Override
	public List<NombreClientActiveParBuAndProduitHorsAutoModel> findData() {
		// TODO Auto-generated method stub
		return s.findData();
	}

	@Override
	public List<NombreClientActiveParBuAndProduitHorsAutoModel> findAll() {
		// TODO Auto-generated method stub
		return s.findAll();
	}

	@Override
	public List<NombreClientActiveParBuAndProduitHorsAutoModel> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NombreClientActiveParBuAndProduitHorsAutoModel> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NombreClientActiveParBuAndProduitHorsAutoModel> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends NombreClientActiveParBuAndProduitHorsAutoModel> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<NombreClientActiveParBuAndProduitHorsAutoModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NombreClientActiveParBuAndProduitHorsAutoModel getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NombreClientActiveParBuAndProduitHorsAutoModel> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NombreClientActiveParBuAndProduitHorsAutoModel> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<NombreClientActiveParBuAndProduitHorsAutoModel> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NombreClientActiveParBuAndProduitHorsAutoModel> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<NombreClientActiveParBuAndProduitHorsAutoModel> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(NombreClientActiveParBuAndProduitHorsAutoModel entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends NombreClientActiveParBuAndProduitHorsAutoModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends NombreClientActiveParBuAndProduitHorsAutoModel> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NombreClientActiveParBuAndProduitHorsAutoModel> Page<S> findAll(Example<S> example,
			Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NombreClientActiveParBuAndProduitHorsAutoModel> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends NombreClientActiveParBuAndProduitHorsAutoModel> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
