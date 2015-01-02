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
 * Unit test for the <code>OrderLineController</code> controller.
 *
 * @see ecom.web.OrderLineController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/EcommerceMysql-security-context.xml",
		"file:./resources/EcommerceMysql-service-context.xml",
		"file:./resources/EcommerceMysql-dao-context.xml",
		"file:./resources/EcommerceMysql-web-context.xml" })
public class OrderLineControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editOrderLineSalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderLineSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderLineSalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderLineSalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderLineSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderLineSalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderLineSalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderLineSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderLineSalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderLineSalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderLineSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderLineSalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderLineSalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderLineSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderLineSalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderLineSalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderLineSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderLineSalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderLineSalesOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderLineSalesOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderLineSalesOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrderLineProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderLineProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderLineProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderLineProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderLineProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderLineProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderLineProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderLineProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderLineProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderLineProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderLineProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderLineProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderLineProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderLineProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderLineProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderLineProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderLineProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderLineProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderLineProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderLineProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderLineProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexOrderLine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOrderLine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOrderLine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderLine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderLine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderLine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrderLine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderLine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderLine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderLine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderLine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderLine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderLine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderLine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderLine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderLine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderLine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderLine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderLine()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderLine() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderLine");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>orderlineControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetorderlineControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/orderlineController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderLineController controller = (OrderLineController) context.getBean("OrderLineController");

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