package com.zaghir.project.hellocucumber.service;

import com.zaghir.project.hellocucumber.bean.Abonne;
import com.zaghir.project.hellocucumber.bean.Adresse;

public interface AdresseService {
	
	public void changementAdressePricipale(Abonne abonne , Adresse nouvelleAdresse);

}
