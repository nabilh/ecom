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
 * Unit test for the <code>SalesOrderRestController</code> controller.
 *
 * @see ecom.web.rest.SalesOrderRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/EcommerceMysql-security-context.xml",
		"file:./resources/EcommerceMysql-service-context.xml",
		"file:./resources/EcommerceMysql-dao-context.xml",
		"file:./resources/EcommerceMysql-web-context.xml" })
public class SalesOrderRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>SalesOrdersalesorder_idcustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetSalesOrdersalesorder_idcustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/SalesOrder/{salesorder_id}/customer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderRestController controller = (SalesOrderRestController) context.getBean("SalesOrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>SalesOrdersalesorder_idcustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostSalesOrdersalesorder_idcustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/SalesOrder/{salesorder_id}/customer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderRestController controller = (SalesOrderRestController) context.getBean("SalesOrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>SalesOrdersalesorder_idcustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutSalesOrdersalesorder_idcustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/SalesOrder/{salesorder_id}/customer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderRestController controller = (SalesOrderRestController) context.getBean("SalesOrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>SalesOrdersalesorder_idcustomercustomer_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteSalesOrdersalesorder_idcustomercustomer_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/SalesOrder/{salesorder_id}/customer/{customer_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderRestController controller = (SalesOrderRestController) context.getBean("SalesOrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>SalesOrdersalesorder_idcustomercustomer_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetSalesOrdersalesorder_idcustomercustomer_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/SalesOrder/{salesorder_id}/customer/{customer_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderRestController controller = (SalesOrderRestController) context.getBean("SalesOrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>SalesOrdersalesorder_idorderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetSalesOrdersalesorder_idorderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/SalesOrder/{salesorder_id}/orderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderRestController controller = (SalesOrderRestController) context.getBean("SalesOrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>SalesOrdersalesorder_idorderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostSalesOrdersalesorder_idorderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/SalesOrder/{salesorder_id}/orderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderRestController controller = (SalesOrderRestController) context.getBean("SalesOrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>SalesOrdersalesorder_idorderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutSalesOrdersalesorder_idorderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/SalesOrder/{salesorder_id}/orderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderRestController controller = (SalesOrderRestController) context.getBean("SalesOrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>SalesOrdersalesorder_idorderLinesorderline_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteSalesOrdersalesorder_idorderLinesorderline_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/SalesOrder/{salesorder_id}/orderLines/{orderline_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderRestController controller = (SalesOrderRestController) context.getBean("SalesOrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>SalesOrdersalesorder_idorderLinesorderline_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetSalesOrdersalesorder_idorderLinesorderline_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/SalesOrder/{salesorder_id}/orderLines/{orderline_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderRestController controller = (SalesOrderRestController) context.getBean("SalesOrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>SalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/SalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderRestController controller = (SalesOrderRestController) context.getBean("SalesOrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>SalesOrdersalesorder_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetSalesOrdersalesorder_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/SalesOrder/{salesorder_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderRestController controller = (SalesOrderRestController) context.getBean("SalesOrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>SalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/SalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderRestController controller = (SalesOrderRestController) context.getBean("SalesOrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>SalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/SalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderRestController controller = (SalesOrderRestController) context.getBean("SalesOrderRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>SalesOrdersalesorder_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteSalesOrdersalesorder_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/SalesOrder/{salesorder_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderRestController controller = (SalesOrderRestController) context.getBean("SalesOrderRestController");

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