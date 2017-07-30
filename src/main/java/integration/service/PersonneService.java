package integration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import integration.dao.IPersonneDao;
import integration.domaine.Personne;

@Service("personneService")
public class PersonneService implements IPersonneService {

	@Autowired
	private final IPersonneDao dao;

	@Autowired
	public PersonneService(IPersonneDao dao) {
		this.dao = dao;
	}

	public void savePersonne(Personne personne) {
		dao.save(personne);
	}

	public IPersonneDao getDao() {
		return dao;
	}

}
