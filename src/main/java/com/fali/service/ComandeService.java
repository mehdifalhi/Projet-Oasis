package com.fali.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fali.dao.CommandeRepository;
import com.fali.entites.Commande;

@Service
@Transactional
public class ComandeService {

	
	@Autowired
	private  CommandeRepository repo;
	
	
	public List<Commande> listAll() {
        return repo.findAll();
    }
     
    public void save(Commande product) {
        repo.save(product);
    }
     
    public Commande get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}
