package ecom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

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
		@NamedQuery(name = "findAllOrderLines", query = "select myOrderLine from OrderLine myOrderLine"),
		@NamedQuery(name = "findOrderLineById", query = "select myOrderLine from OrderLine myOrderLine where myOrderLine.id = ?1"),
		@NamedQuery(name = "findOrderLineByPrimaryKey", query = "select myOrderLine from OrderLine myOrderLine where myOrderLine.id = ?1"),
		@NamedQuery(name = "findOrderLineByQuantity", query = "select myOrderLine from OrderLine myOrderLine where myOrderLine.quantity = ?1") })
@Table(catalog = "ecommerce", name = "order_line")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "EcommerceMysql/ecom/domain", name = "OrderLine")
public class OrderLine implements Serializable {
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

	@Column(name = "quantity")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer quantity;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "order_id", referencedColumnName = "id") })
	@XmlTransient
	SalesOrder salesOrder;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "product_id", referencedColumnName = "id") })
	@XmlTransient
	Product product;

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
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 */
	public Integer getQuantity() {
		return this.quantity;
	}

	/**
	 */
	public void setSalesOrder(SalesOrder salesOrder) {
		this.salesOrder = salesOrder;
	}

	/**
	 */
	@JsonIgnore
	public SalesOrder getSalesOrder() {
		return salesOrder;
	}

	/**
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 */
	@JsonIgnore
	public Product getProduct() {
		return product;
	}

	/**
	 */
	public OrderLine() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(OrderLine that) {
		setId(that.getId());
		setQuantity(that.getQuantity());
		setSalesOrder(that.getSalesOrder());
		setProduct(that.getProduct());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("quantity=[").append(quantity).append("] ");

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
		if (!(obj instanceof OrderLine))
			return false;
		OrderLine equalCheck = (OrderLine) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
