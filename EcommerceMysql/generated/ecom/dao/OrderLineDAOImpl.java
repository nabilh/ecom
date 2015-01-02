package ecom.dao;

import ecom.domain.OrderLine;

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
 * DAO to manage OrderLine entities.
 * 
 */
@Repository("OrderLineDAO")
@Transactional
public class OrderLineDAOImpl extends AbstractJpaDao<OrderLine> implements
		OrderLineDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { OrderLine.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MySQL
	 *
	 */
	@PersistenceContext(unitName = "MySQL")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OrderLineDAOImpl
	 *
	 */
	public OrderLineDAOImpl() {
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
	 * JPQL Query - findAllOrderLines
	 *
	 */
	@Transactional
	public Set<OrderLine> findAllOrderLines() throws DataAccessException {

		return findAllOrderLines(-1, -1);
	}

	/**
	 * JPQL Query - findAllOrderLines
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderLine> findAllOrderLines(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOrderLines", startResult, maxRows);
		return new LinkedHashSet<OrderLine>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrderLineById
	 *
	 */
	@Transactional
	public OrderLine findOrderLineById(Integer id) throws DataAccessException {

		return findOrderLineById(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrderLineById
	 *
	 */

	@Transactional
	public OrderLine findOrderLineById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderLineById", startResult, maxRows, id);
			return (ecom.domain.OrderLine) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrderLineByPrimaryKey
	 *
	 */
	@Transactional
	public OrderLine findOrderLineByPrimaryKey(Integer id) throws DataAccessException {

		return findOrderLineByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrderLineByPrimaryKey
	 *
	 */

	@Transactional
	public OrderLine findOrderLineByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrderLineByPrimaryKey", startResult, maxRows, id);
			return (ecom.domain.OrderLine) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrderLineByQuantity
	 *
	 */
	@Transactional
	public Set<OrderLine> findOrderLineByQuantity(Integer quantity) throws DataAccessException {

		return findOrderLineByQuantity(quantity, -1, -1);
	}

	/**
	 * JPQL Query - findOrderLineByQuantity
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<OrderLine> findOrderLineByQuantity(Integer quantity, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrderLineByQuantity", startResult, maxRows, quantity);
		return new LinkedHashSet<OrderLine>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(OrderLine entity) {
		return true;
	}
}
