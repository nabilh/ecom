package apps.web.rest;

import apps.dao.ProductDAO;

import apps.domain.Product;

import apps.service.ProductService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Product entities
 * 
 */

@Controller("ProductRestController")
public class ProductRestController {

	/**
	 * DAO injected by Spring that manages Product entities
	 * 
	 */
	@Autowired
	private ProductDAO productDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Product entities
	 * 
	 */
	@Autowired
	private ProductService productService;

	/**
	 * Save an existing Product entity
	 * 
	 */
	@RequestMapping(value = "/Product", method = RequestMethod.PUT)
	@ResponseBody
	public Product saveProduct(@RequestBody Product product) {
		productService.saveProduct(product);
		return productDAO.findProductByPrimaryKey(product.getId());
	}

	/**
	 * Delete an existing Product entity
	 * 
	 */
	@RequestMapping(value = "/Product/{product_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProduct(@PathVariable Integer product_id) {
		Product product = productDAO.findProductByPrimaryKey(product_id);
		productService.deleteProduct(product);
	}

	/**
	 * Select an existing Product entity
	 * 
	 */
	@RequestMapping(value = "/Product/{product_id}", method = RequestMethod.GET)
	@ResponseBody
	public Product loadProduct(@PathVariable Integer product_id) {
		return productDAO.findProductByPrimaryKey(product_id);
	}

	/**
	 * Create a new Product entity
	 * 
	 */
	@RequestMapping(value = "/Product", method = RequestMethod.POST)
	@ResponseBody
	public Product newProduct(@RequestBody Product product) {
		productService.saveProduct(product);
		return productDAO.findProductByPrimaryKey(product.getId());
	}

	/**
	 * Show all Product entities
	 * 
	 */
	@RequestMapping(value = "/Product", method = RequestMethod.GET)
	@ResponseBody
	public List<Product> listProducts() {
		return new java.util.ArrayList<Product>(productService.loadProducts());
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}
}