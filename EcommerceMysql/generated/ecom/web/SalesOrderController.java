package ecom.web;

import ecom.dao.CustomerDAO;
import ecom.dao.OrderLineDAO;
import ecom.dao.SalesOrderDAO;

import ecom.domain.Customer;
import ecom.domain.OrderLine;
import ecom.domain.SalesOrder;

import ecom.service.SalesOrderService;

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
 * Spring MVC controller that handles CRUD requests for SalesOrder entities
 * 
 */

@Controller("SalesOrderController")
public class SalesOrderController {

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
	 * Delete an existing SalesOrder entity
	 * 
	 */
	@RequestMapping("/deleteSalesOrder")
	public String deleteSalesOrder(@RequestParam Integer idKey) {
		SalesOrder salesorder = salesOrderDAO.findSalesOrderByPrimaryKey(idKey);
		salesOrderService.deleteSalesOrder(salesorder);
		return "forward:/indexSalesOrder";
	}

	/**
	 * Save an existing Customer entity
	 * 
	 */
	@RequestMapping("/saveSalesOrderCustomer")
	public ModelAndView saveSalesOrderCustomer(@RequestParam Integer salesorder_id, @ModelAttribute Customer customer) {
		SalesOrder parent_salesorder = salesOrderService.saveSalesOrderCustomer(salesorder_id, customer);

		ModelAndView mav = new ModelAndView();
		mav.addObject("salesorder_id", salesorder_id);
		mav.addObject("salesorder", parent_salesorder);
		mav.setViewName("salesorder/viewSalesOrder.jsp");

		return mav;
	}

	/**
	 * Create a new SalesOrder entity
	 * 
	 */
	@RequestMapping("/newSalesOrder")
	public ModelAndView newSalesOrder() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salesorder", new SalesOrder());
		mav.addObject("newFlag", true);
		mav.setViewName("salesorder/editSalesOrder.jsp");

		return mav;
	}

	/**
	 * View an existing OrderLine entity
	 * 
	 */
	@RequestMapping("/selectSalesOrderOrderLines")
	public ModelAndView selectSalesOrderOrderLines(@RequestParam Integer salesorder_id, @RequestParam Integer orderlines_id) {
		OrderLine orderline = orderLineDAO.findOrderLineByPrimaryKey(orderlines_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("salesorder_id", salesorder_id);
		mav.addObject("orderline", orderline);
		mav.setViewName("salesorder/orderlines/viewOrderLines.jsp");

		return mav;
	}

	/**
	 * Save an existing OrderLine entity
	 * 
	 */
	@RequestMapping("/saveSalesOrderOrderLines")
	public ModelAndView saveSalesOrderOrderLines(@RequestParam Integer salesorder_id, @ModelAttribute OrderLine orderlines) {
		SalesOrder parent_salesorder = salesOrderService.saveSalesOrderOrderLines(salesorder_id, orderlines);

		ModelAndView mav = new ModelAndView();
		mav.addObject("salesorder_id", salesorder_id);
		mav.addObject("salesorder", parent_salesorder);
		mav.setViewName("salesorder/viewSalesOrder.jsp");

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

	/**
	 * Show all SalesOrder entities
	 * 
	 */
	@RequestMapping("/indexSalesOrder")
	public ModelAndView listSalesOrders() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salesorders", salesOrderService.loadSalesOrders());

		mav.setViewName("salesorder/listSalesOrders.jsp");

		return mav;
	}

	/**
	 * Select an existing SalesOrder entity
	 * 
	 */
	@RequestMapping("/selectSalesOrder")
	public ModelAndView selectSalesOrder(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salesorder", salesOrderDAO.findSalesOrderByPrimaryKey(idKey));
		mav.setViewName("salesorder/viewSalesOrder.jsp");

		return mav;
	}

	/**
	 * Show all OrderLine entities by SalesOrder
	 * 
	 */
	@RequestMapping("/listSalesOrderOrderLines")
	public ModelAndView listSalesOrderOrderLines(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salesorder", salesOrderDAO.findSalesOrderByPrimaryKey(idKey));
		mav.setViewName("salesorder/orderlines/listOrderLines.jsp");

		return mav;
	}

	/**
	 * View an existing Customer entity
	 * 
	 */
	@RequestMapping("/selectSalesOrderCustomer")
	public ModelAndView selectSalesOrderCustomer(@RequestParam Integer salesorder_id, @RequestParam Integer customer_id) {
		Customer customer = customerDAO.findCustomerByPrimaryKey(customer_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("salesorder_id", salesorder_id);
		mav.addObject("customer", customer);
		mav.setViewName("salesorder/customer/viewCustomer.jsp");

		return mav;
	}

	/**
	 * Create a new Customer entity
	 * 
	 */
	@RequestMapping("/newSalesOrderCustomer")
	public ModelAndView newSalesOrderCustomer(@RequestParam Integer salesorder_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("salesorder_id", salesorder_id);
		mav.addObject("customer", new Customer());
		mav.addObject("newFlag", true);
		mav.setViewName("salesorder/customer/editCustomer.jsp");

		return mav;
	}

	/**
	 * Create a new OrderLine entity
	 * 
	 */
	@RequestMapping("/newSalesOrderOrderLines")
	public ModelAndView newSalesOrderOrderLines(@RequestParam Integer salesorder_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("salesorder_id", salesorder_id);
		mav.addObject("orderline", new OrderLine());
		mav.addObject("newFlag", true);
		mav.setViewName("salesorder/orderlines/editOrderLines.jsp");

		return mav;
	}

	/**
	 * Select the child Customer entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteSalesOrderCustomer")
	public ModelAndView confirmDeleteSalesOrderCustomer(@RequestParam Integer salesorder_id, @RequestParam Integer related_customer_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("customer", customerDAO.findCustomerByPrimaryKey(related_customer_id));
		mav.addObject("salesorder_id", salesorder_id);
		mav.setViewName("salesorder/customer/deleteCustomer.jsp");

		return mav;
	}

	/**
	 * Edit an existing OrderLine entity
	 * 
	 */
	@RequestMapping("/editSalesOrderOrderLines")
	public ModelAndView editSalesOrderOrderLines(@RequestParam Integer salesorder_id, @RequestParam Integer orderlines_id) {
		OrderLine orderline = orderLineDAO.findOrderLineByPrimaryKey(orderlines_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("salesorder_id", salesorder_id);
		mav.addObject("orderline", orderline);
		mav.setViewName("salesorder/orderlines/editOrderLines.jsp");

		return mav;
	}

	/**
	 * Show all Customer entities by SalesOrder
	 * 
	 */
	@RequestMapping("/listSalesOrderCustomer")
	public ModelAndView listSalesOrderCustomer(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salesorder", salesOrderDAO.findSalesOrderByPrimaryKey(idKey));
		mav.setViewName("salesorder/customer/listCustomer.jsp");

		return mav;
	}

	/**
	 * Edit an existing Customer entity
	 * 
	 */
	@RequestMapping("/editSalesOrderCustomer")
	public ModelAndView editSalesOrderCustomer(@RequestParam Integer salesorder_id, @RequestParam Integer customer_id) {
		Customer customer = customerDAO.findCustomerByPrimaryKey(customer_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("salesorder_id", salesorder_id);
		mav.addObject("customer", customer);
		mav.setViewName("salesorder/customer/editCustomer.jsp");

		return mav;
	}

	/**
	 * Select the child OrderLine entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteSalesOrderOrderLines")
	public ModelAndView confirmDeleteSalesOrderOrderLines(@RequestParam Integer salesorder_id, @RequestParam Integer related_orderlines_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderline", orderLineDAO.findOrderLineByPrimaryKey(related_orderlines_id));
		mav.addObject("salesorder_id", salesorder_id);
		mav.setViewName("salesorder/orderlines/deleteOrderLines.jsp");

		return mav;
	}

	/**
	 * Edit an existing SalesOrder entity
	 * 
	 */
	@RequestMapping("/editSalesOrder")
	public ModelAndView editSalesOrder(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salesorder", salesOrderDAO.findSalesOrderByPrimaryKey(idKey));
		mav.setViewName("salesorder/editSalesOrder.jsp");

		return mav;
	}

	/**
	 * Select the SalesOrder entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteSalesOrder")
	public ModelAndView confirmDeleteSalesOrder(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salesorder", salesOrderDAO.findSalesOrderByPrimaryKey(idKey));
		mav.setViewName("salesorder/deleteSalesOrder.jsp");

		return mav;
	}

	/**
	 * Delete an existing Customer entity
	 * 
	 */
	@RequestMapping("/deleteSalesOrderCustomer")
	public ModelAndView deleteSalesOrderCustomer(@RequestParam Integer salesorder_id, @RequestParam Integer related_customer_id) {
		ModelAndView mav = new ModelAndView();

		SalesOrder salesorder = salesOrderService.deleteSalesOrderCustomer(salesorder_id, related_customer_id);

		mav.addObject("salesorder_id", salesorder_id);
		mav.addObject("salesorder", salesorder);
		mav.setViewName("salesorder/viewSalesOrder.jsp");

		return mav;
	}

	/**
	 * Entry point to show all SalesOrder entities
	 * 
	 */
	public String indexSalesOrder() {
		return "redirect:/indexSalesOrder";
	}

	/**
	 * Save an existing SalesOrder entity
	 * 
	 */
	@RequestMapping("/saveSalesOrder")
	public String saveSalesOrder(@ModelAttribute SalesOrder salesorder) {
		salesOrderService.saveSalesOrder(salesorder);
		return "forward:/indexSalesOrder";
	}

	/**
	 */
	@RequestMapping("/salesorderController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing OrderLine entity
	 * 
	 */
	@RequestMapping("/deleteSalesOrderOrderLines")
	public ModelAndView deleteSalesOrderOrderLines(@RequestParam Integer salesorder_id, @RequestParam Integer related_orderlines_id) {
		ModelAndView mav = new ModelAndView();

		SalesOrder salesorder = salesOrderService.deleteSalesOrderOrderLines(salesorder_id, related_orderlines_id);

		mav.addObject("salesorder_id", salesorder_id);
		mav.addObject("salesorder", salesorder);
		mav.setViewName("salesorder/viewSalesOrder.jsp");

		return mav;
	}
}