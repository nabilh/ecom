package ecom.service;

import ecom.domain.Customer;
import ecom.domain.OrderLine;
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
public class SalesOrderServiceTest {

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
	protected SalesOrderService service;

	/**
	 * Instantiates a new SalesOrderServiceTest.
	 *
	 */
	public SalesOrderServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing SalesOrder entity
	 * 
	 */
	@Test
	public void saveSalesOrder() {
		// TODO: JUnit - Populate test inputs for operation: saveSalesOrder 
		SalesOrder salesorder = new ecom.domain.SalesOrder();
		service.saveSalesOrder(salesorder);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Customer entity
	 * 
	 */
	@Test
	public void deleteSalesOrderCustomer() {
		// TODO: JUnit - Populate test inputs for operation: deleteSalesOrderCustomer 
		Integer salesorder_id = 0;
		Integer related_customer_id = 0;
		SalesOrder response = null;
		response = service.deleteSalesOrderCustomer(salesorder_id, related_customer_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteSalesOrderCustomer
	}

	/**
	 * Operation Unit Test
	 * Save an existing Customer entity
	 * 
	 */
	@Test
	public void saveSalesOrderCustomer() {
		// TODO: JUnit - Populate test inputs for operation: saveSalesOrderCustomer 
		Integer id = 0;
		Customer related_customer = new ecom.domain.Customer();
		SalesOrder response = null;
		response = service.saveSalesOrderCustomer(id, related_customer);
		// TODO: JUnit - Add assertions to test outputs of operation: saveSalesOrderCustomer
	}

	/**
	 * Operation Unit Test
	 * Save an existing OrderLine entity
	 * 
	 */
	@Test
	public void saveSalesOrderOrderLines() {
		// TODO: JUnit - Populate test inputs for operation: saveSalesOrderOrderLines 
		Integer id_1 = 0;
		OrderLine related_orderlines = new ecom.domain.OrderLine();
		SalesOrder response = null;
		response = service.saveSalesOrderOrderLines(id_1, related_orderlines);
		// TODO: JUnit - Add assertions to test outputs of operation: saveSalesOrderOrderLines
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findSalesOrderByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findSalesOrderByPrimaryKey 
		Integer id_2 = 0;
		SalesOrder response = null;
		response = service.findSalesOrderByPrimaryKey(id_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findSalesOrderByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return all SalesOrder entity
	 * 
	 */
	@Test
	public void findAllSalesOrders() {
		// TODO: JUnit - Populate test inputs for operation: findAllSalesOrders 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<SalesOrder> response = null;
		response = service.findAllSalesOrders(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllSalesOrders
	}

	/**
	 * Operation Unit Test
	 * Delete an existing SalesOrder entity
	 * 
	 */
	@Test
	public void deleteSalesOrder() {
		// TODO: JUnit - Populate test inputs for operation: deleteSalesOrder 
		SalesOrder salesorder_1 = new ecom.domain.SalesOrder();
		service.deleteSalesOrder(salesorder_1);
	}

	/**
	 * Operation Unit Test
	 * Load an existing SalesOrder entity
	 * 
	 */
	@Test
	public void loadSalesOrders() {
		Set<SalesOrder> response = null;
		response = service.loadSalesOrders();
		// TODO: JUnit - Add assertions to test outputs of operation: loadSalesOrders
	}

	/**
	 * Operation Unit Test
	 * Delete an existing OrderLine entity
	 * 
	 */
	@Test
	public void deleteSalesOrderOrderLines() {
		// TODO: JUnit - Populate test inputs for operation: deleteSalesOrderOrderLines 
		Integer salesorder_id_1 = 0;
		Integer related_orderlines_id = 0;
		SalesOrder response = null;
		response = service.deleteSalesOrderOrderLines(salesorder_id_1, related_orderlines_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteSalesOrderOrderLines
	}

	/**
	 * Operation Unit Test
	 * Return a count of all SalesOrder entity
	 * 
	 */
	@Test
	public void countSalesOrders() {
		Integer response = null;
		response = service.countSalesOrders();
		// TODO: JUnit - Add assertions to test outputs of operation: countSalesOrders
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
