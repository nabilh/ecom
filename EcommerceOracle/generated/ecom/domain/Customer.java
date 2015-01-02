package ecom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllCustomers", query = "select myCustomer from Customer myCustomer"),
		@NamedQuery(name = "findCustomerByCity", query = "select myCustomer from Customer myCustomer where myCustomer.city = ?1"),
		@NamedQuery(name = "findCustomerByCityContaining", query = "select myCustomer from Customer myCustomer where myCustomer.city like ?1"),
		@NamedQuery(name = "findCustomerByFirstName", query = "select myCustomer from Customer myCustomer where myCustomer.firstName = ?1"),
		@NamedQuery(name = "findCustomerByFirstNameContaining", query = "select myCustomer from Customer myCustomer where myCustomer.firstName like ?1"),
		@NamedQuery(name = "findCustomerById", query = "select myCustomer from Customer myCustomer where myCustomer.id = ?1"),
		@NamedQuery(name = "findCustomerByLastName", query = "select myCustomer from Customer myCustomer where myCustomer.lastName = ?1"),
		@NamedQuery(name = "findCustomerByLastNameContaining", query = "select myCustomer from Customer myCustomer where myCustomer.lastName like ?1"),
		@NamedQuery(name = "findCustomerByPrimaryKey", query = "select myCustomer from Customer myCustomer where myCustomer.id = ?1"),
		@NamedQuery(name = "findCustomerByState", query = "select myCustomer from Customer myCustomer where myCustomer.state = ?1"),
		@NamedQuery(name = "findCustomerByStateContaining", query = "select myCustomer from Customer myCustomer where myCustomer.state like ?1"),
		@NamedQuery(name = "findCustomerByStreet", query = "select myCustomer from Customer myCustomer where myCustomer.street = ?1"),
		@NamedQuery(name = "findCustomerByStreetContaining", query = "select myCustomer from Customer myCustomer where myCustomer.street like ?1"),
		@NamedQuery(name = "findCustomerByZip", query = "select myCustomer from Customer myCustomer where myCustomer.zip = ?1"),
		@NamedQuery(name = "findCustomerByZipContaining", query = "select myCustomer from Customer myCustomer where myCustomer.zip like ?1") })
@Table(schema = "ECOMMERCE", name = "`CUSTOMER`")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "EcommerceOracle/ecom/domain", name = "Customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "`ID`", scale = 2, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	BigDecimal id;
	/**
	 */

	@Column(name = "`FIRST_NAME`", length = 12)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String firstName;
	/**
	 */

	@Column(name = "`LAST_NAME`", length = 12, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String lastName;
	/**
	 */

	@Column(name = "`STREET`", length = 30)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String street;
	/**
	 */

	@Column(name = "`CITY`", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String city;
	/**
	 */

	@Column(name = "`STATE`", length = 2)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String state;
	/**
	 */

	@Column(name = "`ZIP`", length = 5)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String zip;

	/**
	 */
	public void setId(BigDecimal id) {
		this.id = id;
	}

	/**
	 */
	public BigDecimal getId() {
		return this.id;
	}

	/**
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 */
	public String getStreet() {
		return this.street;
	}

	/**
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 */
	public String getCity() {
		return this.city;
	}

	/**
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 */
	public String getState() {
		return this.state;
	}

	/**
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 */
	public String getZip() {
		return this.zip;
	}

	/**
	 */
	public Customer() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Customer that) {
		setId(that.getId());
		setFirstName(that.getFirstName());
		setLastName(that.getLastName());
		setStreet(that.getStreet());
		setCity(that.getCity());
		setState(that.getState());
		setZip(that.getZip());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("firstName=[").append(firstName).append("] ");
		buffer.append("lastName=[").append(lastName).append("] ");
		buffer.append("street=[").append(street).append("] ");
		buffer.append("city=[").append(city).append("] ");
		buffer.append("state=[").append(state).append("] ");
		buffer.append("zip=[").append(zip).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Customer))
			return false;
		Customer equalCheck = (Customer) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
