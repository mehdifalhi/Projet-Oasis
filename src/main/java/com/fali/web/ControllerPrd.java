package com.fali.web;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.fali.dao.CommandeRepository;
import com.fali.entites.Commande;
import com.fali.service.ComandeService;

@Controller
public class ControllerPrd {
	
	@Autowired
	private CommandeRepository commandeRepository;
	
	@Autowired
	private ComandeService service;
	
	
	@GetMapping("/")
	public String showPage(Model model,@RequestParam(defaultValue ="0") int page){
	model.addAttribute("data" , commandeRepository.
			findAll(new PageRequest(page, 4)));
	model.addAttribute("currentPage",page);
	return "commande";

	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Commande commande) {
	    service.save(commande);
	     
	    return "redirect:/";
	}

	
	@GetMapping("/delete")
	public String deleteCommande(Long id) {
		service.delete(id);
		return "redirect:/";
	}
	
	 
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
	    Commande commande = new Commande();
	    model.addAttribute("commande", commande);
	     
	    return "newcommande";
	}
	
	  @GetMapping(path = {"/edit"}) 
	  public String edit( Model model ,Long id ) {
	  Commande commande = commandeRepository.findById(id).get();
	  model.addAttribute("commande", commande); 
	  return "updatecommande";
	  
	  }
	 
	
}
