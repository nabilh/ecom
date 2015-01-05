package ecom.service;

import ecom.dao.OrderLineDAO;
import ecom.dao.ProductDAO;

import ecom.domain.OrderLine;
import ecom.domain.Product;

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
	 * DAO injected by Spring that manages OrderLine entities
	 * 
	 */
	@Autowired
	private OrderLineDAO orderLineDAO;

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
	 * Delete an existing OrderLine entity
	 * 
	 */
	@Transactional
	public Product deleteProductOrderLines(Integer product_id, Integer related_orderlines_id) {
		OrderLine related_orderlines = orderLineDAO.findOrderLineByPrimaryKey(related_orderlines_id, -1, -1);

		Product product = productDAO.findProductByPrimaryKey(product_id, -1, -1);

		related_orderlines.setProduct(null);
		product.getOrderLines().remove(related_orderlines);

		orderLineDAO.remove(related_orderlines);
		orderLineDAO.flush();

		return product;
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

	/**
	 * Return all Product entity
	 * 
	 */
	@Transactional
	public List<Product> findAllProducts(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Product>(productDAO.findAllProducts(startResult, maxRows));
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
	 */
	@Transactional
	public Product findProductByPrimaryKey(Integer id) {
		return productDAO.findProductByPrimaryKey(id);
	}

	/**
	 * Save an existing OrderLine entity
	 * 
	 */
	@Transactional
	public Product saveProductOrderLines(Integer id, OrderLine related_orderlines) {
		Product product = productDAO.findProductByPrimaryKey(id, -1, -1);
		OrderLine existingorderLines = orderLineDAO.findOrderLineByPrimaryKey(related_orderlines.getId());

		// copy into the existing record to preserve existing relationships
		if (existingorderLines != null) {
			existingorderLines.setId(related_orderlines.getId());
			existingorderLines.setQuantity(related_orderlines.getQuantity());
			related_orderlines = existingorderLines;
		} else {
			related_orderlines = orderLineDAO.store(related_orderlines);
			orderLineDAO.flush();
		}

		related_orderlines.setProduct(product);
		product.getOrderLines().add(related_orderlines);
		related_orderlines = orderLineDAO.store(related_orderlines);
		orderLineDAO.flush();

		product = productDAO.store(product);
		productDAO.flush();

		return product;
	}
}
