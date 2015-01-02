package ecom.dao;

import ecom.domain.Customer;

import java.math.BigDecimal;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Customer entities.
 * 
 */
public interface CustomerDAO extends JpaDao<Customer> {

	/**
	 * JPQL Query - findCustomerByCityContaining
	 *
	 */
	public Set<Customer> findCustomerByCityContaining(String city) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByCityContaining
	 *
	 */
	public Set<Customer> findCustomerByCityContaining(String city, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByCity
	 *
	 */
	public Set<Customer> findCustomerByCity(String city_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByCity
	 *
	 */
	public Set<Customer> findCustomerByCity(String city_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByFirstName
	 *
	 */
	public Set<Customer> findCustomerByFirstName(String firstName) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByFirstName
	 *
	 */
	public Set<Customer> findCustomerByFirstName(String firstName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerById
	 *
	 */
	public Customer findCustomerById(java.math.BigDecimal id) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerById
	 *
	 */
	public Customer findCustomerById(BigDecimal id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByZipContaining
	 *
	 */
	public Set<Customer> findCustomerByZipContaining(String zip) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByZipContaining
	 *
	 */
	public Set<Customer> findCustomerByZipContaining(String zip, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByStreetContaining
	 *
	 */
	public Set<Customer> findCustomerByStreetContaining(String street) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByStreetContaining
	 *
	 */
	public Set<Customer> findCustomerByStreetContaining(String street, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByLastNameContaining
	 *
	 */
	public Set<Customer> findCustomerByLastNameContaining(String lastName) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByLastNameContaining
	 *
	 */
	public Set<Customer> findCustomerByLastNameContaining(String lastName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByLastName
	 *
	 */
	public Set<Customer> findCustomerByLastName(String lastName_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByLastName
	 *
	 */
	public Set<Customer> findCustomerByLastName(String lastName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByFirstNameContaining
	 *
	 */
	public Set<Customer> findCustomerByFirstNameContaining(String firstName_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByFirstNameContaining
	 *
	 */
	public Set<Customer> findCustomerByFirstNameContaining(String firstName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByStreet
	 *
	 */
	public Set<Customer> findCustomerByStreet(String street_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByStreet
	 *
	 */
	public Set<Customer> findCustomerByStreet(String street_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByStateContaining
	 *
	 */
	public Set<Customer> findCustomerByStateContaining(String state) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByStateContaining
	 *
	 */
	public Set<Customer> findCustomerByStateContaining(String state, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllCustomers
	 *
	 */
	public Set<Customer> findAllCustomers() throws DataAccessException;

	/**
	 * JPQL Query - findAllCustomers
	 *
	 */
	public Set<Customer> findAllCustomers(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByZip
	 *
	 */
	public Set<Customer> findCustomerByZip(String zip_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByZip
	 *
	 */
	public Set<Customer> findCustomerByZip(String zip_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByState
	 *
	 */
	public Set<Customer> findCustomerByState(String state_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByState
	 *
	 */
	public Set<Customer> findCustomerByState(String state_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByPrimaryKey
	 *
	 */
	public Customer findCustomerByPrimaryKey(java.math.BigDecimal id_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByPrimaryKey
	 *
	 */
	public Customer findCustomerByPrimaryKey(BigDecimal id_1, int startResult, int maxRows) throws DataAccessException;

}