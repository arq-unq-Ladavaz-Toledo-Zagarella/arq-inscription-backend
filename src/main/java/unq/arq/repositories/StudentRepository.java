package unq.arq.repositories;

import unq.arq.model.Student;

public class StudentRepository extends HibernateGenericDAO<Student> 
	implements GenericRepository<Student> {

	private static final long serialVersionUID = 4375107309997037201L;

	@Override
	protected Class<Student> getDomainClass() {
		return Student.class;
	}
}
