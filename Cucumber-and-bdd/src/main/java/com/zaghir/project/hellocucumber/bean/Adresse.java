package com.zaghir.project.hellocucumber.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Adresse {
	
	private Integer id ; 
	private String adresse ;
	private String ville ;
	private String codePostal ;
	private String Pays ;

}
