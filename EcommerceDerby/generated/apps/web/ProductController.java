package apps.web;

import apps.dao.ProductDAO;

import apps.domain.Product;

import apps.service.ProductService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Product entities
 * 
 */

@Controller("ProductController")
public class ProductController {

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
	 * Create a new Product entity
	 * 
	 */
	@RequestMapping("/newProduct")
	public ModelAndView newProduct() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", new Product());
		mav.addObject("newFlag", true);
		mav.setViewName("product/editProduct.jsp");

		return mav;
	}

	/**
	 * Show all Product entities
	 * 
	 */
	@RequestMapping("/indexProduct")
	public ModelAndView listProducts() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productService.loadProducts());

		mav.setViewName("product/listProducts.jsp");

		return mav;
	}

	/**
	 * Save an existing Product entity
	 * 
	 */
	@RequestMapping("/saveProduct")
	public String saveProduct(@ModelAttribute Product product) {
		productService.saveProduct(product);
		return "forward:/indexProduct";
	}

	/**
	 * Select an existing Product entity
	 * 
	 */
	@RequestMapping("/selectProduct")
	public ModelAndView selectProduct(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(idKey));
		mav.setViewName("product/viewProduct.jsp");

		return mav;
	}

	/**
	 * Edit an existing Product entity
	 * 
	 */
	@RequestMapping("/editProduct")
	public ModelAndView editProduct(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(idKey));
		mav.setViewName("product/editProduct.jsp");

		return mav;
	}

	/**
	 * Delete an existing Product entity
	 * 
	 */
	@RequestMapping("/deleteProduct")
	public String deleteProduct(@RequestParam Integer idKey) {
		Product product = productDAO.findProductByPrimaryKey(idKey);
		productService.deleteProduct(product);
		return "forward:/indexProduct";
	}

	/**
	 * Select the Product entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProduct")
	public ModelAndView confirmDeleteProduct(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(idKey));
		mav.setViewName("product/deleteProduct.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Product entities
	 * 
	 */
	public String indexProduct() {
		return "redirect:/indexProduct";
	}

	/**
	 */
	@RequestMapping("/productController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

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