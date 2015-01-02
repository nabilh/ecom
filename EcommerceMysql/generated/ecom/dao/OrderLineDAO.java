package ecom.dao;

import ecom.domain.OrderLine;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage OrderLine entities.
 * 
 */
public interface OrderLineDAO extends JpaDao<OrderLine> {

	/**
	 * JPQL Query - findAllOrderLines
	 *
	 */
	public Set<OrderLine> findAllOrderLines() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrderLines
	 *
	 */
	public Set<OrderLine> findAllOrderLines(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderLineById
	 *
	 */
	public OrderLine findOrderLineById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findOrderLineById
	 *
	 */
	public OrderLine findOrderLineById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderLineByPrimaryKey
	 *
	 */
	public OrderLine findOrderLineByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrderLineByPrimaryKey
	 *
	 */
	public OrderLine findOrderLineByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrderLineByQuantity
	 *
	 */
	public Set<OrderLine> findOrderLineByQuantity(Integer quantity) throws DataAccessException;

	/**
	 * JPQL Query - findOrderLineByQuantity
	 *
	 */
	public Set<OrderLine> findOrderLineByQuantity(Integer quantity, int startResult, int maxRows) throws DataAccessException;

}