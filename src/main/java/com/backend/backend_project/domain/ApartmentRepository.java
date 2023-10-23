package com.backend.backend_project.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ApartmentRepository extends CrudRepository<Apartment, Long>{

	List<Apartment> findByOwner(@Param("owner") String owner);
	
	List<Apartment> findByAptNumber(@Param("aptNumber") int aptNumber);
	
	List<Apartment> findByStair(@Param("stair") String stair);
	
}
