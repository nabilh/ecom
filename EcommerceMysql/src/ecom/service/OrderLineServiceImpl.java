package ecom.service;

import ecom.dao.OrderLineDAO;
import ecom.dao.ProductDAO;
import ecom.dao.SalesOrderDAO;

import ecom.domain.OrderLine;
import ecom.domain.Product;
import ecom.domain.SalesOrder;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for OrderLine entities
 * 
 */

@Service("OrderLineService")
@Transactional
public class OrderLineServiceImpl implements OrderLineService {

	/**
	 * DAO injected by Spring that manages OrderLine entities
	 * 
	 */
	@Autowired
	private OrderLineDAO orderLineDAO;

	/**
	 * DAO injected by Spring that manages Product entities
	 * 
	 */
	@Autowired
	private ProductDAO productDAO;

	/**
	 * DAO injected by Spring that manages SalesOrder entities
	 * 
	 */
	@Autowired
	private SalesOrderDAO salesOrderDAO;

	/**
	 * Instantiates a new OrderLineServiceImpl.
	 *
	 */
	public OrderLineServiceImpl() {
	}

	/**
	 * Delete an existing OrderLine entity
	 * 
	 */
	@Transactional
	public void deleteOrderLine(OrderLine orderline) {
		orderLineDAO.remove(orderline);
		orderLineDAO.flush();
	}

	/**
	 */
	@Transactional
	public OrderLine findOrderLineByPrimaryKey(Integer id) {
		return orderLineDAO.findOrderLineByPrimaryKey(id);
	}

	/**
	 * Save an existing Product entity
	 * 
	 */
	@Transactional
	public OrderLine saveOrderLineProduct(Integer id, Product related_product) {
		OrderLine orderline = orderLineDAO.findOrderLineByPrimaryKey(id, -1, -1);
		Product existingproduct = productDAO.findProductByPrimaryKey(related_product.getId());

		// copy into the existing record to preserve existing relationships
		if (existingproduct != null) {
			existingproduct.setId(related_product.getId());
			existingproduct.setPartNumber(related_product.getPartNumber());
			existingproduct.setColor(related_product.getColor());
			existingproduct.setBrand(related_product.getBrand());
			existingproduct.setCategory(related_product.getCategory());
			existingproduct.setName(related_product.getName());
			related_product = existingproduct;
		} else {
			related_product = productDAO.store(related_product);
			productDAO.flush();
		}

		orderline.setProduct(related_product);
		related_product.getOrderLines().add(orderline);
		orderline = orderLineDAO.store(orderline);
		orderLineDAO.flush();

		related_product = productDAO.store(related_product);
		productDAO.flush();

		return orderline;
	}

	/**
	 * Save an existing SalesOrder entity
	 * 
	 */
	@Transactional
	public OrderLine saveOrderLineSalesOrder(Integer id, SalesOrder related_salesorder) {
		OrderLine orderline = orderLineDAO.findOrderLineByPrimaryKey(id, -1, -1);
		SalesOrder existingsalesOrder = salesOrderDAO.findSalesOrderByPrimaryKey(related_salesorder.getId());

		// copy into the existing record to preserve existing relationships
		if (existingsalesOrder != null) {
			existingsalesOrder.setId(related_salesorder.getId());
			existingsalesOrder.setDateCreated(related_salesorder.getDateCreated());
			related_salesorder = existingsalesOrder;
		} else {
			related_salesorder = salesOrderDAO.store(related_salesorder);
			salesOrderDAO.flush();
		}

		orderline.setSalesOrder(related_salesorder);
		related_salesorder.getOrderLines().add(orderline);
		orderline = orderLineDAO.store(orderline);
		orderLineDAO.flush();

		related_salesorder = salesOrderDAO.store(related_salesorder);
		salesOrderDAO.flush();

		return orderline;
	}

	/**
	 * Return all OrderLine entity
	 * 
	 */
	@Transactional
	public List<OrderLine> findAllOrderLines(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<OrderLine>(orderLineDAO.findAllOrderLines(startResult, maxRows));
	}

	/**
	 * Load an existing OrderLine entity
	 * 
	 */
	@Transactional
	public Set<OrderLine> loadOrderLines() {
		return orderLineDAO.findAllOrderLines();
	}

	/**
	 * Delete an existing SalesOrder entity
	 * 
	 */
	@Transactional
	public OrderLine deleteOrderLineSalesOrder(Integer orderline_id, Integer related_salesorder_id) {
		OrderLine orderline = orderLineDAO.findOrderLineByPrimaryKey(orderline_id, -1, -1);
		SalesOrder related_salesorder = salesOrderDAO.findSalesOrderByPrimaryKey(related_salesorder_id, -1, -1);

		orderline.setSalesOrder(null);
		related_salesorder.getOrderLines().remove(orderline);
		orderline = orderLineDAO.store(orderline);
		orderLineDAO.flush();

		related_salesorder = salesOrderDAO.store(related_salesorder);
		salesOrderDAO.flush();

		salesOrderDAO.remove(related_salesorder);
		salesOrderDAO.flush();

		return orderline;
	}

	/**
	 * Return a count of all OrderLine entity
	 * 
	 */
	@Transactional
	public Integer countOrderLines() {
		return ((Long) orderLineDAO.createQuerySingleResult("select count(o) from OrderLine o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Product entity
	 * 
	 */
	@Transactional
	public OrderLine deleteOrderLineProduct(Integer orderline_id, Integer related_product_id) {
		OrderLine orderline = orderLineDAO.findOrderLineByPrimaryKey(orderline_id, -1, -1);
		Product related_product = productDAO.findProductByPrimaryKey(related_product_id, -1, -1);

		orderline.setProduct(null);
		related_product.getOrderLines().remove(orderline);
		orderline = orderLineDAO.store(orderline);
		orderLineDAO.flush();

		related_product = productDAO.store(related_product);
		productDAO.flush();

		productDAO.remove(related_product);
		productDAO.flush();

		return orderline;
	}

	/**
	 * Save an existing OrderLine entity
	 * 
	 */
	@Transactional
	public void saveOrderLine(OrderLine orderline) {
		OrderLine existingOrderLine = orderLineDAO.findOrderLineByPrimaryKey(orderline.getId());

		if (existingOrderLine != null) {
			if (existingOrderLine != orderline) {
				existingOrderLine.setId(orderline.getId());
				existingOrderLine.setQuantity(orderline.getQuantity());
			}
			orderline = orderLineDAO.store(existingOrderLine);
		} else {
			orderline = orderLineDAO.store(orderline);
		}
		orderLineDAO.flush();
	}
}
