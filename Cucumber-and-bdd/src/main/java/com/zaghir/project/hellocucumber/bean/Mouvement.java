package com.zaghir.project.hellocucumber.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Mouvement {
	
	private Integer id ;
	private Integer idAbonne;
	private Integer idContrat ;
	private TypeMouvement typeMouvement;
	private Date createdAt ;

}
