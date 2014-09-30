package com.mkyong.common.controller;

import com.azteca.persistence.entities.Usuario;
import com.azteca.persistence.repository.SistemaUsuarioRepository;
import com.mkyong.common.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JSONController {
    
    @Autowired
    SistemaUsuarioRepository UsuarioRepository;

	@RequestMapping(value = "/brands", method = RequestMethod.GET, params = "nombre")
	public @ResponseBody
	Shop getShopInJSON(@RequestParam("nombre") String name) {
                System.out.println(name);
		Shop shop = new Shop();
		shop.setName("edgar");
		shop.setStaffName(new String[] { "mkyong1", "mkyong2" });

		return shop;

	}
        
        
        
        @RequestMapping(value = "/test", method = RequestMethod.GET)
	public @ResponseBody
	Shop getShopInJSON() {
            System.out.println("entre");
            for(Usuario su:UsuarioRepository.findAll()){
            System.out.println(su.getNombre());
            }
		Shop shop = new Shop();
		shop.setName("edgar");
		shop.setStaffName(new String[] { "mkyong1", "mkyong2" });
 
		return shop;

	}

}