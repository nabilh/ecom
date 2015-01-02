package apps.service;

import apps.dao.ProductDAO;

import apps.domain.Product;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Product entities
 * 
 */

@Service("ProductService")
@Transactional
public class ProductServiceImpl implements ProductService {

	/**
	 * DAO injected by Spring that manages Product entities
	 * 
	 */
	@Autowired
	private ProductDAO productDAO;

	/**
	 * Instantiates a new ProductServiceImpl.
	 *
	 */
	public ProductServiceImpl() {
	}

	/**
	 * Delete an existing Product entity
	 * 
	 */
	@Transactional
	public void deleteProduct(Product product) {
		productDAO.remove(product);
		productDAO.flush();
	}

	/**
	 * Return all Product entity
	 * 
	 */
	@Transactional
	public List<Product> findAllProducts(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Product>(productDAO.findAllProducts(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Product findProductByPrimaryKey(Integer id) {
		return productDAO.findProductByPrimaryKey(id);
	}

	/**
	 * Save an existing Product entity
	 * 
	 */
	@Transactional
	public void saveProduct(Product product) {
		Product existingProduct = productDAO.findProductByPrimaryKey(product.getId());

		if (existingProduct != null) {
			if (existingProduct != product) {
				existingProduct.setId(product.getId());
				existingProduct.setPartNumber(product.getPartNumber());
				existingProduct.setColor(product.getColor());
				existingProduct.setBrand(product.getBrand());
				existingProduct.setCategory(product.getCategory());
				existingProduct.setName(product.getName());
			}
			product = productDAO.store(existingProduct);
		} else {
			product = productDAO.store(product);
		}
		productDAO.flush();
	}

	/**
	 * Return a count of all Product entity
	 * 
	 */
	@Transactional
	public Integer countProducts() {
		return ((Long) productDAO.createQuerySingleResult("select count(o) from Product o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Product entity
	 * 
	 */
	@Transactional
	public Set<Product> loadProducts() {
		return productDAO.findAllProducts();
	}
}
