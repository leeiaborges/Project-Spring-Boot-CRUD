package br.com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.entity.Department;

public interface DepartmentRepository extends JpaRepository <Department, Long>{

}
