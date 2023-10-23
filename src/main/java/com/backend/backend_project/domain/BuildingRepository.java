package com.backend.backend_project.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BuildingRepository extends CrudRepository<Building, Long>{
	
	List<Building> findByAddress(@Param("address") String address);
		
}
