package ecom.service;

import ecom.domain.Customer;
import ecom.domain.OrderLine;
import ecom.domain.SalesOrder;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for SalesOrder entities
 * 
 */
public interface SalesOrderService {

	/**
	 * Save an existing SalesOrder entity
	 * 
	 */
	public void saveSalesOrder(SalesOrder salesorder);

	/**
	 * Delete an existing Customer entity
	 * 
	 */
	public SalesOrder deleteSalesOrderCustomer(Integer salesorder_id, Integer related_customer_id);

	/**
	 * Save an existing Customer entity
	 * 
	 */
	public SalesOrder saveSalesOrderCustomer(Integer id, Customer related_customer);

	/**
	 * Save an existing OrderLine entity
	 * 
	 */
	public SalesOrder saveSalesOrderOrderLines(Integer id_1, OrderLine related_orderlines);

	/**
	 */
	public SalesOrder findSalesOrderByPrimaryKey(Integer id_2);

	/**
	 * Return all SalesOrder entity
	 * 
	 */
	public List<SalesOrder> findAllSalesOrders(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing SalesOrder entity
	 * 
	 */
	public void deleteSalesOrder(SalesOrder salesorder_1);

	/**
	 * Load an existing SalesOrder entity
	 * 
	 */
	public Set<SalesOrder> loadSalesOrders();

	/**
	 * Delete an existing OrderLine entity
	 * 
	 */
	public SalesOrder deleteSalesOrderOrderLines(Integer salesorder_id_1, Integer related_orderlines_id);

	/**
	 * Return a count of all SalesOrder entity
	 * 
	 */
	public Integer countSalesOrders();
}