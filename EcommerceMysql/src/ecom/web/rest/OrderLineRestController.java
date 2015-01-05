package ecom.web.rest;

import ecom.dao.OrderLineDAO;
import ecom.dao.ProductDAO;
import ecom.dao.SalesOrderDAO;

import ecom.domain.OrderLine;
import ecom.domain.Product;
import ecom.domain.SalesOrder;

import ecom.service.OrderLineService;

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
 * Spring Rest controller that handles CRUD requests for OrderLine entities
 * 
 */

@Controller("OrderLineRestController")
public class OrderLineRestController {

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
	 * DAO injected by Spring that manages SalesOrder entities
	 * 
	 */
	@Autowired
	private SalesOrderDAO salesOrderDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for OrderLine entities
	 * 
	 */
	@Autowired
	private OrderLineService orderLineService;

	/**
	 * Save an existing Product entity
	 * 
	 */
	@RequestMapping(value = "/OrderLine/{orderline_id}/product", method = RequestMethod.PUT)
	@ResponseBody
	public Product saveOrderLineProduct(@PathVariable Integer orderline_id, @RequestBody Product product) {
		orderLineService.saveOrderLineProduct(orderline_id, product);
		return productDAO.findProductByPrimaryKey(product.getId());
	}

	/**
	 * Delete an existing OrderLine entity
	 * 
	 */
	@RequestMapping(value = "/OrderLine/{orderline_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrderLine(@PathVariable Integer orderline_id) {
		OrderLine orderline = orderLineDAO.findOrderLineByPrimaryKey(orderline_id);
		orderLineService.deleteOrderLine(orderline);
	}

	/**
	 * Create a new SalesOrder entity
	 * 
	 */
	@RequestMapping(value = "/OrderLine/{orderline_id}/salesOrder", method = RequestMethod.POST)
	@ResponseBody
	public SalesOrder newOrderLineSalesOrder(@PathVariable Integer orderline_id, @RequestBody SalesOrder salesorder) {
		orderLineService.saveOrderLineSalesOrder(orderline_id, salesorder);
		return salesOrderDAO.findSalesOrderByPrimaryKey(salesorder.getId());
	}

	/**
	 * View an existing Product entity
	 * 
	 */
	@RequestMapping(value = "/OrderLine/{orderline_id}/product/{product_id}", method = RequestMethod.GET)
	@ResponseBody
	public Product loadOrderLineProduct(@PathVariable Integer orderline_id, @PathVariable Integer related_product_id) {
		Product product = productDAO.findProductByPrimaryKey(related_product_id, -1, -1);

		return product;
	}

	/**
	 * Save an existing OrderLine entity
	 * 
	 */
	@RequestMapping(value = "/OrderLine", method = RequestMethod.PUT)
	@ResponseBody
	public OrderLine saveOrderLine(@RequestBody OrderLine orderline) {
		orderLineService.saveOrderLine(orderline);
		return orderLineDAO.findOrderLineByPrimaryKey(orderline.getId());
	}

	/**
	 * Save an existing SalesOrder entity
	 * 
	 */
	@RequestMapping(value = "/OrderLine/{orderline_id}/salesOrder", method = RequestMethod.PUT)
	@ResponseBody
	public SalesOrder saveOrderLineSalesOrder(@PathVariable Integer orderline_id, @RequestBody SalesOrder salesorder) {
		orderLineService.saveOrderLineSalesOrder(orderline_id, salesorder);
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
	 * Show all OrderLine entities
	 * 
	 */
	@RequestMapping(value = "/OrderLine", method = RequestMethod.GET)
	@ResponseBody
	public List<OrderLine> listOrderLines() {
		return new java.util.ArrayList<OrderLine>(orderLineService.loadOrderLines());
	}

	/**
	 * Create a new OrderLine entity
	 * 
	 */
	@RequestMapping(value = "/OrderLine", method = RequestMethod.POST)
	@ResponseBody
	public OrderLine newOrderLine(@RequestBody OrderLine orderline) {
		orderLineService.saveOrderLine(orderline);
		return orderLineDAO.findOrderLineByPrimaryKey(orderline.getId());
	}

	/**
	 * Delete an existing Product entity
	 * 
	 */
	@RequestMapping(value = "/OrderLine/{orderline_id}/product/{product_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrderLineProduct(@PathVariable Integer orderline_id, @PathVariable Integer related_product_id) {
		orderLineService.deleteOrderLineProduct(orderline_id, related_product_id);
	}

	/**
	 * Get SalesOrder entity by OrderLine
	 * 
	 */
	@RequestMapping(value = "/OrderLine/{orderline_id}/salesOrder", method = RequestMethod.GET)
	@ResponseBody
	public SalesOrder getOrderLineSalesOrder(@PathVariable Integer orderline_id) {
		return orderLineDAO.findOrderLineByPrimaryKey(orderline_id).getSalesOrder();
	}

	/**
	 * Create a new Product entity
	 * 
	 */
	@RequestMapping(value = "/OrderLine/{orderline_id}/product", method = RequestMethod.POST)
	@ResponseBody
	public Product newOrderLineProduct(@PathVariable Integer orderline_id, @RequestBody Product product) {
		orderLineService.saveOrderLineProduct(orderline_id, product);
		return productDAO.findProductByPrimaryKey(product.getId());
	}

	/**
	 * Delete an existing SalesOrder entity
	 * 
	 */
	@RequestMapping(value = "/OrderLine/{orderline_id}/salesOrder/{salesorder_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrderLineSalesOrder(@PathVariable Integer orderline_id, @PathVariable Integer related_salesorder_id) {
		orderLineService.deleteOrderLineSalesOrder(orderline_id, related_salesorder_id);
	}

	/**
	 * View an existing SalesOrder entity
	 * 
	 */
	@RequestMapping(value = "/OrderLine/{orderline_id}/salesOrder/{salesorder_id}", method = RequestMethod.GET)
	@ResponseBody
	public SalesOrder loadOrderLineSalesOrder(@PathVariable Integer orderline_id, @PathVariable Integer related_salesorder_id) {
		SalesOrder salesorder = salesOrderDAO.findSalesOrderByPrimaryKey(related_salesorder_id, -1, -1);

		return salesorder;
	}

	/**
	 * Get Product entity by OrderLine
	 * 
	 */
	@RequestMapping(value = "/OrderLine/{orderline_id}/product", method = RequestMethod.GET)
	@ResponseBody
	public Product getOrderLineProduct(@PathVariable Integer orderline_id) {
		return orderLineDAO.findOrderLineByPrimaryKey(orderline_id).getProduct();
	}

	/**
	 * Select an existing OrderLine entity
	 * 
	 */
	@RequestMapping(value = "/OrderLine/{orderline_id}", method = RequestMethod.GET)
	@ResponseBody
	public OrderLine loadOrderLine(@PathVariable Integer orderline_id) {
		return orderLineDAO.findOrderLineByPrimaryKey(orderline_id);
	}
}