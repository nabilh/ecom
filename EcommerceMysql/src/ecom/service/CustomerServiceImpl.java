package ecom.service;

import ecom.dao.CustomerDAO;
import ecom.dao.SalesOrderDAO;

import ecom.domain.Customer;
import ecom.domain.SalesOrder;

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
	 * DAO injected by Spring that manages SalesOrder entities
	 * 
	 */
	@Autowired
	private SalesOrderDAO salesOrderDAO;

	/**
	 * Instantiates a new CustomerServiceImpl.
	 *
	 */
	public CustomerServiceImpl() {
	}

	/**
	 */
	@Transactional
	public Customer findCustomerByPrimaryKey(Integer id) {
		return customerDAO.findCustomerByPrimaryKey(id);
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

	/**
	 * Return a count of all Customer entity
	 * 
	 */
	@Transactional
	public Integer countCustomers() {
		return ((Long) customerDAO.createQuerySingleResult("select count(o) from Customer o").getSingleResult()).intValue();
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
	 * Delete an existing SalesOrder entity
	 * 
	 */
	@Transactional
	public Customer deleteCustomerSalesOrders(Integer customer_id, Integer related_salesorders_id) {
		SalesOrder related_salesorders = salesOrderDAO.findSalesOrderByPrimaryKey(related_salesorders_id, -1, -1);

		Customer customer = customerDAO.findCustomerByPrimaryKey(customer_id, -1, -1);

		related_salesorders.setCustomer(null);
		customer.getSalesOrders().remove(related_salesorders);

		salesOrderDAO.remove(related_salesorders);
		salesOrderDAO.flush();

		return customer;
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
	 * Save an existing SalesOrder entity
	 * 
	 */
	@Transactional
	public Customer saveCustomerSalesOrders(Integer id, SalesOrder related_salesorders) {
		Customer customer = customerDAO.findCustomerByPrimaryKey(id, -1, -1);
		SalesOrder existingsalesOrders = salesOrderDAO.findSalesOrderByPrimaryKey(related_salesorders.getId());

		// copy into the existing record to preserve existing relationships
		if (existingsalesOrders != null) {
			existingsalesOrders.setId(related_salesorders.getId());
			existingsalesOrders.setDateCreated(related_salesorders.getDateCreated());
			related_salesorders = existingsalesOrders;
		} else {
			related_salesorders = salesOrderDAO.store(related_salesorders);
			salesOrderDAO.flush();
		}

		related_salesorders.setCustomer(customer);
		customer.getSalesOrders().add(related_salesorders);
		related_salesorders = salesOrderDAO.store(related_salesorders);
		salesOrderDAO.flush();

		customer = customerDAO.store(customer);
		customerDAO.flush();

		return customer;
	}

	/**
	 * Load an existing Customer entity
	 * 
	 */
	@Transactional
	public Set<Customer> loadCustomers() {
		return customerDAO.findAllCustomers();
	}
}
