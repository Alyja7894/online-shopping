package com.alyja.shopping.dao;
import java.util.List;

import com.alyja.shopping.dto.Category;

public interface CategoryDAO {
	
		List<Category> List();
		Category get(int id);

}
