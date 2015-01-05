package ecom.service;

import ecom.dao.CustomerDAO;
import ecom.dao.OrderLineDAO;
import ecom.dao.SalesOrderDAO;

import ecom.domain.Customer;
import ecom.domain.OrderLine;
import ecom.domain.SalesOrder;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for SalesOrder entities
 * 
 */

@Service("SalesOrderService")
@Transactional
public class SalesOrderServiceImpl implements SalesOrderService {

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
	 * Instantiates a new SalesOrderServiceImpl.
	 *
	 */
	public SalesOrderServiceImpl() {
	}

	/**
	 * Save an existing SalesOrder entity
	 * 
	 */
	@Transactional
	public void saveSalesOrder(SalesOrder salesorder) {
		SalesOrder existingSalesOrder = salesOrderDAO.findSalesOrderByPrimaryKey(salesorder.getId());

		if (existingSalesOrder != null) {
			if (existingSalesOrder != salesorder) {
				existingSalesOrder.setId(salesorder.getId());
				existingSalesOrder.setDateCreated(salesorder.getDateCreated());
			}
			salesorder = salesOrderDAO.store(existingSalesOrder);
		} else {
			salesorder = salesOrderDAO.store(salesorder);
		}
		salesOrderDAO.flush();
	}

	/**
	 * Delete an existing Customer entity
	 * 
	 */
	@Transactional
	public SalesOrder deleteSalesOrderCustomer(Integer salesorder_id, Integer related_customer_id) {
		SalesOrder salesorder = salesOrderDAO.findSalesOrderByPrimaryKey(salesorder_id, -1, -1);
		Customer related_customer = customerDAO.findCustomerByPrimaryKey(related_customer_id, -1, -1);

		salesorder.setCustomer(null);
		related_customer.getSalesOrders().remove(salesorder);
		salesorder = salesOrderDAO.store(salesorder);
		salesOrderDAO.flush();

		related_customer = customerDAO.store(related_customer);
		customerDAO.flush();

		customerDAO.remove(related_customer);
		customerDAO.flush();

		return salesorder;
	}

	/**
	 * Save an existing Customer entity
	 * 
	 */
	@Transactional
	public SalesOrder saveSalesOrderCustomer(Integer id, Customer related_customer) {
		SalesOrder salesorder = salesOrderDAO.findSalesOrderByPrimaryKey(id, -1, -1);
		Customer existingcustomer = customerDAO.findCustomerByPrimaryKey(related_customer.getId());

		// copy into the existing record to preserve existing relationships
		if (existingcustomer != null) {
			existingcustomer.setId(related_customer.getId());
			existingcustomer.setFirstName(related_customer.getFirstName());
			existingcustomer.setLastName(related_customer.getLastName());
			existingcustomer.setStreet(related_customer.getStreet());
			existingcustomer.setCity(related_customer.getCity());
			existingcustomer.setState(related_customer.getState());
			existingcustomer.setZip(related_customer.getZip());
			related_customer = existingcustomer;
		} else {
			related_customer = customerDAO.store(related_customer);
			customerDAO.flush();
		}

		salesorder.setCustomer(related_customer);
		related_customer.getSalesOrders().add(salesorder);
		salesorder = salesOrderDAO.store(salesorder);
		salesOrderDAO.flush();

		related_customer = customerDAO.store(related_customer);
		customerDAO.flush();

		return salesorder;
	}

	/**
	 * Save an existing OrderLine entity
	 * 
	 */
	@Transactional
	public SalesOrder saveSalesOrderOrderLines(Integer id, OrderLine related_orderlines) {
		SalesOrder salesorder = salesOrderDAO.findSalesOrderByPrimaryKey(id, -1, -1);
		OrderLine existingorderLines = orderLineDAO.findOrderLineByPrimaryKey(related_orderlines.getId());

		// copy into the existing record to preserve existing relationships
		if (existingorderLines != null) {
			existingorderLines.setId(related_orderlines.getId());
			existingorderLines.setQuantity(related_orderlines.getQuantity());
			related_orderlines = existingorderLines;
		} else {
			related_orderlines = orderLineDAO.store(related_orderlines);
			orderLineDAO.flush();
		}

		related_orderlines.setSalesOrder(salesorder);
		salesorder.getOrderLines().add(related_orderlines);
		related_orderlines = orderLineDAO.store(related_orderlines);
		orderLineDAO.flush();

		salesorder = salesOrderDAO.store(salesorder);
		salesOrderDAO.flush();

		return salesorder;
	}

	/**
	 */
	@Transactional
	public SalesOrder findSalesOrderByPrimaryKey(Integer id) {
		return salesOrderDAO.findSalesOrderByPrimaryKey(id);
	}

	/**
	 * Return all SalesOrder entity
	 * 
	 */
	@Transactional
	public List<SalesOrder> findAllSalesOrders(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<SalesOrder>(salesOrderDAO.findAllSalesOrders(startResult, maxRows));
	}

	/**
	 * Delete an existing SalesOrder entity
	 * 
	 */
	@Transactional
	public void deleteSalesOrder(SalesOrder salesorder) {
		salesOrderDAO.remove(salesorder);
		salesOrderDAO.flush();
	}

	/**
	 * Load an existing SalesOrder entity
	 * 
	 */
	@Transactional
	public Set<SalesOrder> loadSalesOrders() {
		return salesOrderDAO.findAllSalesOrders();
	}

	/**
	 * Delete an existing OrderLine entity
	 * 
	 */
	@Transactional
	public SalesOrder deleteSalesOrderOrderLines(Integer salesorder_id, Integer related_orderlines_id) {
		OrderLine related_orderlines = orderLineDAO.findOrderLineByPrimaryKey(related_orderlines_id, -1, -1);

		SalesOrder salesorder = salesOrderDAO.findSalesOrderByPrimaryKey(salesorder_id, -1, -1);

		related_orderlines.setSalesOrder(null);
		salesorder.getOrderLines().remove(related_orderlines);

		orderLineDAO.remove(related_orderlines);
		orderLineDAO.flush();

		return salesorder;
	}

	/**
	 * Return a count of all SalesOrder entity
	 * 
	 */
	@Transactional
	public Integer countSalesOrders() {
		return ((Long) salesOrderDAO.createQuerySingleResult("select count(o) from SalesOrder o").getSingleResult()).intValue();
	}
}
