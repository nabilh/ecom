package ecom.dao;

import ecom.domain.SalesOrder;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage SalesOrder entities.
 * 
 */
public interface SalesOrderDAO extends JpaDao<SalesOrder> {

	/**
	 * JPQL Query - findSalesOrderByDateCreatedBefore
	 *
	 */
	public Set<SalesOrder> findSalesOrderByDateCreatedBefore(java.util.Calendar dateCreated) throws DataAccessException;

	/**
	 * JPQL Query - findSalesOrderByDateCreatedBefore
	 *
	 */
	public Set<SalesOrder> findSalesOrderByDateCreatedBefore(Calendar dateCreated, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllSalesOrders
	 *
	 */
	public Set<SalesOrder> findAllSalesOrders() throws DataAccessException;

	/**
	 * JPQL Query - findAllSalesOrders
	 *
	 */
	public Set<SalesOrder> findAllSalesOrders(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSalesOrderByPrimaryKey
	 *
	 */
	public SalesOrder findSalesOrderByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findSalesOrderByPrimaryKey
	 *
	 */
	public SalesOrder findSalesOrderByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSalesOrderByDateCreatedAfter
	 *
	 */
	public Set<SalesOrder> findSalesOrderByDateCreatedAfter(java.util.Calendar dateCreated_1) throws DataAccessException;

	/**
	 * JPQL Query - findSalesOrderByDateCreatedAfter
	 *
	 */
	public Set<SalesOrder> findSalesOrderByDateCreatedAfter(Calendar dateCreated_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSalesOrderByDateCreated
	 *
	 */
	public Set<SalesOrder> findSalesOrderByDateCreated(java.util.Calendar dateCreated_2) throws DataAccessException;

	/**
	 * JPQL Query - findSalesOrderByDateCreated
	 *
	 */
	public Set<SalesOrder> findSalesOrderByDateCreated(Calendar dateCreated_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSalesOrderById
	 *
	 */
	public SalesOrder findSalesOrderById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findSalesOrderById
	 *
	 */
	public SalesOrder findSalesOrderById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}