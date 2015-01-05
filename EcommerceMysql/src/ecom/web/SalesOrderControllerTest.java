package ecom.web;

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
 * Unit test for the <code>SalesOrderController</code> controller.
 *
 * @see ecom.web.SalesOrderController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/EcommerceMysql-security-context.xml",
		"file:./resources/EcommerceMysql-service-context.xml",
		"file:./resources/EcommerceMysql-dao-context.xml",
		"file:./resources/EcommerceMysql-web-context.xml" })
public class SalesOrderControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editSalesOrderCustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditSalesOrderCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editSalesOrderCustomer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newSalesOrderCustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewSalesOrderCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newSalesOrderCustomer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveSalesOrderCustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveSalesOrderCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveSalesOrderCustomer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteSalesOrderCustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteSalesOrderCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteSalesOrderCustomer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteSalesOrderCustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteSalesOrderCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteSalesOrderCustomer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectSalesOrderCustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectSalesOrderCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectSalesOrderCustomer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listSalesOrderCustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistSalesOrderCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listSalesOrderCustomer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editSalesOrderOrderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditSalesOrderOrderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editSalesOrderOrderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newSalesOrderOrderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewSalesOrderOrderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newSalesOrderOrderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveSalesOrderOrderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveSalesOrderOrderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveSalesOrderOrderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteSalesOrderOrderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteSalesOrderOrderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteSalesOrderOrderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteSalesOrderOrderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteSalesOrderOrderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteSalesOrderOrderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectSalesOrderOrderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectSalesOrderOrderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectSalesOrderOrderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listSalesOrderOrderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistSalesOrderOrderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listSalesOrderOrderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexSalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexSalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectSalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectSalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editSalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editSalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveSalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveSalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newSalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newSalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteSalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteSalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteSalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteSalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>salesorderControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsalesorderControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/salesorderController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalesOrderController controller = (SalesOrderController) context.getBean("SalesOrderController");

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