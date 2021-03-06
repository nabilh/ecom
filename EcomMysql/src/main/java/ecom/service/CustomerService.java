package ecom.service;

import ecom.domain.Customer;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Customer entities
 * 
 */
public interface CustomerService {

	/**
	 * Delete an existing Customer entity
	 * 
	 */
	public void deleteCustomer(Customer customer);

	/**
	 * Return all Customer entity
	 * 
	 */
	public List<Customer> findAllCustomers(Integer startResult, Integer maxRows);

	/**
	 * Load an existing Customer entity
	 * 
	 */
	public Set<Customer> loadCustomers();

	/**
	 */
	public Customer findCustomerByPrimaryKey(Integer id);

	/**
	 * Return a count of all Customer entity
	 * 
	 */
	public Integer countCustomers();

	/**
	 * Save an existing Customer entity
	 * 
	 */
	public void saveCustomer(Customer customer_1);
}