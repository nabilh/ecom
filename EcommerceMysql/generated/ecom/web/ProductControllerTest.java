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
 * Unit test for the <code>ProductController</code> controller.
 *
 * @see ecom.web.ProductController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/EcommerceMysql-security-context.xml",
		"file:./resources/EcommerceMysql-service-context.xml",
		"file:./resources/EcommerceMysql-dao-context.xml",
		"file:./resources/EcommerceMysql-web-context.xml" })
public class ProductControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProductOrderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductOrderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductOrderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductOrderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductOrderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductOrderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductOrderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductOrderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductOrderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductOrderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductOrderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductOrderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductOrderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductOrderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductOrderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductOrderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductOrderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductOrderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductOrderLines()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductOrderLines() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductOrderLines");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>productControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetproductControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/productController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

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