package apps.domain;

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
		@NamedQuery(name = "findCustomerByAddressline1", query = "select myCustomer from Customer myCustomer where myCustomer.addressline1 = ?1"),
		@NamedQuery(name = "findCustomerByAddressline1Containing", query = "select myCustomer from Customer myCustomer where myCustomer.addressline1 like ?1"),
		@NamedQuery(name = "findCustomerByAddressline2", query = "select myCustomer from Customer myCustomer where myCustomer.addressline2 = ?1"),
		@NamedQuery(name = "findCustomerByAddressline2Containing", query = "select myCustomer from Customer myCustomer where myCustomer.addressline2 like ?1"),
		@NamedQuery(name = "findCustomerByCity", query = "select myCustomer from Customer myCustomer where myCustomer.city = ?1"),
		@NamedQuery(name = "findCustomerByCityContaining", query = "select myCustomer from Customer myCustomer where myCustomer.city like ?1"),
		@NamedQuery(name = "findCustomerByContactfirstname", query = "select myCustomer from Customer myCustomer where myCustomer.contactfirstname = ?1"),
		@NamedQuery(name = "findCustomerByContactfirstnameContaining", query = "select myCustomer from Customer myCustomer where myCustomer.contactfirstname like ?1"),
		@NamedQuery(name = "findCustomerByContactlastname", query = "select myCustomer from Customer myCustomer where myCustomer.contactlastname = ?1"),
		@NamedQuery(name = "findCustomerByContactlastnameContaining", query = "select myCustomer from Customer myCustomer where myCustomer.contactlastname like ?1"),
		@NamedQuery(name = "findCustomerByCountry", query = "select myCustomer from Customer myCustomer where myCustomer.country = ?1"),
		@NamedQuery(name = "findCustomerByCountryContaining", query = "select myCustomer from Customer myCustomer where myCustomer.country like ?1"),
		@NamedQuery(name = "findCustomerByCreditlimit", query = "select myCustomer from Customer myCustomer where myCustomer.creditlimit = ?1"),
		@NamedQuery(name = "findCustomerByCustomername", query = "select myCustomer from Customer myCustomer where myCustomer.customername = ?1"),
		@NamedQuery(name = "findCustomerByCustomernameContaining", query = "select myCustomer from Customer myCustomer where myCustomer.customername like ?1"),
		@NamedQuery(name = "findCustomerByCustomernumber", query = "select myCustomer from Customer myCustomer where myCustomer.customernumber = ?1"),
		@NamedQuery(name = "findCustomerByPhone", query = "select myCustomer from Customer myCustomer where myCustomer.phone = ?1"),
		@NamedQuery(name = "findCustomerByPhoneContaining", query = "select myCustomer from Customer myCustomer where myCustomer.phone like ?1"),
		@NamedQuery(name = "findCustomerByPostalcode", query = "select myCustomer from Customer myCustomer where myCustomer.postalcode = ?1"),
		@NamedQuery(name = "findCustomerByPostalcodeContaining", query = "select myCustomer from Customer myCustomer where myCustomer.postalcode like ?1"),
		@NamedQuery(name = "findCustomerByPrimaryKey", query = "select myCustomer from Customer myCustomer where myCustomer.customernumber = ?1"),
		@NamedQuery(name = "findCustomerBySalesrepemployeenumber", query = "select myCustomer from Customer myCustomer where myCustomer.salesrepemployeenumber = ?1"),
		@NamedQuery(name = "findCustomerByState", query = "select myCustomer from Customer myCustomer where myCustomer.state = ?1"),
		@NamedQuery(name = "findCustomerByStateContaining", query = "select myCustomer from Customer myCustomer where myCustomer.state like ?1") })
@Table(schema = "CLASSICCARS", name = "CUSTOMER")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "demo/apps/domain", name = "Customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "CUSTOMERNUMBER", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer customernumber;
	/**
	 */

	@Column(name = "CUSTOMERNAME", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String customername;
	/**
	 */

	@Column(name = "CONTACTLASTNAME", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String contactlastname;
	/**
	 */

	@Column(name = "CONTACTFIRSTNAME", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String contactfirstname;
	/**
	 */

	@Column(name = "PHONE", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String phone;
	/**
	 */

	@Column(name = "ADDRESSLINE1", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String addressline1;
	/**
	 */

	@Column(name = "ADDRESSLINE2", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String addressline2;
	/**
	 */

	@Column(name = "CITY", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String city;
	/**
	 */

	@Column(name = "STATE", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String state;
	/**
	 */

	@Column(name = "POSTALCODE", length = 15)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String postalcode;
	/**
	 */

	@Column(name = "COUNTRY", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String country;
	/**
	 */

	@Column(name = "SALESREPEMPLOYEENUMBER")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer salesrepemployeenumber;
	/**
	 */

	@Column(name = "CREDITLIMIT", precision = 52)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal creditlimit;

	/**
	 */
	public void setCustomernumber(Integer customernumber) {
		this.customernumber = customernumber;
	}

	/**
	 */
	public Integer getCustomernumber() {
		return this.customernumber;
	}

	/**
	 */
	public void setCustomername(String customername) {
		this.customername = customername;
	}

	/**
	 */
	public String getCustomername() {
		return this.customername;
	}

	/**
	 */
	public void setContactlastname(String contactlastname) {
		this.contactlastname = contactlastname;
	}

	/**
	 */
	public String getContactlastname() {
		return this.contactlastname;
	}

	/**
	 */
	public void setContactfirstname(String contactfirstname) {
		this.contactfirstname = contactfirstname;
	}

	/**
	 */
	public String getContactfirstname() {
		return this.contactfirstname;
	}

	/**
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 */
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	/**
	 */
	public String getAddressline1() {
		return this.addressline1;
	}

	/**
	 */
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	/**
	 */
	public String getAddressline2() {
		return this.addressline2;
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
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	/**
	 */
	public String getPostalcode() {
		return this.postalcode;
	}

	/**
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 */
	public String getCountry() {
		return this.country;
	}

	/**
	 */
	public void setSalesrepemployeenumber(Integer salesrepemployeenumber) {
		this.salesrepemployeenumber = salesrepemployeenumber;
	}

	/**
	 */
	public Integer getSalesrepemployeenumber() {
		return this.salesrepemployeenumber;
	}

	/**
	 */
	public void setCreditlimit(BigDecimal creditlimit) {
		this.creditlimit = creditlimit;
	}

	/**
	 */
	public BigDecimal getCreditlimit() {
		return this.creditlimit;
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
		setCustomernumber(that.getCustomernumber());
		setCustomername(that.getCustomername());
		setContactlastname(that.getContactlastname());
		setContactfirstname(that.getContactfirstname());
		setPhone(that.getPhone());
		setAddressline1(that.getAddressline1());
		setAddressline2(that.getAddressline2());
		setCity(that.getCity());
		setState(that.getState());
		setPostalcode(that.getPostalcode());
		setCountry(that.getCountry());
		setSalesrepemployeenumber(that.getSalesrepemployeenumber());
		setCreditlimit(that.getCreditlimit());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("customernumber=[").append(customernumber).append("] ");
		buffer.append("customername=[").append(customername).append("] ");
		buffer.append("contactlastname=[").append(contactlastname).append("] ");
		buffer.append("contactfirstname=[").append(contactfirstname).append("] ");
		buffer.append("phone=[").append(phone).append("] ");
		buffer.append("addressline1=[").append(addressline1).append("] ");
		buffer.append("addressline2=[").append(addressline2).append("] ");
		buffer.append("city=[").append(city).append("] ");
		buffer.append("state=[").append(state).append("] ");
		buffer.append("postalcode=[").append(postalcode).append("] ");
		buffer.append("country=[").append(country).append("] ");
		buffer.append("salesrepemployeenumber=[").append(salesrepemployeenumber).append("] ");
		buffer.append("creditlimit=[").append(creditlimit).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((customernumber == null) ? 0 : customernumber.hashCode()));
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
		if ((customernumber == null && equalCheck.customernumber != null) || (customernumber != null && equalCheck.customernumber == null))
			return false;
		if (customernumber != null && !customernumber.equals(equalCheck.customernumber))
			return false;
		return true;
	}
}
