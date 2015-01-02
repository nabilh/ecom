package apps.dao;

import apps.domain.Product;

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
 * DAO to manage Product entities.
 * 
 */
@Repository("ProductDAO")
@Transactional
public class ProductDAOImpl extends AbstractJpaDao<Product> implements
		ProductDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Product.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MyEclipse_Derby
	 *
	 */
	@PersistenceContext(unitName = "MyEclipse_Derby")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProductDAOImpl
	 *
	 */
	public ProductDAOImpl() {
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
	 * JPQL Query - findProductByBrand
	 *
	 */
	@Transactional
	public Set<Product> findProductByBrand(String brand) throws DataAccessException {

		return findProductByBrand(brand, -1, -1);
	}

	/**
	 * JPQL Query - findProductByBrand
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByBrand(String brand, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByBrand", startResult, maxRows, brand);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByName
	 *
	 */
	@Transactional
	public Set<Product> findProductByName(String name) throws DataAccessException {

		return findProductByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findProductByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByName", startResult, maxRows, name);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByNameContaining
	 *
	 */
	@Transactional
	public Set<Product> findProductByNameContaining(String name) throws DataAccessException {

		return findProductByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findProductByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByColor
	 *
	 */
	@Transactional
	public Set<Product> findProductByColor(String color) throws DataAccessException {

		return findProductByColor(color, -1, -1);
	}

	/**
	 * JPQL Query - findProductByColor
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByColor(String color, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByColor", startResult, maxRows, color);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByColorContaining
	 *
	 */
	@Transactional
	public Set<Product> findProductByColorContaining(String color) throws DataAccessException {

		return findProductByColorContaining(color, -1, -1);
	}

	/**
	 * JPQL Query - findProductByColorContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByColorContaining(String color, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByColorContaining", startResult, maxRows, color);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByCategory
	 *
	 */
	@Transactional
	public Set<Product> findProductByCategory(String category) throws DataAccessException {

		return findProductByCategory(category, -1, -1);
	}

	/**
	 * JPQL Query - findProductByCategory
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByCategory(String category, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByCategory", startResult, maxRows, category);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllProducts
	 *
	 */
	@Transactional
	public Set<Product> findAllProducts() throws DataAccessException {

		return findAllProducts(-1, -1);
	}

	/**
	 * JPQL Query - findAllProducts
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findAllProducts(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProducts", startResult, maxRows);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByPartNumber
	 *
	 */
	@Transactional
	public Set<Product> findProductByPartNumber(Integer partNumber) throws DataAccessException {

		return findProductByPartNumber(partNumber, -1, -1);
	}

	/**
	 * JPQL Query - findProductByPartNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByPartNumber(Integer partNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByPartNumber", startResult, maxRows, partNumber);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByCategoryContaining
	 *
	 */
	@Transactional
	public Set<Product> findProductByCategoryContaining(String category) throws DataAccessException {

		return findProductByCategoryContaining(category, -1, -1);
	}

	/**
	 * JPQL Query - findProductByCategoryContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByCategoryContaining(String category, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByCategoryContaining", startResult, maxRows, category);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByPrimaryKey
	 *
	 */
	@Transactional
	public Product findProductByPrimaryKey(Integer id) throws DataAccessException {

		return findProductByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findProductByPrimaryKey
	 *
	 */

	@Transactional
	public Product findProductByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductByPrimaryKey", startResult, maxRows, id);
			return (apps.domain.Product) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductById
	 *
	 */
	@Transactional
	public Product findProductById(Integer id) throws DataAccessException {

		return findProductById(id, -1, -1);
	}

	/**
	 * JPQL Query - findProductById
	 *
	 */

	@Transactional
	public Product findProductById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductById", startResult, maxRows, id);
			return (apps.domain.Product) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductByBrandContaining
	 *
	 */
	@Transactional
	public Set<Product> findProductByBrandContaining(String brand) throws DataAccessException {

		return findProductByBrandContaining(brand, -1, -1);
	}

	/**
	 * JPQL Query - findProductByBrandContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByBrandContaining(String brand, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByBrandContaining", startResult, maxRows, brand);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Product entity) {
		return true;
	}
}
