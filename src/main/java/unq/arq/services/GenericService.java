package unq.arq.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import unq.arq.repositories.GenericRepository;

public class GenericService<T> implements Serializable {

	private static final long serialVersionUID = 8140957998463868514L;
	private GenericRepository<T> repository;
	
	public GenericRepository<T> getRepository() {
		return repository;
	}
	public void setRepository(GenericRepository<T> repository) {
		this.repository = repository;
	}
	
	@Transactional
	public void save(final T object) {
		getRepository().save(object);
	}
	
	@Transactional
	public void delete(final T object) {
		getRepository().delete(object);
	}
	
	@Transactional
	public void update(final T object) {
		getRepository().update(object);
	}
	
	@Transactional(readOnly = true)
	public T findBy(Serializable id) {
		return getRepository().findBy(id);
	}
	
	@Transactional(readOnly = true)
	public List<T> retriveAll() {
		return getRepository().findAll();
	}
	
	@Transactional
	public void deleteById(Serializable id) {
		getRepository().deleteById(id);
	}
	
	@Transactional(readOnly = true)
	public int count() {
		return getRepository().count();
	}
}
