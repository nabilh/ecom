package apps.service;

import apps.dao.CustomerDAO;

import apps.domain.Customer;

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
	 * Save an existing Customer entity
	 * 
	 */
	@Transactional
	public void saveCustomer(Customer customer) {
		Customer existingCustomer = customerDAO.findCustomerByPrimaryKey(customer.getCustomernumber());

		if (existingCustomer != null) {
			if (existingCustomer != customer) {
				existingCustomer.setCustomernumber(customer.getCustomernumber());
				existingCustomer.setCustomername(customer.getCustomername());
				existingCustomer.setContactlastname(customer.getContactlastname());
				existingCustomer.setContactfirstname(customer.getContactfirstname());
				existingCustomer.setPhone(customer.getPhone());
				existingCustomer.setAddressline1(customer.getAddressline1());
				existingCustomer.setAddressline2(customer.getAddressline2());
				existingCustomer.setCity(customer.getCity());
				existingCustomer.setState(customer.getState());
				existingCustomer.setPostalcode(customer.getPostalcode());
				existingCustomer.setCountry(customer.getCountry());
				existingCustomer.setSalesrepemployeenumber(customer.getSalesrepemployeenumber());
				existingCustomer.setCreditlimit(customer.getCreditlimit());
			}
			customer = customerDAO.store(existingCustomer);
		} else {
			customer = customerDAO.store(customer);
		}
		customerDAO.flush();
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
	 */
	@Transactional
	public Customer findCustomerByPrimaryKey(Integer customernumber) {
		return customerDAO.findCustomerByPrimaryKey(customernumber);
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
}
