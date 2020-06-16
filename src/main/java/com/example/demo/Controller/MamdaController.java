package com.example.demo.Controller;
import com.example.demo.Model.Mutuelle;
import com.example.demo.Model.NombreClientActiveParBuAndProduitHorsAutoModel;
import com.example.demo.Model.NombreClientActivesParIdMutuelleModel;
import com.example.demo.Model.PoliceActivesParBU;
import com.example.demo.Model.PoliceActivesParBUPie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.MutuelleDAO;
import com.example.demo.DAO.NombreClientActiveParBuAndProduitHorsAutoDAO;
import com.example.demo.DAO.NombreClientActivesParIdMutuelleDAO;
import com.example.demo.DAO.PoliceActivesParBUDAO;
import com.example.demo.DAO.PoliceActivesParBUPieDAO;

@RestController
@RequestMapping("/home")
public class MamdaController {
	
	@Autowired
	MutuelleDAO mDao;
	
	@Autowired
	PoliceActivesParBUDAO pDao;
	
	@Autowired
	PoliceActivesParBUPieDAO pie1;
	
	@Autowired
	NombreClientActivesParIdMutuelleDAO data;
	
	@Autowired
	NombreClientActiveParBuAndProduitHorsAutoDAO tL;
	
	
	@GetMapping("/twolines")
	public List<NombreClientActiveParBuAndProduitHorsAutoModel> getDataLines(){
		return tL.findData();
	}
	
	
	@GetMapping("/pie2")
	public List<NombreClientActivesParIdMutuelleModel> getDataPie2(){
		return data.findData();
	}
	
	
	@GetMapping("/pie")
	public List<PoliceActivesParBUPie> getDataPie1(){
		return pie1.findData();
	}
	
	@GetMapping("/data")
	public List<PoliceActivesParBU> getPoliceActivesParBU(){
		return pDao.findPoliceActivesParBU();
	}

	
	
	
	@GetMapping("/mutuelle")
	public List<Mutuelle> getMutuelleAll(){
		return mDao.findAll();
		
	}
	
	@GetMapping("/mutuelle2")
	public List<Integer> getMutuelleC(){
		return mDao.custumMutuelle();
		
	}
}
