package ecom.service;

import ecom.domain.OrderLine;
import ecom.domain.Product;
import ecom.domain.SalesOrder;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for OrderLine entities
 * 
 */
public interface OrderLineService {

	/**
	 * Delete an existing OrderLine entity
	 * 
	 */
	public void deleteOrderLine(OrderLine orderline);

	/**
	 */
	public OrderLine findOrderLineByPrimaryKey(Integer id);

	/**
	 * Save an existing Product entity
	 * 
	 */
	public OrderLine saveOrderLineProduct(Integer id_1, Product related_product);

	/**
	 * Save an existing SalesOrder entity
	 * 
	 */
	public OrderLine saveOrderLineSalesOrder(Integer id_2, SalesOrder related_salesorder);

	/**
	 * Return all OrderLine entity
	 * 
	 */
	public List<OrderLine> findAllOrderLines(Integer startResult, Integer maxRows);

	/**
	 * Load an existing OrderLine entity
	 * 
	 */
	public Set<OrderLine> loadOrderLines();

	/**
	 * Delete an existing SalesOrder entity
	 * 
	 */
	public OrderLine deleteOrderLineSalesOrder(Integer orderline_id, Integer related_salesorder_id);

	/**
	 * Return a count of all OrderLine entity
	 * 
	 */
	public Integer countOrderLines();

	/**
	 * Delete an existing Product entity
	 * 
	 */
	public OrderLine deleteOrderLineProduct(Integer orderline_id_1, Integer related_product_id);

	/**
	 * Save an existing OrderLine entity
	 * 
	 */
	public void saveOrderLine(OrderLine orderline_1);
}