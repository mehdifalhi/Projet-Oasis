package com.fali.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fali.entites.Commande;
import com.fali.dao.CommandeRepository;

@RestController
@RequestMapping("commandes")
public class CommandeRestService {
	
	@Autowired
	private CommandeRepository commandeRepository;
	
	//@RequestMapping(value="/commandes",method=RequestMethod.GET)
	@Secured(value = {"ROLE_ADMIN","ROLE_GOGO","ROLE_TOTO"})
	@GetMapping
	public  List<Commande> getCommandes(){
		return commandeRepository.findAll();
	}
	//AFFICHE PAR ID
	
	@Secured(value = {"ROLE_ADMIN","ROLE_GOGO"})
		@GetMapping("/{id}")
		public Optional<Commande> getCommandeById(@PathVariable Long id) {
			return commandeRepository.findById(id);
		}
		//AJOUTE
	    @Secured(value = {"ROLE_ADMIN","ROLE_GOGO"})

		@PostMapping (produces = MediaType.APPLICATION_JSON_VALUE)

		// @RequestMapping(value="/commandes}",method=RequestMethod.POST) 
		  public Commande save(@RequestBody Commande c ){
			  return commandeRepository.save(c); 
			  
		  }
		 //DELETE
		@Secured(value = {"ROLE_ADMIN"})

			@DeleteMapping("/{id}")
			public  boolean delete(@PathVariable Long id){
				 commandeRepository.deleteById(id);
				 return true;
			}
			//UPDATE
		@Secured(value = {"ROLE_ADMIN"})

			 @PutMapping("/{id}") 
			  public Commande update(@PathVariable Long id,@RequestBody Commande c ){
				 c.setId(id);
				  return commandeRepository.save(c); 
				  
			  }
			 
	
	

}
