package unq.arq.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class HibernateGenericDAO<T> extends HibernateDaoSupport implements 
	GenericRepository<T>, Serializable {

	private static final long serialVersionUID = 8056886341688504299L;
	protected Class<T> persistentClass= this.getDomainClass();
	
	protected abstract Class<T> getDomainClass();
	
	@Override
	public void save(T entity) {
		getHibernateTemplate().save(entity);
		getHibernateTemplate().flush();
	}

	@Override
	public void delete(T entity) {
		getHibernateTemplate().delete(entity);
	}

	@Override
	public void update(T entity) {
		getHibernateTemplate().update(entity);
	}

	@Override
	public T findBy(Serializable id) {
		return getHibernateTemplate().get(persistentClass, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		return getHibernateTemplate().find("from " + this.persistentClass.getName() + " o");
	}

	@Override
	public void deleteById(Serializable id) {
		delete(findBy(id));
	}

	@Override
	public int count() {
		return findAll().size();
	}
}
