package com.jorge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jorge.model.Empresa;
import com.jorge.repository.EmpresaRepository;

public class EmpresaServiveImpl implements EmpresaService{

	@Autowired
	EmpresaRepository empRepository;
	
	@Override
	public Empresa findById(long id) {
		return empRepository.findById(id);
	}

	@Override
	public Empresa findByRazon_social(String Razon_social) {
		return empRepository.findByRazon_social(Razon_social);
	}

	@Override
	public void saveEmp(Empresa emp) {
		empRepository.save(emp);
		
	}

	@Override
	public void updateEmp(Empresa emp) {
		empRepository.save(emp);
		
	}

	@Override
	public void deleteEmpById(long id) {
		empRepository.deleteById(id);
		
	}

	@Override
	public List<Empresa> findAllEmp() {
		return empRepository.findAll();
	}

	@Override
	public void deleteAllEmp() {
		empRepository.deleteAll();
		
	}

	@Override
	public boolean isEmpExist(Empresa Emp) {
		boolean activo = false;
		activo = !findByRazon_social(Emp.getRazon_social()).equals(null);
		return activo;
	}

}
