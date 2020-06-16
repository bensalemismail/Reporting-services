package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.Model.PoliceActivesParBUPie;
import com.example.demo.Repository.PoliceActivesParBUPieRepository;

@Service
public class PoliceActivesParBUPieDAO implements PoliceActivesParBUPieRepository {
	
	@Autowired
	PoliceActivesParBUPieRepository policeActiveInterface;

	@Override
	public List<PoliceActivesParBUPie> findAll() {
		// TODO Auto-generated method stub
		return policeActiveInterface.findAll();
	}
	
	@Override
	public List<PoliceActivesParBUPie> findData() {
		// TODO Auto-generated method stub
		return policeActiveInterface.findData();
	}

	@Override
	public List<PoliceActivesParBUPie> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PoliceActivesParBUPie> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PoliceActivesParBUPie> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends PoliceActivesParBUPie> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<PoliceActivesParBUPie> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PoliceActivesParBUPie getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PoliceActivesParBUPie> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PoliceActivesParBUPie> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<PoliceActivesParBUPie> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PoliceActivesParBUPie> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<PoliceActivesParBUPie> findById(Integer id) {
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
	public void delete(PoliceActivesParBUPie entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends PoliceActivesParBUPie> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends PoliceActivesParBUPie> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PoliceActivesParBUPie> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PoliceActivesParBUPie> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends PoliceActivesParBUPie> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
