package ecom.web;

import ecom.dao.CustomerDAO;

import ecom.domain.Customer;

import ecom.service.CustomerService;

import java.math.BigDecimal;

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
 * Spring MVC controller that handles CRUD requests for Customer entities
 * 
 */

@Controller("CustomerController")
public class CustomerController {

	/**
	 * DAO injected by Spring that manages Customer entities
	 * 
	 */
	@Autowired
	private CustomerDAO customerDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Customer entities
	 * 
	 */
	@Autowired
	private CustomerService customerService;

	/**
	 * Show all Customer entities
	 * 
	 */
	@RequestMapping("/indexCustomer")
	public ModelAndView listCustomers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customers", customerService.loadCustomers());

		mav.setViewName("customer/listCustomers.jsp");

		return mav;
	}

	/**
	 * Select the Customer entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCustomer")
	public ModelAndView confirmDeleteCustomer(@RequestParam BigDecimal idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customer", customerDAO.findCustomerByPrimaryKey(idKey));
		mav.setViewName("customer/deleteCustomer.jsp");

		return mav;
	}

	/**
	 * Save an existing Customer entity
	 * 
	 */
	@RequestMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute Customer customer) {
		customerService.saveCustomer(customer);
		return "forward:/indexCustomer";
	}

	/**
	 * Delete an existing Customer entity
	 * 
	 */
	@RequestMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam BigDecimal idKey) {
		Customer customer = customerDAO.findCustomerByPrimaryKey(idKey);
		customerService.deleteCustomer(customer);
		return "forward:/indexCustomer";
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
	 * Edit an existing Customer entity
	 * 
	 */
	@RequestMapping("/editCustomer")
	public ModelAndView editCustomer(@RequestParam BigDecimal idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customer", customerDAO.findCustomerByPrimaryKey(idKey));
		mav.setViewName("customer/editCustomer.jsp");

		return mav;
	}

	/**
	 * Create a new Customer entity
	 * 
	 */
	@RequestMapping("/newCustomer")
	public ModelAndView newCustomer() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customer", new Customer());
		mav.addObject("newFlag", true);
		mav.setViewName("customer/editCustomer.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Customer entities
	 * 
	 */
	public String indexCustomer() {
		return "redirect:/indexCustomer";
	}

	/**
	 */
	@RequestMapping("/customerController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select an existing Customer entity
	 * 
	 */
	@RequestMapping("/selectCustomer")
	public ModelAndView selectCustomer(@RequestParam BigDecimal idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customer", customerDAO.findCustomerByPrimaryKey(idKey));
		mav.setViewName("customer/viewCustomer.jsp");

		return mav;
	}
}