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
 * Unit test for the <code>OrderLineRestController</code> controller.
 *
 * @see ecom.web.rest.OrderLineRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/EcommerceMysql-security-context.xml",
		"file:./resources/EcommerceMysql-service-context.xml",
		"file:./resources/EcommerceMysql-dao-context.xml",
		"file:./resources/EcommerceMysql-web-context.xml" })
public class OrderLineRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>OrderLineorderline_idsalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderLineorderline_idsalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderLine/{orderline_id}/salesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineRestController controller = (OrderLineRestController) context.getBean("OrderLineRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderLineorderline_idsalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostOrderLineorderline_idsalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderLine/{orderline_id}/salesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineRestController controller = (OrderLineRestController) context.getBean("OrderLineRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderLineorderline_idsalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutOrderLineorderline_idsalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderLine/{orderline_id}/salesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineRestController controller = (OrderLineRestController) context.getBean("OrderLineRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderLineorderline_idsalesOrdersalesorder_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteOrderLineorderline_idsalesOrdersalesorder_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderLine/{orderline_id}/salesOrder/{salesorder_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineRestController controller = (OrderLineRestController) context.getBean("OrderLineRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderLineorderline_idsalesOrdersalesorder_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderLineorderline_idsalesOrdersalesorder_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderLine/{orderline_id}/salesOrder/{salesorder_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineRestController controller = (OrderLineRestController) context.getBean("OrderLineRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderLineorderline_idproduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderLineorderline_idproduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderLine/{orderline_id}/product");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineRestController controller = (OrderLineRestController) context.getBean("OrderLineRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderLineorderline_idproduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostOrderLineorderline_idproduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderLine/{orderline_id}/product");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineRestController controller = (OrderLineRestController) context.getBean("OrderLineRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderLineorderline_idproduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutOrderLineorderline_idproduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderLine/{orderline_id}/product");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineRestController controller = (OrderLineRestController) context.getBean("OrderLineRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderLineorderline_idproductproduct_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteOrderLineorderline_idproductproduct_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderLine/{orderline_id}/product/{product_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineRestController controller = (OrderLineRestController) context.getBean("OrderLineRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderLineorderline_idproductproduct_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderLineorderline_idproductproduct_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderLine/{orderline_id}/product/{product_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineRestController controller = (OrderLineRestController) context.getBean("OrderLineRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderLine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderLine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderLine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineRestController controller = (OrderLineRestController) context.getBean("OrderLineRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderLineorderline_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetOrderLineorderline_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderLine/{orderline_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineRestController controller = (OrderLineRestController) context.getBean("OrderLineRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderLine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutOrderLine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderLine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineRestController controller = (OrderLineRestController) context.getBean("OrderLineRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderLine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostOrderLine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderLine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineRestController controller = (OrderLineRestController) context.getBean("OrderLineRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>OrderLineorderline_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteOrderLineorderline_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/OrderLine/{orderline_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineRestController controller = (OrderLineRestController) context.getBean("OrderLineRestController");

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