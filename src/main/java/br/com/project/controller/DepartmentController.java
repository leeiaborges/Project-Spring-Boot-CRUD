package br.com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.entity.Department;
import br.com.project.repository.DepartmentRepository;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentRepository repository;
	
	@GetMapping
	public List<Department> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Department findAll(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public Department insert(@RequestBody Department department) {
		return repository.save(department);
	}
	
    @PutMapping
    public void alterar(@RequestBody Department department){
        if(department.getId() > 0)
        	repository.save(department);
    }
	
	@DeleteMapping("/department/{id}")
	public void deleteDepartment(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
