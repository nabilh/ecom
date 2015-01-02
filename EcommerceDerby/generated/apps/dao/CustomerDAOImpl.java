package apps.dao;

import apps.domain.Customer;

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
	 * EntityManager injected by Spring for persistence unit MyEclipse_Derby
	 *
	 */
	@PersistenceContext(unitName = "MyEclipse_Derby")
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
	 * JPQL Query - findCustomerByContactlastnameContaining
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByContactlastnameContaining(String contactlastname) throws DataAccessException {

		return findCustomerByContactlastnameContaining(contactlastname, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByContactlastnameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByContactlastnameContaining(String contactlastname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByContactlastnameContaining", startResult, maxRows, contactlastname);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByPhoneContaining
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByPhoneContaining(String phone) throws DataAccessException {

		return findCustomerByPhoneContaining(phone, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByPhoneContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByPhoneContaining(String phone, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByPhoneContaining", startResult, maxRows, phone);
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
	 * JPQL Query - findCustomerByCreditlimit
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByCreditlimit(java.math.BigDecimal creditlimit) throws DataAccessException {

		return findCustomerByCreditlimit(creditlimit, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByCreditlimit
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByCreditlimit(java.math.BigDecimal creditlimit, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByCreditlimit", startResult, maxRows, creditlimit);
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
	 * JPQL Query - findCustomerByPostalcode
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByPostalcode(String postalcode) throws DataAccessException {

		return findCustomerByPostalcode(postalcode, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByPostalcode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByPostalcode(String postalcode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByPostalcode", startResult, maxRows, postalcode);
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
	 * JPQL Query - findCustomerByContactlastname
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByContactlastname(String contactlastname) throws DataAccessException {

		return findCustomerByContactlastname(contactlastname, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByContactlastname
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByContactlastname(String contactlastname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByContactlastname", startResult, maxRows, contactlastname);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByPhone
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByPhone(String phone) throws DataAccessException {

		return findCustomerByPhone(phone, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByPhone
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByPhone(String phone, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByPhone", startResult, maxRows, phone);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByAddressline1
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByAddressline1(String addressline1) throws DataAccessException {

		return findCustomerByAddressline1(addressline1, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByAddressline1
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByAddressline1(String addressline1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByAddressline1", startResult, maxRows, addressline1);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByAddressline1Containing
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByAddressline1Containing(String addressline1) throws DataAccessException {

		return findCustomerByAddressline1Containing(addressline1, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByAddressline1Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByAddressline1Containing(String addressline1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByAddressline1Containing", startResult, maxRows, addressline1);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByCustomernameContaining
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByCustomernameContaining(String customername) throws DataAccessException {

		return findCustomerByCustomernameContaining(customername, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByCustomernameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByCustomernameContaining(String customername, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByCustomernameContaining", startResult, maxRows, customername);
		return new LinkedHashSet<Customer>(query.getResultList());
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
	 * JPQL Query - findCustomerByAddressline2Containing
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByAddressline2Containing(String addressline2) throws DataAccessException {

		return findCustomerByAddressline2Containing(addressline2, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByAddressline2Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByAddressline2Containing(String addressline2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByAddressline2Containing", startResult, maxRows, addressline2);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByContactfirstname
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByContactfirstname(String contactfirstname) throws DataAccessException {

		return findCustomerByContactfirstname(contactfirstname, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByContactfirstname
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByContactfirstname(String contactfirstname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByContactfirstname", startResult, maxRows, contactfirstname);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByCountry
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByCountry(String country) throws DataAccessException {

		return findCustomerByCountry(country, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByCountry
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByCountry(String country, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByCountry", startResult, maxRows, country);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerBySalesrepemployeenumber
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerBySalesrepemployeenumber(Integer salesrepemployeenumber) throws DataAccessException {

		return findCustomerBySalesrepemployeenumber(salesrepemployeenumber, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerBySalesrepemployeenumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerBySalesrepemployeenumber(Integer salesrepemployeenumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerBySalesrepemployeenumber", startResult, maxRows, salesrepemployeenumber);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByCustomernumber
	 *
	 */
	@Transactional
	public Customer findCustomerByCustomernumber(Integer customernumber) throws DataAccessException {

		return findCustomerByCustomernumber(customernumber, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByCustomernumber
	 *
	 */

	@Transactional
	public Customer findCustomerByCustomernumber(Integer customernumber, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCustomerByCustomernumber", startResult, maxRows, customernumber);
			return (apps.domain.Customer) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCustomerByPrimaryKey
	 *
	 */
	@Transactional
	public Customer findCustomerByPrimaryKey(Integer customernumber) throws DataAccessException {

		return findCustomerByPrimaryKey(customernumber, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByPrimaryKey
	 *
	 */

	@Transactional
	public Customer findCustomerByPrimaryKey(Integer customernumber, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCustomerByPrimaryKey", startResult, maxRows, customernumber);
			return (apps.domain.Customer) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCustomerByCustomername
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByCustomername(String customername) throws DataAccessException {

		return findCustomerByCustomername(customername, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByCustomername
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByCustomername(String customername, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByCustomername", startResult, maxRows, customername);
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
	 * JPQL Query - findCustomerByContactfirstnameContaining
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByContactfirstnameContaining(String contactfirstname) throws DataAccessException {

		return findCustomerByContactfirstnameContaining(contactfirstname, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByContactfirstnameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByContactfirstnameContaining(String contactfirstname, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByContactfirstnameContaining", startResult, maxRows, contactfirstname);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByPostalcodeContaining
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByPostalcodeContaining(String postalcode) throws DataAccessException {

		return findCustomerByPostalcodeContaining(postalcode, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByPostalcodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByPostalcodeContaining(String postalcode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByPostalcodeContaining", startResult, maxRows, postalcode);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByCountryContaining
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByCountryContaining(String country) throws DataAccessException {

		return findCustomerByCountryContaining(country, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByCountryContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByCountryContaining(String country, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByCountryContaining", startResult, maxRows, country);
		return new LinkedHashSet<Customer>(query.getResultList());
	}

	/**
	 * JPQL Query - findCustomerByAddressline2
	 *
	 */
	@Transactional
	public Set<Customer> findCustomerByAddressline2(String addressline2) throws DataAccessException {

		return findCustomerByAddressline2(addressline2, -1, -1);
	}

	/**
	 * JPQL Query - findCustomerByAddressline2
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Customer> findCustomerByAddressline2(String addressline2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCustomerByAddressline2", startResult, maxRows, addressline2);
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
