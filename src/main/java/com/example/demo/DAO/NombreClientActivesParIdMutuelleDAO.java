package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.NombreClientActivesParIdMutuelleModel;
import com.example.demo.Repository.NombreClientActivesParIdMutuelleRepository;

@Service
public class NombreClientActivesParIdMutuelleDAO implements NombreClientActivesParIdMutuelleRepository {

	@Autowired
	NombreClientActivesParIdMutuelleRepository t;

	@Override
	public List<NombreClientActivesParIdMutuelleModel> findAll() {
		// TODO Auto-generated method stub
		return t.findAll();
	}
	
	@Override
	public List<NombreClientActivesParIdMutuelleModel> findData() {
		// TODO Auto-generated method stub
		return t.findData();
	}

	@Override
	public List<NombreClientActivesParIdMutuelleModel> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NombreClientActivesParIdMutuelleModel> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NombreClientActivesParIdMutuelleModel> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends NombreClientActivesParIdMutuelleModel> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<NombreClientActivesParIdMutuelleModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NombreClientActivesParIdMutuelleModel getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NombreClientActivesParIdMutuelleModel> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NombreClientActivesParIdMutuelleModel> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<NombreClientActivesParIdMutuelleModel> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NombreClientActivesParIdMutuelleModel> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<NombreClientActivesParIdMutuelleModel> findById(Integer id) {
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
	public void delete(NombreClientActivesParIdMutuelleModel entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends NombreClientActivesParIdMutuelleModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends NombreClientActivesParIdMutuelleModel> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NombreClientActivesParIdMutuelleModel> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NombreClientActivesParIdMutuelleModel> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends NombreClientActivesParIdMutuelleModel> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	

}
