package ecom.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

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
		@NamedQuery(name = "findAllProducts", query = "select myProduct from Product myProduct"),
		@NamedQuery(name = "findProductByBrand", query = "select myProduct from Product myProduct where myProduct.brand = ?1"),
		@NamedQuery(name = "findProductByBrandContaining", query = "select myProduct from Product myProduct where myProduct.brand like ?1"),
		@NamedQuery(name = "findProductByCategory", query = "select myProduct from Product myProduct where myProduct.category = ?1"),
		@NamedQuery(name = "findProductByCategoryContaining", query = "select myProduct from Product myProduct where myProduct.category like ?1"),
		@NamedQuery(name = "findProductByColor", query = "select myProduct from Product myProduct where myProduct.color = ?1"),
		@NamedQuery(name = "findProductByColorContaining", query = "select myProduct from Product myProduct where myProduct.color like ?1"),
		@NamedQuery(name = "findProductById", query = "select myProduct from Product myProduct where myProduct.id = ?1"),
		@NamedQuery(name = "findProductByName", query = "select myProduct from Product myProduct where myProduct.name = ?1"),
		@NamedQuery(name = "findProductByNameContaining", query = "select myProduct from Product myProduct where myProduct.name like ?1"),
		@NamedQuery(name = "findProductByPartNumber", query = "select myProduct from Product myProduct where myProduct.partNumber = ?1"),
		@NamedQuery(name = "findProductByPrimaryKey", query = "select myProduct from Product myProduct where myProduct.id = ?1") })
@Table(catalog = "ecommerce", name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "EcommerceMysql/ecom/domain", name = "Product")
@XmlRootElement(namespace = "EcommerceMysql/ecom/domain")
public class Product implements Serializable {
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

	@Column(name = "part_number", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer partNumber;
	/**
	 */

	@Column(name = "color", length = 8)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String color;
	/**
	 */

	@Column(name = "brand", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String brand;
	/**
	 */

	@Column(name = "category", length = 14)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String category;
	/**
	 */

	@Column(name = "name", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;

	/**
	 */
	@OneToMany(mappedBy = "product", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
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
	public void setPartNumber(Integer partNumber) {
		this.partNumber = partNumber;
	}

	/**
	 */
	public Integer getPartNumber() {
		return this.partNumber;
	}

	/**
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 */
	public String getBrand() {
		return this.brand;
	}

	/**
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 */
	public String getCategory() {
		return this.category;
	}

	/**
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
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
	public Product() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Product that) {
		setId(that.getId());
		setPartNumber(that.getPartNumber());
		setColor(that.getColor());
		setBrand(that.getBrand());
		setCategory(that.getCategory());
		setName(that.getName());
		setOrderLines(new java.util.LinkedHashSet<ecom.domain.OrderLine>(that.getOrderLines()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("partNumber=[").append(partNumber).append("] ");
		buffer.append("color=[").append(color).append("] ");
		buffer.append("brand=[").append(brand).append("] ");
		buffer.append("category=[").append(category).append("] ");
		buffer.append("name=[").append(name).append("] ");

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
		if (!(obj instanceof Product))
			return false;
		Product equalCheck = (Product) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
