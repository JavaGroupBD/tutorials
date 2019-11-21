package com.zaghir.project.hellocucumber.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Contrat {

	private Integer refContrat ;
	private Integer idAbonne ;
	private Adresse adresse ;
}
