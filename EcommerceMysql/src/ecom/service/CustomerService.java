package ecom.service;

import ecom.domain.Customer;
import ecom.domain.SalesOrder;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Customer entities
 * 
 */
public interface CustomerService {

	/**
	 */
	public Customer findCustomerByPrimaryKey(Integer id);

	/**
	 * Save an existing Customer entity
	 * 
	 */
	public void saveCustomer(Customer customer);

	/**
	 * Return a count of all Customer entity
	 * 
	 */
	public Integer countCustomers();

	/**
	 * Return all Customer entity
	 * 
	 */
	public List<Customer> findAllCustomers(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing SalesOrder entity
	 * 
	 */
	public Customer deleteCustomerSalesOrders(Integer customer_id, Integer related_salesorders_id);

	/**
	 * Delete an existing Customer entity
	 * 
	 */
	public void deleteCustomer(Customer customer_1);

	/**
	 * Save an existing SalesOrder entity
	 * 
	 */
	public Customer saveCustomerSalesOrders(Integer id_1, SalesOrder related_salesorders);

	/**
	 * Load an existing Customer entity
	 * 
	 */
	public Set<Customer> loadCustomers();
}