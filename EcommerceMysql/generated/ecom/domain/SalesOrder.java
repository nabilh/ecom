package ecom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllSalesOrders", query = "select mySalesOrder from SalesOrder mySalesOrder"),
		@NamedQuery(name = "findSalesOrderByDateCreated", query = "select mySalesOrder from SalesOrder mySalesOrder where mySalesOrder.dateCreated = ?1"),
		@NamedQuery(name = "findSalesOrderByDateCreatedAfter", query = "select mySalesOrder from SalesOrder mySalesOrder where mySalesOrder.dateCreated > ?1"),
		@NamedQuery(name = "findSalesOrderByDateCreatedBefore", query = "select mySalesOrder from SalesOrder mySalesOrder where mySalesOrder.dateCreated < ?1"),
		@NamedQuery(name = "findSalesOrderById", query = "select mySalesOrder from SalesOrder mySalesOrder where mySalesOrder.id = ?1"),
		@NamedQuery(name = "findSalesOrderByPrimaryKey", query = "select mySalesOrder from SalesOrder mySalesOrder where mySalesOrder.id = ?1") })
@Table(catalog = "ecommerce", name = "sales_order")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "EcommerceMysql/ecom/domain", name = "SalesOrder")
@XmlRootElement(namespace = "EcommerceMysql/ecom/domain")
public class SalesOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer id;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "date_created")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar dateCreated;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "customer_id", referencedColumnName = "id") })
	@XmlTransient
	Customer customer;
	/**
	 */
	@OneToMany(mappedBy = "salesOrder", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<ecom.domain.OrderLine> orderLines;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setDateCreated(Calendar dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 */
	public Calendar getDateCreated() {
		return this.dateCreated;
	}

	/**
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 */
	@JsonIgnore
	public Customer getCustomer() {
		return customer;
	}

	/**
	 */
	public void setOrderLines(Set<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}

	/**
	 */
	@JsonIgnore
	public Set<OrderLine> getOrderLines() {
		if (orderLines == null) {
			orderLines = new java.util.LinkedHashSet<ecom.domain.OrderLine>();
		}
		return orderLines;
	}

	/**
	 */
	public SalesOrder() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(SalesOrder that) {
		setId(that.getId());
		setDateCreated(that.getDateCreated());
		setCustomer(that.getCustomer());
		setOrderLines(new java.util.LinkedHashSet<ecom.domain.OrderLine>(that.getOrderLines()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("dateCreated=[").append(dateCreated).append("] ");

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
		if (!(obj instanceof SalesOrder))
			return false;
		SalesOrder equalCheck = (SalesOrder) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
