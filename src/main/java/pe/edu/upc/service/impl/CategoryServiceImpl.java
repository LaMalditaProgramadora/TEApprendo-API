package pe.edu.upc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.model.Category;
import pe.edu.upc.repository.ICategoryRepository;
import pe.edu.upc.service.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService {
	@Autowired
	private ICategoryRepository categoryRepository;

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category findById(int idCategory) {
		return categoryRepository.findById(idCategory).get();
	}

	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}


}
