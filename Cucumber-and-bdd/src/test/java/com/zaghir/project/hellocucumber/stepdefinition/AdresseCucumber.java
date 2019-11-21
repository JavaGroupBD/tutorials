package com.zaghir.project.hellocucumber.stepdefinition;

import com.zaghir.project.hellocucumber.bean.Abonne;
import com.zaghir.project.hellocucumber.bean.Adresse;
import com.zaghir.project.hellocucumber.bean.Canal;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdresseCucumber {

	private Abonne abonne ;
	@Given("un abonné avec une adresse principale \\w* en \\w*")
	public void un_abonne_avec_une_adresse_principale_active_en_pays(String active , String pays) {
	    
		
	}
	
	

	@When("le conseiller connecté à FACE modifie l adresse de l abonné <Condition>")
	public void le_conseiller_connecté_à_FACE_modifie_l_adresse_de_l_abonné_Condition() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();	    
	}
	
	@When("le conseiller connecté à EC modifie l adresse de l abonné <Condition>")
	public void le_conseiller_connecté_à_EC_modifie_l_adresse_de_l_abonné_Condition() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("l adresse de l abonné modifiée est enregistrée sur l'ensemble des contrats de l abonné")
	public void l_adresse_de_l_abonné_modifiée_est_enregistrée_sur_l_ensemble_des_contrats_de_l_abonné() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("un mouvement de modification d adresse est créé")
	public void un_mouvement_de_modification_d_adresse_est_créé() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	

	

	

}
