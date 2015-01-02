package ecom.dao;

import ecom.domain.SalesOrder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage SalesOrder entities.
 * 
 */
@Repository("SalesOrderDAO")
@Transactional
public class SalesOrderDAOImpl extends AbstractJpaDao<SalesOrder> implements
		SalesOrderDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { SalesOrder.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MySQL
	 *
	 */
	@PersistenceContext(unitName = "MySQL")
	private EntityManager entityManager;

	/**
	 * Instantiates a new SalesOrderDAOImpl
	 *
	 */
	public SalesOrderDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findSalesOrderByDateCreatedBefore
	 *
	 */
	@Transactional
	public Set<SalesOrder> findSalesOrderByDateCreatedBefore(java.util.Calendar dateCreated) throws DataAccessException {

		return findSalesOrderByDateCreatedBefore(dateCreated, -1, -1);
	}

	/**
	 * JPQL Query - findSalesOrderByDateCreatedBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<SalesOrder> findSalesOrderByDateCreatedBefore(java.util.Calendar dateCreated, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSalesOrderByDateCreatedBefore", startResult, maxRows, dateCreated);
		return new LinkedHashSet<SalesOrder>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllSalesOrders
	 *
	 */
	@Transactional
	public Set<SalesOrder> findAllSalesOrders() throws DataAccessException {

		return findAllSalesOrders(-1, -1);
	}

	/**
	 * JPQL Query - findAllSalesOrders
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<SalesOrder> findAllSalesOrders(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllSalesOrders", startResult, maxRows);
		return new LinkedHashSet<SalesOrder>(query.getResultList());
	}

	/**
	 * JPQL Query - findSalesOrderByPrimaryKey
	 *
	 */
	@Transactional
	public SalesOrder findSalesOrderByPrimaryKey(Integer id) throws DataAccessException {

		return findSalesOrderByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findSalesOrderByPrimaryKey
	 *
	 */

	@Transactional
	public SalesOrder findSalesOrderByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findSalesOrderByPrimaryKey", startResult, maxRows, id);
			return (ecom.domain.SalesOrder) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findSalesOrderByDateCreatedAfter
	 *
	 */
	@Transactional
	public Set<SalesOrder> findSalesOrderByDateCreatedAfter(java.util.Calendar dateCreated) throws DataAccessException {

		return findSalesOrderByDateCreatedAfter(dateCreated, -1, -1);
	}

	/**
	 * JPQL Query - findSalesOrderByDateCreatedAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<SalesOrder> findSalesOrderByDateCreatedAfter(java.util.Calendar dateCreated, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSalesOrderByDateCreatedAfter", startResult, maxRows, dateCreated);
		return new LinkedHashSet<SalesOrder>(query.getResultList());
	}

	/**
	 * JPQL Query - findSalesOrderByDateCreated
	 *
	 */
	@Transactional
	public Set<SalesOrder> findSalesOrderByDateCreated(java.util.Calendar dateCreated) throws DataAccessException {

		return findSalesOrderByDateCreated(dateCreated, -1, -1);
	}

	/**
	 * JPQL Query - findSalesOrderByDateCreated
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<SalesOrder> findSalesOrderByDateCreated(java.util.Calendar dateCreated, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSalesOrderByDateCreated", startResult, maxRows, dateCreated);
		return new LinkedHashSet<SalesOrder>(query.getResultList());
	}

	/**
	 * JPQL Query - findSalesOrderById
	 *
	 */
	@Transactional
	public SalesOrder findSalesOrderById(Integer id) throws DataAccessException {

		return findSalesOrderById(id, -1, -1);
	}

	/**
	 * JPQL Query - findSalesOrderById
	 *
	 */

	@Transactional
	public SalesOrder findSalesOrderById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findSalesOrderById", startResult, maxRows, id);
			return (ecom.domain.SalesOrder) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(SalesOrder entity) {
		return true;
	}
}
