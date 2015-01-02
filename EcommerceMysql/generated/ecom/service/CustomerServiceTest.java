package ecom.service;

import ecom.domain.Customer;
import ecom.domain.SalesOrder;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./resources/EcommerceMysql-security-context.xml",
		"file:./resources/EcommerceMysql-service-context.xml",
		"file:./resources/EcommerceMysql-dao-context.xml",
		"file:./resources/EcommerceMysql-web-context.xml" })
@Transactional
public class CustomerServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected CustomerService service;

	/**
	 * Instantiates a new CustomerServiceTest.
	 *
	 */
	public CustomerServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findCustomerByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findCustomerByPrimaryKey 
		Integer id = 0;
		Customer response = null;
		response = service.findCustomerByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findCustomerByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Customer entity
	 * 
	 */
	@Test
	public void saveCustomer() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomer 
		Customer customer = new ecom.domain.Customer();
		service.saveCustomer(customer);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Customer entity
	 * 
	 */
	@Test
	public void countCustomers() {
		Integer response = null;
		response = service.countCustomers();
		// TODO: JUnit - Add assertions to test outputs of operation: countCustomers
	}

	/**
	 * Operation Unit Test
	 * Return all Customer entity
	 * 
	 */
	@Test
	public void findAllCustomers() {
		// TODO: JUnit - Populate test inputs for operation: findAllCustomers 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Customer> response = null;
		response = service.findAllCustomers(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllCustomers
	}

	/**
	 * Operation Unit Test
	 * Delete an existing SalesOrder entity
	 * 
	 */
	@Test
	public void deleteCustomerSalesOrders() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomerSalesOrders 
		Integer customer_id = 0;
		Integer related_salesorders_id = 0;
		Customer response = null;
		response = service.deleteCustomerSalesOrders(customer_id, related_salesorders_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCustomerSalesOrders
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Customer entity
	 * 
	 */
	@Test
	public void deleteCustomer() {
		// TODO: JUnit - Populate test inputs for operation: deleteCustomer 
		Customer customer_1 = new ecom.domain.Customer();
		service.deleteCustomer(customer_1);
	}

	/**
	 * Operation Unit Test
	 * Save an existing SalesOrder entity
	 * 
	 */
	@Test
	public void saveCustomerSalesOrders() {
		// TODO: JUnit - Populate test inputs for operation: saveCustomerSalesOrders 
		Integer id_1 = 0;
		SalesOrder related_salesorders = new ecom.domain.SalesOrder();
		Customer response = null;
		response = service.saveCustomerSalesOrders(id_1, related_salesorders);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCustomerSalesOrders
	}

	/**
	 * Operation Unit Test
	 * Load an existing Customer entity
	 * 
	 */
	@Test
	public void loadCustomers() {
		Set<Customer> response = null;
		response = service.loadCustomers();
		// TODO: JUnit - Add assertions to test outputs of operation: loadCustomers
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
