package com.fali;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fali.dao.CommandeRepository;
import com.fali.entites.Commande;

@SpringBootApplication
public class ProjetOasisApplication implements CommandLineRunner{

	@Autowired
	private CommandeRepository commandeRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProjetOasisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * commandeRepository.save(new Commande("samsung", 4000, "S20 ultra"));
		 * commandeRepository.save(new Commande("Nokia", 2900, "Nokia 7içà"));
		 * commandeRepository.save(new Commande("Iphone", 14032, "Iphone Pro Max"));
		 * commandeRepository.save(new Commande("Samsung", 1900, "M 20"));
		 * commandeRepository.save(new Commande("XBOX", 1234, "designation XboX"));
		 * commandeRepository.save(new Commande("Play Station", 1534,
		 * "designation Ps")); commandeRepository.save(new Commande("Dell", 2343,
		 * "designation Dell")); commandeRepository.save(new Commande("Lenovo",32132,
		 * "Bzaf")); commandeRepository.save(new Commande("HP", 43.21,
		 * "designation  HP"));
		 * 
		 */
	}

}
