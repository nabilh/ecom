package apps.service;

import apps.domain.Customer;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Customer entities
 * 
 */
public interface CustomerService {

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
	 */
	public Customer findCustomerByPrimaryKey(Integer customernumber);

	/**
	 * Delete an existing Customer entity
	 * 
	 */
	public void deleteCustomer(Customer customer_1);
}