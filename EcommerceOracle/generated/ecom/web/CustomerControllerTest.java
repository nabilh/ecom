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
 * Unit test for the <code>CustomerController</code> controller.
 *
 * @see ecom.web.CustomerController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/EcommerceOracle-security-context.xml",
		"file:./resources/EcommerceOracle-service-context.xml",
		"file:./resources/EcommerceOracle-dao-context.xml",
		"file:./resources/EcommerceOracle-web-context.xml" })
public class CustomerControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexCustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexCustomer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerController controller = (CustomerController) context.getBean("CustomerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCustomer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerController controller = (CustomerController) context.getBean("CustomerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCustomer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerController controller = (CustomerController) context.getBean("CustomerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCustomer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerController controller = (CustomerController) context.getBean("CustomerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCustomer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerController controller = (CustomerController) context.getBean("CustomerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCustomer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerController controller = (CustomerController) context.getBean("CustomerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCustomer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCustomer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCustomer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerController controller = (CustomerController) context.getBean("CustomerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>customerControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcustomerControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/customerController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CustomerController controller = (CustomerController) context.getBean("CustomerController");

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