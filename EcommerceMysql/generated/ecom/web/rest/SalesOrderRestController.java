package ecom.web.rest;

import ecom.dao.CustomerDAO;
import ecom.dao.OrderLineDAO;
import ecom.dao.SalesOrderDAO;

import ecom.domain.Customer;
import ecom.domain.OrderLine;
import ecom.domain.SalesOrder;

import ecom.service.SalesOrderService;

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
 * Spring Rest controller that handles CRUD requests for SalesOrder entities
 * 
 */

@Controller("SalesOrderRestController")
public class SalesOrderRestController {

	/**
	 * DAO injected by Spring that manages Customer entities
	 * 
	 */
	@Autowired
	private CustomerDAO customerDAO;

	/**
	 * DAO injected by Spring that manages OrderLine entities
	 * 
	 */
	@Autowired
	private OrderLineDAO orderLineDAO;

	/**
	 * DAO injected by Spring that manages SalesOrder entities
	 * 
	 */
	@Autowired
	private SalesOrderDAO salesOrderDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for SalesOrder entities
	 * 
	 */
	@Autowired
	private SalesOrderService salesOrderService;

	/**
	 * Save an existing OrderLine entity
	 * 
	 */
	@RequestMapping(value = "/SalesOrder/{salesorder_id}/orderLines", method = RequestMethod.PUT)
	@ResponseBody
	public OrderLine saveSalesOrderOrderLines(@PathVariable Integer salesorder_id, @RequestBody OrderLine orderlines) {
		salesOrderService.saveSalesOrderOrderLines(salesorder_id, orderlines);
		return orderLineDAO.findOrderLineByPrimaryKey(orderlines.getId());
	}

	/**
	 * Show all OrderLine entities by SalesOrder
	 * 
	 */
	@RequestMapping(value = "/SalesOrder/{salesorder_id}/orderLines", method = RequestMethod.GET)
	@ResponseBody
	public List<OrderLine> getSalesOrderOrderLines(@PathVariable Integer salesorder_id) {
		return new java.util.ArrayList<OrderLine>(salesOrderDAO.findSalesOrderByPrimaryKey(salesorder_id).getOrderLines());
	}

	/**
	 * View an existing OrderLine entity
	 * 
	 */
	@RequestMapping(value = "/SalesOrder/{salesorder_id}/orderLines/{orderline_id}", method = RequestMethod.GET)
	@ResponseBody
	public OrderLine loadSalesOrderOrderLines(@PathVariable Integer salesorder_id, @PathVariable Integer related_orderlines_id) {
		OrderLine orderline = orderLineDAO.findOrderLineByPrimaryKey(related_orderlines_id, -1, -1);

		return orderline;
	}

	/**
	 * View an existing Customer entity
	 * 
	 */
	@RequestMapping(value = "/SalesOrder/{salesorder_id}/customer/{customer_id}", method = RequestMethod.GET)
	@ResponseBody
	public Customer loadSalesOrderCustomer(@PathVariable Integer salesorder_id, @PathVariable Integer related_customer_id) {
		Customer customer = customerDAO.findCustomerByPrimaryKey(related_customer_id, -1, -1);

		return customer;
	}

	/**
	 * Select an existing SalesOrder entity
	 * 
	 */
	@RequestMapping(value = "/SalesOrder/{salesorder_id}", method = RequestMethod.GET)
	@ResponseBody
	public SalesOrder loadSalesOrder(@PathVariable Integer salesorder_id) {
		return salesOrderDAO.findSalesOrderByPrimaryKey(salesorder_id);
	}

	/**
	 * Show all SalesOrder entities
	 * 
	 */
	@RequestMapping(value = "/SalesOrder", method = RequestMethod.GET)
	@ResponseBody
	public List<SalesOrder> listSalesOrders() {
		return new java.util.ArrayList<SalesOrder>(salesOrderService.loadSalesOrders());
	}

	/**
	 * Save an existing SalesOrder entity
	 * 
	 */
	@RequestMapping(value = "/SalesOrder", method = RequestMethod.PUT)
	@ResponseBody
	public SalesOrder saveSalesOrder(@RequestBody SalesOrder salesorder) {
		salesOrderService.saveSalesOrder(salesorder);
		return salesOrderDAO.findSalesOrderByPrimaryKey(salesorder.getId());
	}

	/**
	 * Delete an existing OrderLine entity
	 * 
	 */
	@RequestMapping(value = "/SalesOrder/{salesorder_id}/orderLines/{orderline_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteSalesOrderOrderLines(@PathVariable Integer salesorder_id, @PathVariable Integer related_orderlines_id) {
		salesOrderService.deleteSalesOrderOrderLines(salesorder_id, related_orderlines_id);
	}

	/**
	 * Save an existing Customer entity
	 * 
	 */
	@RequestMapping(value = "/SalesOrder/{salesorder_id}/customer", method = RequestMethod.PUT)
	@ResponseBody
	public Customer saveSalesOrderCustomer(@PathVariable Integer salesorder_id, @RequestBody Customer customer) {
		salesOrderService.saveSalesOrderCustomer(salesorder_id, customer);
		return customerDAO.findCustomerByPrimaryKey(customer.getId());
	}

	/**
	 * Create a new OrderLine entity
	 * 
	 */
	@RequestMapping(value = "/SalesOrder/{salesorder_id}/orderLines", method = RequestMethod.POST)
	@ResponseBody
	public OrderLine newSalesOrderOrderLines(@PathVariable Integer salesorder_id, @RequestBody OrderLine orderline) {
		salesOrderService.saveSalesOrderOrderLines(salesorder_id, orderline);
		return orderLineDAO.findOrderLineByPrimaryKey(orderline.getId());
	}

	/**
	 * Create a new Customer entity
	 * 
	 */
	@RequestMapping(value = "/SalesOrder/{salesorder_id}/customer", method = RequestMethod.POST)
	@ResponseBody
	public Customer newSalesOrderCustomer(@PathVariable Integer salesorder_id, @RequestBody Customer customer) {
		salesOrderService.saveSalesOrderCustomer(salesorder_id, customer);
		return customerDAO.findCustomerByPrimaryKey(customer.getId());
	}

	/**
	 * Delete an existing SalesOrder entity
	 * 
	 */
	@RequestMapping(value = "/SalesOrder/{salesorder_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteSalesOrder(@PathVariable Integer salesorder_id) {
		SalesOrder salesorder = salesOrderDAO.findSalesOrderByPrimaryKey(salesorder_id);
		salesOrderService.deleteSalesOrder(salesorder);
	}

	/**
	 * Delete an existing Customer entity
	 * 
	 */
	@RequestMapping(value = "/SalesOrder/{salesorder_id}/customer/{customer_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteSalesOrderCustomer(@PathVariable Integer salesorder_id, @PathVariable Integer related_customer_id) {
		salesOrderService.deleteSalesOrderCustomer(salesorder_id, related_customer_id);
	}

	/**
	 * Create a new SalesOrder entity
	 * 
	 */
	@RequestMapping(value = "/SalesOrder", method = RequestMethod.POST)
	@ResponseBody
	public SalesOrder newSalesOrder(@RequestBody SalesOrder salesorder) {
		salesOrderService.saveSalesOrder(salesorder);
		return salesOrderDAO.findSalesOrderByPrimaryKey(salesorder.getId());
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
	 * Get Customer entity by SalesOrder
	 * 
	 */
	@RequestMapping(value = "/SalesOrder/{salesorder_id}/customer", method = RequestMethod.GET)
	@ResponseBody
	public Customer getSalesOrderCustomer(@PathVariable Integer salesorder_id) {
		return salesOrderDAO.findSalesOrderByPrimaryKey(salesorder_id).getCustomer();
	}
}