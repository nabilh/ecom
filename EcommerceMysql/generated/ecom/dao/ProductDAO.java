package ecom.dao;

import ecom.domain.Product;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Product entities.
 * 
 */
public interface ProductDAO extends JpaDao<Product> {

	/**
	 * JPQL Query - findProductByCategory
	 *
	 */
	public Set<Product> findProductByCategory(String category) throws DataAccessException;

	/**
	 * JPQL Query - findProductByCategory
	 *
	 */
	public Set<Product> findProductByCategory(String category, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByBrand
	 *
	 */
	public Set<Product> findProductByBrand(String brand) throws DataAccessException;

	/**
	 * JPQL Query - findProductByBrand
	 *
	 */
	public Set<Product> findProductByBrand(String brand, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByCategoryContaining
	 *
	 */
	public Set<Product> findProductByCategoryContaining(String category_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductByCategoryContaining
	 *
	 */
	public Set<Product> findProductByCategoryContaining(String category_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByColor
	 *
	 */
	public Set<Product> findProductByColor(String color) throws DataAccessException;

	/**
	 * JPQL Query - findProductByColor
	 *
	 */
	public Set<Product> findProductByColor(String color, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllProducts
	 *
	 */
	public Set<Product> findAllProducts() throws DataAccessException;

	/**
	 * JPQL Query - findAllProducts
	 *
	 */
	public Set<Product> findAllProducts(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByName
	 *
	 */
	public Set<Product> findProductByName(String name) throws DataAccessException;

	/**
	 * JPQL Query - findProductByName
	 *
	 */
	public Set<Product> findProductByName(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByColorContaining
	 *
	 */
	public Set<Product> findProductByColorContaining(String color_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductByColorContaining
	 *
	 */
	public Set<Product> findProductByColorContaining(String color_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByNameContaining
	 *
	 */
	public Set<Product> findProductByNameContaining(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductByNameContaining
	 *
	 */
	public Set<Product> findProductByNameContaining(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductById
	 *
	 */
	public Product findProductById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findProductById
	 *
	 */
	public Product findProductById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByPrimaryKey
	 *
	 */
	public Product findProductByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductByPrimaryKey
	 *
	 */
	public Product findProductByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByPartNumber
	 *
	 */
	public Set<Product> findProductByPartNumber(Integer partNumber) throws DataAccessException;

	/**
	 * JPQL Query - findProductByPartNumber
	 *
	 */
	public Set<Product> findProductByPartNumber(Integer partNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByBrandContaining
	 *
	 */
	public Set<Product> findProductByBrandContaining(String brand_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductByBrandContaining
	 *
	 */
	public Set<Product> findProductByBrandContaining(String brand_1, int startResult, int maxRows) throws DataAccessException;

}