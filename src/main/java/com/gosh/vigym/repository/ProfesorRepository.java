package com.gosh.vigym.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gosh.vigym.model.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer>{

	//LOGIN
	@Query("SELECT p FROM Profesor p where p.username = :username and p.password = :password")
	Profesor findByUsernameAndPassword(
			@Param("username") String username,
			@Param("password") String password);
		
	//verificar si ese username ya esta ocupado
	boolean existsByUsername(String username);
	//verificar si ese correo ya esta ocupado
	boolean existsByCorreo(String correo);
			
	//busca estudiantes por username
	Profesor findByUsername(String username);
	Profesor findByCorreo(String correo);
	//busca estudiantes por nombres
	List<Profesor> findByNombre(String nombre);
	//busca estudiantes por apellidos
	List<Profesor> findByApellido(String apellido);
}
