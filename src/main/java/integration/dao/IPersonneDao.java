package integration.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import integration.domaine.Personne;


public interface IPersonneDao extends JpaRepository<Personne, Integer>{

}
