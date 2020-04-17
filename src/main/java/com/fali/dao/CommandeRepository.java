package com.fali.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fali.entites.Commande;
//@RepositoryRestResource
public interface CommandeRepository extends JpaRepository<Commande, Long>{

	

}
