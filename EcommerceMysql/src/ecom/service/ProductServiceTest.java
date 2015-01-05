package ecom.service;

import ecom.domain.OrderLine;
import ecom.domain.Product;

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
public class ProductServiceTest {

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
	protected ProductService service;

	/**
	 * Instantiates a new ProductServiceTest.
	 *
	 */
	public ProductServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing OrderLine entity
	 * 
	 */
	@Test
	public void deleteProductOrderLines() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductOrderLines 
		Integer product_id = 0;
		Integer related_orderlines_id = 0;
		Product response = null;
		response = service.deleteProductOrderLines(product_id, related_orderlines_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductOrderLines
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Product entity
	 * 
	 */
	@Test
	public void deleteProduct() {
		// TODO: JUnit - Populate test inputs for operation: deleteProduct 
		Product product = new ecom.domain.Product();
		service.deleteProduct(product);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Product entity
	 * 
	 */
	@Test
	public void countProducts() {
		Integer response = null;
		response = service.countProducts();
		// TODO: JUnit - Add assertions to test outputs of operation: countProducts
	}

	/**
	 * Operation Unit Test
	 * Load an existing Product entity
	 * 
	 */
	@Test
	public void loadProducts() {
		Set<Product> response = null;
		response = service.loadProducts();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProducts
	}

	/**
	 * Operation Unit Test
	 * Return all Product entity
	 * 
	 */
	@Test
	public void findAllProducts() {
		// TODO: JUnit - Populate test inputs for operation: findAllProducts 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Product> response = null;
		response = service.findAllProducts(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProducts
	}

	/**
	 * Operation Unit Test
	 * Save an existing Product entity
	 * 
	 */
	@Test
	public void saveProduct() {
		// TODO: JUnit - Populate test inputs for operation: saveProduct 
		Product product_1 = new ecom.domain.Product();
		service.saveProduct(product_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProductByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProductByPrimaryKey 
		Integer id = 0;
		Product response = null;
		response = service.findProductByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findProductByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing OrderLine entity
	 * 
	 */
	@Test
	public void saveProductOrderLines() {
		// TODO: JUnit - Populate test inputs for operation: saveProductOrderLines 
		Integer id_1 = 0;
		OrderLine related_orderlines = new ecom.domain.OrderLine();
		Product response = null;
		response = service.saveProductOrderLines(id_1, related_orderlines);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductOrderLines
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
