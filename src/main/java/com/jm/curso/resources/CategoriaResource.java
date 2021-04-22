package com.jm.curso.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jm.curso.domain.Categoria;

@RestController
@RequestMapping(value="/categoria")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		 Categoria cat= new Categoria(1, "informatica");
		 
		 
		 List<Categoria> lista = new ArrayList<>();
		 lista.add(cat);
		 
		 return lista;
	}

}
