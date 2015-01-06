package ecom.service;

import ecom.dao.CustomerDAO;

import ecom.domain.Customer;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Customer entities
 * 
 */

@Service("CustomerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

	/**
	 * DAO injected by Spring that manages Customer entities
	 * 
	 */
	@Autowired
	private CustomerDAO customerDAO;

	/**
	 * Instantiates a new CustomerServiceImpl.
	 *
	 */
	public CustomerServiceImpl() {
	}

	/**
	 * Delete an existing Customer entity
	 * 
	 */
	@Transactional
	public void deleteCustomer(Customer customer) {
		customerDAO.remove(customer);
		customerDAO.flush();
	}

	/**
	 * Return all Customer entity
	 * 
	 */
	@Transactional
	public List<Customer> findAllCustomers(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Customer>(customerDAO.findAllCustomers(startResult, maxRows));
	}

	/**
	 * Load an existing Customer entity
	 * 
	 */
	@Transactional
	public Set<Customer> loadCustomers() {
		return customerDAO.findAllCustomers();
	}

	/**
	 */
	@Transactional
	public Customer findCustomerByPrimaryKey(Integer id) {
		return customerDAO.findCustomerByPrimaryKey(id);
	}

	/**
	 * Return a count of all Customer entity
	 * 
	 */
	@Transactional
	public Integer countCustomers() {
		return ((Long) customerDAO.createQuerySingleResult("select count(o) from Customer o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Customer entity
	 * 
	 */
	@Transactional
	public void saveCustomer(Customer customer) {
		Customer existingCustomer = customerDAO.findCustomerByPrimaryKey(customer.getId());

		if (existingCustomer != null) {
			if (existingCustomer != customer) {
				existingCustomer.setId(customer.getId());
				existingCustomer.setFirstName(customer.getFirstName());
				existingCustomer.setLastName(customer.getLastName());
				existingCustomer.setStreet(customer.getStreet());
				existingCustomer.setCity(customer.getCity());
				existingCustomer.setState(customer.getState());
				existingCustomer.setZip(customer.getZip());
			}
			customer = customerDAO.store(existingCustomer);
		} else {
			customer = customerDAO.store(customer);
		}
		customerDAO.flush();
	}
}
