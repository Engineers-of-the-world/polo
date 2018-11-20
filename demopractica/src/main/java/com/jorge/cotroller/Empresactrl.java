package com.jorge.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jorge.model.Empresa;
import com.jorge.service.EmpresaService;

@RestController
@RequestMapping(value="/api/user")
public class Empresactrl {
	@Autowired
	EmpresaService empService;
	
	@GetMapping("/all")
	protected List<Empresa> alluser() {
		return empService.findAllEmp();
	}
	@PostMapping("/ifexist")
	protected boolean isEistUser(@RequestBody Empresa emp) {
		return empService.isEmpExist(emp);
	}
	
	@PostMapping("/save")//save o insert
	protected void  save(@RequestBody Empresa emp) {
		if(empService.isEmpExist(emp)){
			empService.updateEmp(emp);
			System.out.print("El usuario ya existe");
		}else {
			empService.saveEmp(emp);
			System.out.print("El usuario ha sido creado");
		}
		empService.saveEmp(emp);
		//return "welcome a spring boot";
	}
	
	@PutMapping("/update")//update
	protected String update() {
		return "welcome a spring boot";
	}
	@PutMapping("/delete")
	protected String delete() {
		return "welcome a spring boot";
	}
}
