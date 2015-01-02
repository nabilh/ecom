package apps.dao;

import apps.domain.Customer;

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
	 * JPQL Query - findCustomerByContactlastnameContaining
	 *
	 */
	public Set<Customer> findCustomerByContactlastnameContaining(String contactlastname) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByContactlastnameContaining
	 *
	 */
	public Set<Customer> findCustomerByContactlastnameContaining(String contactlastname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByPhoneContaining
	 *
	 */
	public Set<Customer> findCustomerByPhoneContaining(String phone) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByPhoneContaining
	 *
	 */
	public Set<Customer> findCustomerByPhoneContaining(String phone, int startResult, int maxRows) throws DataAccessException;

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
	 * JPQL Query - findCustomerByCreditlimit
	 *
	 */
	public Set<Customer> findCustomerByCreditlimit(java.math.BigDecimal creditlimit) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByCreditlimit
	 *
	 */
	public Set<Customer> findCustomerByCreditlimit(BigDecimal creditlimit, int startResult, int maxRows) throws DataAccessException;

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
	 * JPQL Query - findCustomerByPostalcode
	 *
	 */
	public Set<Customer> findCustomerByPostalcode(String postalcode) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByPostalcode
	 *
	 */
	public Set<Customer> findCustomerByPostalcode(String postalcode, int startResult, int maxRows) throws DataAccessException;

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
	 * JPQL Query - findCustomerByContactlastname
	 *
	 */
	public Set<Customer> findCustomerByContactlastname(String contactlastname_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByContactlastname
	 *
	 */
	public Set<Customer> findCustomerByContactlastname(String contactlastname_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByPhone
	 *
	 */
	public Set<Customer> findCustomerByPhone(String phone_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByPhone
	 *
	 */
	public Set<Customer> findCustomerByPhone(String phone_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByAddressline1
	 *
	 */
	public Set<Customer> findCustomerByAddressline1(String addressline1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByAddressline1
	 *
	 */
	public Set<Customer> findCustomerByAddressline1(String addressline1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByAddressline1Containing
	 *
	 */
	public Set<Customer> findCustomerByAddressline1Containing(String addressline1_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByAddressline1Containing
	 *
	 */
	public Set<Customer> findCustomerByAddressline1Containing(String addressline1_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByCustomernameContaining
	 *
	 */
	public Set<Customer> findCustomerByCustomernameContaining(String customername) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByCustomernameContaining
	 *
	 */
	public Set<Customer> findCustomerByCustomernameContaining(String customername, int startResult, int maxRows) throws DataAccessException;

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
	 * JPQL Query - findCustomerByAddressline2Containing
	 *
	 */
	public Set<Customer> findCustomerByAddressline2Containing(String addressline2) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByAddressline2Containing
	 *
	 */
	public Set<Customer> findCustomerByAddressline2Containing(String addressline2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByContactfirstname
	 *
	 */
	public Set<Customer> findCustomerByContactfirstname(String contactfirstname) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByContactfirstname
	 *
	 */
	public Set<Customer> findCustomerByContactfirstname(String contactfirstname, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByCountry
	 *
	 */
	public Set<Customer> findCustomerByCountry(String country) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByCountry
	 *
	 */
	public Set<Customer> findCustomerByCountry(String country, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerBySalesrepemployeenumber
	 *
	 */
	public Set<Customer> findCustomerBySalesrepemployeenumber(Integer salesrepemployeenumber) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerBySalesrepemployeenumber
	 *
	 */
	public Set<Customer> findCustomerBySalesrepemployeenumber(Integer salesrepemployeenumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByCustomernumber
	 *
	 */
	public Customer findCustomerByCustomernumber(Integer customernumber) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByCustomernumber
	 *
	 */
	public Customer findCustomerByCustomernumber(Integer customernumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByPrimaryKey
	 *
	 */
	public Customer findCustomerByPrimaryKey(Integer customernumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByPrimaryKey
	 *
	 */
	public Customer findCustomerByPrimaryKey(Integer customernumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByCustomername
	 *
	 */
	public Set<Customer> findCustomerByCustomername(String customername_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByCustomername
	 *
	 */
	public Set<Customer> findCustomerByCustomername(String customername_1, int startResult, int maxRows) throws DataAccessException;

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
	 * JPQL Query - findCustomerByContactfirstnameContaining
	 *
	 */
	public Set<Customer> findCustomerByContactfirstnameContaining(String contactfirstname_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByContactfirstnameContaining
	 *
	 */
	public Set<Customer> findCustomerByContactfirstnameContaining(String contactfirstname_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByPostalcodeContaining
	 *
	 */
	public Set<Customer> findCustomerByPostalcodeContaining(String postalcode_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByPostalcodeContaining
	 *
	 */
	public Set<Customer> findCustomerByPostalcodeContaining(String postalcode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByCountryContaining
	 *
	 */
	public Set<Customer> findCustomerByCountryContaining(String country_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByCountryContaining
	 *
	 */
	public Set<Customer> findCustomerByCountryContaining(String country_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByAddressline2
	 *
	 */
	public Set<Customer> findCustomerByAddressline2(String addressline2_1) throws DataAccessException;

	/**
	 * JPQL Query - findCustomerByAddressline2
	 *
	 */
	public Set<Customer> findCustomerByAddressline2(String addressline2_1, int startResult, int maxRows) throws DataAccessException;

}