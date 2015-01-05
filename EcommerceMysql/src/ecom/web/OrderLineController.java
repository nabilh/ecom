package ecom.web;

import ecom.dao.OrderLineDAO;
import ecom.dao.ProductDAO;
import ecom.dao.SalesOrderDAO;

import ecom.domain.OrderLine;
import ecom.domain.Product;
import ecom.domain.SalesOrder;

import ecom.service.OrderLineService;

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
 * Spring MVC controller that handles CRUD requests for OrderLine entities
 * 
 */

@Controller("OrderLineController")
public class OrderLineController {

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
	 * Select the child SalesOrder entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderLineSalesOrder")
	public ModelAndView confirmDeleteOrderLineSalesOrder(@RequestParam Integer orderline_id, @RequestParam Integer related_salesorder_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salesorder", salesOrderDAO.findSalesOrderByPrimaryKey(related_salesorder_id));
		mav.addObject("orderline_id", orderline_id);
		mav.setViewName("orderline/salesorder/deleteSalesOrder.jsp");

		return mav;
	}

	/**
	 * Create a new SalesOrder entity
	 * 
	 */
	@RequestMapping("/newOrderLineSalesOrder")
	public ModelAndView newOrderLineSalesOrder(@RequestParam Integer orderline_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("orderline_id", orderline_id);
		mav.addObject("salesorder", new SalesOrder());
		mav.addObject("newFlag", true);
		mav.setViewName("orderline/salesorder/editSalesOrder.jsp");

		return mav;
	}

	/**
	 * Select an existing OrderLine entity
	 * 
	 */
	@RequestMapping("/selectOrderLine")
	public ModelAndView selectOrderLine(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderline", orderLineDAO.findOrderLineByPrimaryKey(idKey));
		mav.setViewName("orderline/viewOrderLine.jsp");

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
	 * View an existing SalesOrder entity
	 * 
	 */
	@RequestMapping("/selectOrderLineSalesOrder")
	public ModelAndView selectOrderLineSalesOrder(@RequestParam Integer orderline_id, @RequestParam Integer salesorder_id) {
		SalesOrder salesorder = salesOrderDAO.findSalesOrderByPrimaryKey(salesorder_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderline_id", orderline_id);
		mav.addObject("salesorder", salesorder);
		mav.setViewName("orderline/salesorder/viewSalesOrder.jsp");

		return mav;
	}

	/**
	 * Create a new Product entity
	 * 
	 */
	@RequestMapping("/newOrderLineProduct")
	public ModelAndView newOrderLineProduct(@RequestParam Integer orderline_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("orderline_id", orderline_id);
		mav.addObject("product", new Product());
		mav.addObject("newFlag", true);
		mav.setViewName("orderline/product/editProduct.jsp");

		return mav;
	}

	/**
	 * Show all Product entities by OrderLine
	 * 
	 */
	@RequestMapping("/listOrderLineProduct")
	public ModelAndView listOrderLineProduct(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderline", orderLineDAO.findOrderLineByPrimaryKey(idKey));
		mav.setViewName("orderline/product/listProduct.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/orderlineController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing OrderLine entity
	 * 
	 */
	@RequestMapping("/editOrderLine")
	public ModelAndView editOrderLine(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderline", orderLineDAO.findOrderLineByPrimaryKey(idKey));
		mav.setViewName("orderline/editOrderLine.jsp");

		return mav;
	}

	/**
	 * Entry point to show all OrderLine entities
	 * 
	 */
	public String indexOrderLine() {
		return "redirect:/indexOrderLine";
	}

	/**
	 * Delete an existing SalesOrder entity
	 * 
	 */
	@RequestMapping("/deleteOrderLineSalesOrder")
	public ModelAndView deleteOrderLineSalesOrder(@RequestParam Integer orderline_id, @RequestParam Integer related_salesorder_id) {
		ModelAndView mav = new ModelAndView();

		OrderLine orderline = orderLineService.deleteOrderLineSalesOrder(orderline_id, related_salesorder_id);

		mav.addObject("orderline_id", orderline_id);
		mav.addObject("orderline", orderline);
		mav.setViewName("orderline/viewOrderLine.jsp");

		return mav;
	}

	/**
	 * Show all OrderLine entities
	 * 
	 */
	@RequestMapping("/indexOrderLine")
	public ModelAndView listOrderLines() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderlines", orderLineService.loadOrderLines());

		mav.setViewName("orderline/listOrderLines.jsp");

		return mav;
	}

	/**
	 * Edit an existing SalesOrder entity
	 * 
	 */
	@RequestMapping("/editOrderLineSalesOrder")
	public ModelAndView editOrderLineSalesOrder(@RequestParam Integer orderline_id, @RequestParam Integer salesorder_id) {
		SalesOrder salesorder = salesOrderDAO.findSalesOrderByPrimaryKey(salesorder_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderline_id", orderline_id);
		mav.addObject("salesorder", salesorder);
		mav.setViewName("orderline/salesorder/editSalesOrder.jsp");

		return mav;
	}

	/**
	 * Select the OrderLine entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderLine")
	public ModelAndView confirmDeleteOrderLine(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderline", orderLineDAO.findOrderLineByPrimaryKey(idKey));
		mav.setViewName("orderline/deleteOrderLine.jsp");

		return mav;
	}

	/**
	 * Create a new OrderLine entity
	 * 
	 */
	@RequestMapping("/newOrderLine")
	public ModelAndView newOrderLine() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderline", new OrderLine());
		mav.addObject("newFlag", true);
		mav.setViewName("orderline/editOrderLine.jsp");

		return mav;
	}

	/**
	 * View an existing Product entity
	 * 
	 */
	@RequestMapping("/selectOrderLineProduct")
	public ModelAndView selectOrderLineProduct(@RequestParam Integer orderline_id, @RequestParam Integer product_id) {
		Product product = productDAO.findProductByPrimaryKey(product_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderline_id", orderline_id);
		mav.addObject("product", product);
		mav.setViewName("orderline/product/viewProduct.jsp");

		return mav;
	}

	/**
	 * Show all SalesOrder entities by OrderLine
	 * 
	 */
	@RequestMapping("/listOrderLineSalesOrder")
	public ModelAndView listOrderLineSalesOrder(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderline", orderLineDAO.findOrderLineByPrimaryKey(idKey));
		mav.setViewName("orderline/salesorder/listSalesOrder.jsp");

		return mav;
	}

	/**
	 * Delete an existing OrderLine entity
	 * 
	 */
	@RequestMapping("/deleteOrderLine")
	public String deleteOrderLine(@RequestParam Integer idKey) {
		OrderLine orderline = orderLineDAO.findOrderLineByPrimaryKey(idKey);
		orderLineService.deleteOrderLine(orderline);
		return "forward:/indexOrderLine";
	}

	/**
	 * Save an existing Product entity
	 * 
	 */
	@RequestMapping("/saveOrderLineProduct")
	public ModelAndView saveOrderLineProduct(@RequestParam Integer orderline_id, @ModelAttribute Product product) {
		OrderLine parent_orderline = orderLineService.saveOrderLineProduct(orderline_id, product);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderline_id", orderline_id);
		mav.addObject("orderline", parent_orderline);
		mav.setViewName("orderline/viewOrderLine.jsp");

		return mav;
	}

	/**
	 * Select the child Product entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderLineProduct")
	public ModelAndView confirmDeleteOrderLineProduct(@RequestParam Integer orderline_id, @RequestParam Integer related_product_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(related_product_id));
		mav.addObject("orderline_id", orderline_id);
		mav.setViewName("orderline/product/deleteProduct.jsp");

		return mav;
	}

	/**
	 * Save an existing SalesOrder entity
	 * 
	 */
	@RequestMapping("/saveOrderLineSalesOrder")
	public ModelAndView saveOrderLineSalesOrder(@RequestParam Integer orderline_id, @ModelAttribute SalesOrder salesorder) {
		OrderLine parent_orderline = orderLineService.saveOrderLineSalesOrder(orderline_id, salesorder);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderline_id", orderline_id);
		mav.addObject("orderline", parent_orderline);
		mav.setViewName("orderline/viewOrderLine.jsp");

		return mav;
	}

	/**
	 * Edit an existing Product entity
	 * 
	 */
	@RequestMapping("/editOrderLineProduct")
	public ModelAndView editOrderLineProduct(@RequestParam Integer orderline_id, @RequestParam Integer product_id) {
		Product product = productDAO.findProductByPrimaryKey(product_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderline_id", orderline_id);
		mav.addObject("product", product);
		mav.setViewName("orderline/product/editProduct.jsp");

		return mav;
	}

	/**
	 * Delete an existing Product entity
	 * 
	 */
	@RequestMapping("/deleteOrderLineProduct")
	public ModelAndView deleteOrderLineProduct(@RequestParam Integer orderline_id, @RequestParam Integer related_product_id) {
		ModelAndView mav = new ModelAndView();

		OrderLine orderline = orderLineService.deleteOrderLineProduct(orderline_id, related_product_id);

		mav.addObject("orderline_id", orderline_id);
		mav.addObject("orderline", orderline);
		mav.setViewName("orderline/viewOrderLine.jsp");

		return mav;
	}

	/**
	 * Save an existing OrderLine entity
	 * 
	 */
	@RequestMapping("/saveOrderLine")
	public String saveOrderLine(@ModelAttribute OrderLine orderline) {
		orderLineService.saveOrderLine(orderline);
		return "forward:/indexOrderLine";
	}
}