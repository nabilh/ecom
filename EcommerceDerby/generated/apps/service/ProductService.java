package apps.service;

import apps.domain.Product;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Product entities
 * 
 */
public interface ProductService {

	/**
	 * Delete an existing Product entity
	 * 
	 */
	public void deleteProduct(Product product);

	/**
	 * Return all Product entity
	 * 
	 */
	public List<Product> findAllProducts(Integer startResult, Integer maxRows);

	/**
	 */
	public Product findProductByPrimaryKey(Integer id);

	/**
	 * Save an existing Product entity
	 * 
	 */
	public void saveProduct(Product product_1);

	/**
	 * Return a count of all Product entity
	 * 
	 */
	public Integer countProducts();

	/**
	 * Load an existing Product entity
	 * 
	 */
	public Set<Product> loadProducts();
}