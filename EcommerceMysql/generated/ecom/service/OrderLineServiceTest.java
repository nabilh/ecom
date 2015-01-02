package ecom.service;

import ecom.domain.OrderLine;
import ecom.domain.Product;
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
public class OrderLineServiceTest {

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
	protected OrderLineService service;

	/**
	 * Instantiates a new OrderLineServiceTest.
	 *
	 */
	public OrderLineServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing OrderLine entity
	 * 
	 */
	@Test
	public void deleteOrderLine() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderLine 
		OrderLine orderline = new ecom.domain.OrderLine();
		service.deleteOrderLine(orderline);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findOrderLineByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findOrderLineByPrimaryKey 
		Integer id = 0;
		OrderLine response = null;
		response = service.findOrderLineByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findOrderLineByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Product entity
	 * 
	 */
	@Test
	public void saveOrderLineProduct() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderLineProduct 
		Integer id_1 = 0;
		Product related_product = new ecom.domain.Product();
		OrderLine response = null;
		response = service.saveOrderLineProduct(id_1, related_product);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOrderLineProduct
	}

	/**
	 * Operation Unit Test
	 * Save an existing SalesOrder entity
	 * 
	 */
	@Test
	public void saveOrderLineSalesOrder() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderLineSalesOrder 
		Integer id_2 = 0;
		SalesOrder related_salesorder = new ecom.domain.SalesOrder();
		OrderLine response = null;
		response = service.saveOrderLineSalesOrder(id_2, related_salesorder);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOrderLineSalesOrder
	}

	/**
	 * Operation Unit Test
	 * Return all OrderLine entity
	 * 
	 */
	@Test
	public void findAllOrderLines() {
		// TODO: JUnit - Populate test inputs for operation: findAllOrderLines 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<OrderLine> response = null;
		response = service.findAllOrderLines(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllOrderLines
	}

	/**
	 * Operation Unit Test
	 * Load an existing OrderLine entity
	 * 
	 */
	@Test
	public void loadOrderLines() {
		Set<OrderLine> response = null;
		response = service.loadOrderLines();
		// TODO: JUnit - Add assertions to test outputs of operation: loadOrderLines
	}

	/**
	 * Operation Unit Test
	 * Delete an existing SalesOrder entity
	 * 
	 */
	@Test
	public void deleteOrderLineSalesOrder() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderLineSalesOrder 
		Integer orderline_id = 0;
		Integer related_salesorder_id = 0;
		OrderLine response = null;
		response = service.deleteOrderLineSalesOrder(orderline_id, related_salesorder_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOrderLineSalesOrder
	}

	/**
	 * Operation Unit Test
	 * Return a count of all OrderLine entity
	 * 
	 */
	@Test
	public void countOrderLines() {
		Integer response = null;
		response = service.countOrderLines();
		// TODO: JUnit - Add assertions to test outputs of operation: countOrderLines
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Product entity
	 * 
	 */
	@Test
	public void deleteOrderLineProduct() {
		// TODO: JUnit - Populate test inputs for operation: deleteOrderLineProduct 
		Integer orderline_id_1 = 0;
		Integer related_product_id = 0;
		OrderLine response = null;
		response = service.deleteOrderLineProduct(orderline_id_1, related_product_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOrderLineProduct
	}

	/**
	 * Operation Unit Test
	 * Save an existing OrderLine entity
	 * 
	 */
	@Test
	public void saveOrderLine() {
		// TODO: JUnit - Populate test inputs for operation: saveOrderLine 
		OrderLine orderline_1 = new ecom.domain.OrderLine();
		service.saveOrderLine(orderline_1);
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
