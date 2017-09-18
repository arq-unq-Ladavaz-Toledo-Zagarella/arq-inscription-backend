package unq.arq.repositories;

import unq.arq.model.Inscription;

public class InscriptionRepository extends HibernateGenericDAO<Inscription>
	implements GenericRepository<Inscription> {

	private static final long serialVersionUID = 161111186530974868L;

	@Override
	protected Class<Inscription> getDomainClass() {
		return Inscription.class;
	}
}
