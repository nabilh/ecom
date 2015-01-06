package ecom.dao;

import ecom.domain.Customer;

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
 * DAO to manage Customer entities.
 * 
 */
@Repository("CustomerDAO")
@Transactional
public class CustomerDAOImpl extends AbstractJpaDao<Customer> implements
		CustomerDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Customer.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MySQL
	 *
	 */
	@PersistenceContext(unitName = "MySQL")
	private EntityManager entityManager;

	/**
	 * Instantiates a new CustomerDAOImpl
	 *
	 */
	public CustomerDAOImpl() {
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
	 * JPQL Query - findCustomerByLastNameContaining
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByLastNameContaining(String lastName) throws DataAccessException {

		return findCustomerByLastNameContaining(lastName, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByLastNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByLastNameContaining(String lastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByLastNameContaining", startResult, maxRows, lastName);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByZip
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByZip(String zip) throws DataAccessException {

		return findCustomerByZip(zip, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByZip
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByZip(String zip, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByZip", startResult, maxRows, zip);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByCity
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByCity(String city) throws DataAccessException {

		return findCustomerByCity(city, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByCity
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByCity(String city, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByCity", startResult, maxRows, city);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByLastName
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByLastName(String lastName) throws DataAccessException {

		return findCustomerByLastName(lastName, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByLastName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByLastName(String lastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByLastName", startResult, maxRows, lastName);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByCityContaining
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByCityContaining(String city) throws DataAccessException {

		return findCustomerByCityContaining(city, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByCityContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByCityContaining(String city, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByCityContaining", startResult, maxRows, city);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByStreet
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByStreet(String street) throws DataAccessException {

		return findCustomerByStreet(street, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByStreet
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByStreet(String street, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByStreet", startResult, maxRows, street);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByFirstName
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByFirstName(String firstName) throws DataAccessException {

		return findCustomerByFirstName(firstName, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByFirstName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByFirstName(String firstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByFirstName", startResult, maxRows, firstName);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByStreetContaining
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByStreetContaining(String street) throws DataAccessException {

		return findCustomerByStreetContaining(street, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByStreetContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByStreetContaining(String street, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByStreetContaining", startResult, maxRows, street);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerById
	 *
	 */
	@Transactional
	public Customer findCustomerById(Integer id) throws DataAccessException {

		return findCustomerById(id, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerById
	 *
	 */

	@Transactional
	public Customer findCustomerById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCustomerById", startResult, maxRows, id);
			return (ecom.domain.Customer) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCustomerByState
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByState(String state) throws DataAccessException {

		return findCustomerByState(state, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByState
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByState(String state, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByState", startResult, maxRows, state);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByZipContaining
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByZipContaining(String zip) throws DataAccessException {

		return findCustomerByZipContaining(zip, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByZipContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByZipContaining(String zip, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByZipContaining", startResult, maxRows, zip);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllCustomers
	 *
	 */
	@Transactional
	public Set<Customer> findAllCustomers() throws DataAccessException {

		return findAllCustomers(-1, -1);
	}

	/**
	 * JPQL Query - findAllCustomers
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findAllCustomers(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllCustomers", startResult, maxRows);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByStateContaining
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByStateContaining(String state) throws DataAccessException {

		return findCustomerByStateContaining(state, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByStateContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByStateContaining(String state, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByStateContaining", startResult, maxRows, state);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByPrimaryKey
	 *
	 */
	@Transactional
	public Customer findCustomerByPrimaryKey(Integer id) throws DataAccessException {

		return findCustomerByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByPrimaryKey
	 *
	 */

	@Transactional
	public Customer findCustomerByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCustomerByPrimaryKey", startResult, maxRows, id);
			return (ecom.domain.Customer) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCustomerByFirstNameContaining
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByFirstNameContaining(String firstName) throws DataAccessException {

		return findCustomerByFirstNameContaining(firstName, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByFirstNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByFirstNameContaining(String firstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByFirstNameContaining", startResult, maxRows, firstName);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Customer entity) {
		return true;
	}
}
