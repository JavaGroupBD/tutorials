package com.zaghir.project.hellocucumber.service;

import java.util.List;

import com.zaghir.project.hellocucumber.bean.Abonne;
import com.zaghir.project.hellocucumber.bean.Adresse;
import com.zaghir.project.hellocucumber.bean.Contrat;

public class ContratServiceImpl implements ContratService {
	
	public List<Contrat> getlistContratAbonne(Abonne abonne ) {
		
		return FactoryContrat.getListContratAbonne(abonne) ;
	}

	public void  modifierAdresseAbonne(Abonne abonne , Adresse nouvelleAdresse) {
		
		List<Contrat> list  = getlistContratAbonne( abonne );
		
		for (Contrat contrat : list) {
			contrat.setAdresse(nouvelleAdresse);
		}
	}
}
