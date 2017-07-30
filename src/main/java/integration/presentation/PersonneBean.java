package integration.presentation;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import antlr.collections.List;
import integration.domaine.Personne;
import integration.service.IPersonneService;

@Controller
@Scope("session")
public class PersonneBean {

    @Autowired
	private IPersonneService personneService;
//	private List personneList;
	private Personne personne;
	
	
	@PostConstruct
    public void init(){
//		personneList = new List();
		personne = new Personne();
    }


	public Personne getPersonne() {
		return personne;
	}


	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	@RequestMapping("/ajouterunepersonne")
    public String save(){
        
		personneService.savePersonne(personne);
        return "home";
    }
	
	
}
