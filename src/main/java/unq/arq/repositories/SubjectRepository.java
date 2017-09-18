package unq.arq.repositories;

import unq.arq.model.Subject;

public class SubjectRepository extends HibernateGenericDAO<Subject> 
	implements GenericRepository<Subject> {

	private static final long serialVersionUID = 2618278816622609666L;

	@Override
	protected Class<Subject> getDomainClass() {
		return Subject.class;
	}
}
