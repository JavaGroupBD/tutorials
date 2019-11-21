package com.zaghir.project.hellocucumber.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Abonne {
	private Integer id ; 
	private String nom ;
	private String prenom ;
	private Adresse adresse ;
	private Canal canal ;
	private Condition condition ;
	private StatusAdresse adresseActive ;

}
