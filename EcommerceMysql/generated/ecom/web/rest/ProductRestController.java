package ecom.web.rest;

import ecom.dao.OrderLineDAO;
import ecom.dao.ProductDAO;

import ecom.domain.OrderLine;
import ecom.domain.Product;

import ecom.service.ProductService;

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
	 * Service injected by Spring that provides CRUD operations for Product entities
	 * 
	 */
	@Autowired
	private ProductService productService;

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
	 * Create a new OrderLine entity
	 * 
	 */
	@RequestMapping(value = "/Product/{product_id}/orderLines", method = RequestMethod.POST)
	@ResponseBody
	public OrderLine newProductOrderLines(@PathVariable Integer product_id, @RequestBody OrderLine orderline) {
		productService.saveProductOrderLines(product_id, orderline);
		return orderLineDAO.findOrderLineByPrimaryKey(orderline.getId());
	}

	/**
	 * Delete an existing OrderLine entity
	 * 
	 */
	@RequestMapping(value = "/Product/{product_id}/orderLines/{orderline_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProductOrderLines(@PathVariable Integer product_id, @PathVariable Integer related_orderlines_id) {
		productService.deleteProductOrderLines(product_id, related_orderlines_id);
	}

	/**
	 * View an existing OrderLine entity
	 * 
	 */
	@RequestMapping(value = "/Product/{product_id}/orderLines/{orderline_id}", method = RequestMethod.GET)
	@ResponseBody
	public OrderLine loadProductOrderLines(@PathVariable Integer product_id, @PathVariable Integer related_orderlines_id) {
		OrderLine orderline = orderLineDAO.findOrderLineByPrimaryKey(related_orderlines_id, -1, -1);

		return orderline;
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

	/**
	 * Save an existing OrderLine entity
	 * 
	 */
	@RequestMapping(value = "/Product/{product_id}/orderLines", method = RequestMethod.PUT)
	@ResponseBody
	public OrderLine saveProductOrderLines(@PathVariable Integer product_id, @RequestBody OrderLine orderlines) {
		productService.saveProductOrderLines(product_id, orderlines);
		return orderLineDAO.findOrderLineByPrimaryKey(orderlines.getId());
	}

	/**
	 * Show all OrderLine entities by Product
	 * 
	 */
	@RequestMapping(value = "/Product/{product_id}/orderLines", method = RequestMethod.GET)
	@ResponseBody
	public List<OrderLine> getProductOrderLines(@PathVariable Integer product_id) {
		return new java.util.ArrayList<OrderLine>(productDAO.findProductByPrimaryKey(product_id).getOrderLines());
	}

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
	 * Select an existing Product entity
	 * 
	 */
	@RequestMapping(value = "/Product/{product_id}", method = RequestMethod.GET)
	@ResponseBody
	public Product loadProduct(@PathVariable Integer product_id) {
		return productDAO.findProductByPrimaryKey(product_id);
	}
}