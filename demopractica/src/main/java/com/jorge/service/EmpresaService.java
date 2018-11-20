package com.jorge.service;

import java.util.List;

import com.jorge.model.Empresa;


public interface EmpresaService {
	Empresa findById(long id);
	
	Empresa findByRazon_social(String Razon_social);
	
	void saveEmp(Empresa emp);
	
	void updateEmp(Empresa emp);
	
	void deleteEmpById(long id);

	List<Empresa> findAllEmp(); 
	
	void deleteAllEmp();
	
	public boolean isEmpExist(Empresa Emp);
}
