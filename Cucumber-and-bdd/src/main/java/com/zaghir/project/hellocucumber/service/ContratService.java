package com.zaghir.project.hellocucumber.service;

import com.zaghir.project.hellocucumber.bean.Abonne;
import com.zaghir.project.hellocucumber.bean.Adresse;

public interface ContratService {
	
	public void  modifierAdresseAbonne(Abonne abonne , Adresse nouvelleAdresse);
}
