package ecom.service;

import ecom.domain.OrderLine;
import ecom.domain.Product;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Product entities
 * 
 */
public interface ProductService {

	/**
	 * Delete an existing OrderLine entity
	 * 
	 */
	public Product deleteProductOrderLines(Integer product_id, Integer related_orderlines_id);

	/**
	 * Delete an existing Product entity
	 * 
	 */
	public void deleteProduct(Product product);

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

	/**
	 * Return all Product entity
	 * 
	 */
	public List<Product> findAllProducts(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Product entity
	 * 
	 */
	public void saveProduct(Product product_1);

	/**
	 */
	public Product findProductByPrimaryKey(Integer id);

	/**
	 * Save an existing OrderLine entity
	 * 
	 */
	public Product saveProductOrderLines(Integer id_1, OrderLine related_orderlines);
}