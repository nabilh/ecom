package ecom.web.rest;

import ecom.dao.CustomerDAO;

import ecom.domain.Customer;

import ecom.service.CustomerService;

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
 * Spring Rest controller that handles CRUD requests for Customer entities
 * 
 */

@Controller("CustomerRestController")
public class CustomerRestController {

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
	 * Save an existing Customer entity
	 * 
	 */
	@RequestMapping(value = "/Customer", method = RequestMethod.PUT)
	@ResponseBody
	public Customer saveCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return customerDAO.findCustomerByPrimaryKey(customer.getId());
	}

	/**
	 * Delete an existing Customer entity
	 * 
	 */
	@RequestMapping(value = "/Customer/{customer_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteCustomer(@PathVariable Integer customer_id) {
		Customer customer = customerDAO.findCustomerByPrimaryKey(customer_id);
		customerService.deleteCustomer(customer);
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
	 * Show all Customer entities
	 * 
	 */
	@RequestMapping(value = "/Customer", method = RequestMethod.GET)
	@ResponseBody
	public List<Customer> listCustomers() {
		return new java.util.ArrayList<Customer>(customerService.loadCustomers());
	}

	/**
	 * Select an existing Customer entity
	 * 
	 */
	@RequestMapping(value = "/Customer/{customer_id}", method = RequestMethod.GET)
	@ResponseBody
	public Customer loadCustomer(@PathVariable Integer customer_id) {
		return customerDAO.findCustomerByPrimaryKey(customer_id);
	}

	/**
	 * Create a new Customer entity
	 * 
	 */
	@RequestMapping(value = "/Customer", method = RequestMethod.POST)
	@ResponseBody
	public Customer newCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return customerDAO.findCustomerByPrimaryKey(customer.getId());
	}
}