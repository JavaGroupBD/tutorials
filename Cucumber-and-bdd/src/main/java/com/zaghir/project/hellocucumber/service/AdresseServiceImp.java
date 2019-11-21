package com.zaghir.project.hellocucumber.service;

import com.zaghir.project.hellocucumber.bean.Abonne;
import com.zaghir.project.hellocucumber.bean.Adresse;
import com.zaghir.project.hellocucumber.bean.StatusAdresse;

public class AdresseServiceImp implements AdresseService{
	
	private ContratService contratService = new ContratServiceImpl(); 
	
	public void changementAdressePricipale(Abonne abonne , Adresse nouvelleAdresse) {
		
		if(StatusAdresse.ACTIVE.equals(abonne.getAdresseActive())) {
			
			abonne.setAdresse(nouvelleAdresse);
			
			contratService.modifierAdresseAbonne(abonne, nouvelleAdresse);
		}
	}

}
