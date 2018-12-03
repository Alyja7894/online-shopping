package com.alyja.shopping.daoimpl;

import com.alyja.shopping.dao.CategoryDAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.alyja.shopping.dto.Category;

// Esta clase Nos devuelve una lista de categorias  DAO (Data Access Object)
@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO { // En esta clase, alñadimos una interface "categoryDAO" (Listado)
	
	//lista estatica
	private static List<Category> categories= new ArrayList<>(); 
	
	
	//inicializamos
	static {
		
		//creamos una categoria 
		Category category = new Category();
		
		//Adding first category - añadiendo primera categoria 
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television //Esto es una description");
		category.setImagenURL("CAT_1.png");
		
		categories.add(category);
		
		//second category - segunda categoria
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for Mobile //Esto es una mobile");
		category.setImagenURL("CAT_2.png");
		
		categories.add(category);
		
		//third category - tercera categoria
				category = new Category();
				category.setId(3);
				category.setName("Laptop");
				category.setDescription("This is some description for Laptop //Esto es una Laptop");
				category.setImagenURL("CAT_3.png");
				
				categories.add(category);			
		
		
	}

	@Override
	public java.util.List<Category> List() { //nos devuelve una lista de categorias 
		
		return categories ;
	}

	@Override
	public Category get(int id) {
		// enchanced for loop
		
		for (Category category : categories) {
			
			if(category.getId() == id) 
				return category;
		}
		return null;
		
	}

}
