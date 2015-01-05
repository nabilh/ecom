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
 * Unit test for the <code>ProductRestController</code> controller.
 *
 * @see ecom.web.rest.ProductRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/EcommerceMysql-security-context.xml",
		"file:./resources/EcommerceMysql-service-context.xml",
		"file:./resources/EcommerceMysql-dao-context.xml",
		"file:./resources/EcommerceMysql-web-context.xml" })
public class ProductRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Productproduct_idorderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductproduct_idorderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_id}/orderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_idorderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProductproduct_idorderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_id}/orderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_idorderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProductproduct_idorderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_id}/orderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_idorderLinesorderline_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductproduct_idorderLinesorderline_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_id}/orderLines/{orderline_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_idorderLinesorderline_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductproduct_idorderLinesorderline_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_id}/orderLines/{orderline_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Product()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProductproduct_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Product()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Product()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Productproduct_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProductproduct_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Product/{product_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductRestController controller = (ProductRestController) context.getBean("ProductRestController");

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