package ecom.web.rest;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>CustomerRestController</code> controller.
 *
 * @see ecom.web.rest.CustomerRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/EcommerceMysql-security-context.xml",
		"file:./resources/EcommerceMysql-service-context.xml",
		"file:./resources/EcommerceMysql-dao-context.xml",
		"file:./resources/EcommerceMysql-web-context.xml" })
public class CustomerRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Customercustomer_idsalesOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCustomercustomer_idsalesOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Customer/{customer_id}/salesOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerRestController controller = (CustomerRestController) context.getBean("CustomerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Customercustomer_idsalesOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostCustomercustomer_idsalesOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Customer/{customer_id}/salesOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerRestController controller = (CustomerRestController) context.getBean("CustomerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Customercustomer_idsalesOrders()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutCustomercustomer_idsalesOrders() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Customer/{customer_id}/salesOrders");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerRestController controller = (CustomerRestController) context.getBean("CustomerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Customercustomer_idsalesOrderssalesorder_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteCustomercustomer_idsalesOrderssalesorder_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Customer/{customer_id}/salesOrders/{salesorder_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerRestController controller = (CustomerRestController) context.getBean("CustomerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Customercustomer_idsalesOrderssalesorder_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCustomercustomer_idsalesOrderssalesorder_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Customer/{customer_id}/salesOrders/{salesorder_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerRestController controller = (CustomerRestController) context.getBean("CustomerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Customer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Customer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerRestController controller = (CustomerRestController) context.getBean("CustomerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Customercustomer_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetCustomercustomer_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Customer/{customer_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerRestController controller = (CustomerRestController) context.getBean("CustomerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Customer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Customer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerRestController controller = (CustomerRestController) context.getBean("CustomerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Customer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Customer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerRestController controller = (CustomerRestController) context.getBean("CustomerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Customercustomer_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteCustomercustomer_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Customer/{customer_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerRestController controller = (CustomerRestController) context.getBean("CustomerRestController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}